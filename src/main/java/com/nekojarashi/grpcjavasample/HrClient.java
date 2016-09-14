/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nekojarashi.grpcjavasample;

import com.google.protobuf.Empty;
import com.nekojarashi.grpcjavasample.hr.EmployeesReply;
import com.nekojarashi.grpcjavasample.hr.HrGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author y-okubo
 */
public class HrClient {
    private final ManagedChannel channel;
    private final HrGrpc.HrBlockingStub blockingStub;

    public HrClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext(true).build();
        blockingStub = HrGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void getEmployees() {
        EmployeesReply response;
        long begin = System.currentTimeMillis();
        try {
            response = blockingStub.employees(Empty.newBuilder().build());
        } catch (StatusRuntimeException e) {
            System.out.println("RPC failed");
            return;
        }
        System.out.println("Employees: " + response.getEmployeeCount());
    }

    public static void main(String[] args) throws Exception {
        HrClient client = new HrClient("localhost", 50051);
        try {
            client.getEmployees();
        } finally {
            client.shutdown();
        }
    }
}