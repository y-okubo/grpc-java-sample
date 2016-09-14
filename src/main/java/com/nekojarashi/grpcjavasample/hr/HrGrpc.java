package com.nekojarashi.grpcjavasample.hr;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: hr.proto")
public class HrGrpc {

  private HrGrpc() {}

  public static final String SERVICE_NAME = "hr.Hr";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.nekojarashi.grpcjavasample.hr.EmployeesReply> METHOD_EMPLOYEES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "hr.Hr", "Employees"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.nekojarashi.grpcjavasample.hr.EmployeesReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HrStub newStub(io.grpc.Channel channel) {
    return new HrStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HrBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HrBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static HrFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HrFutureStub(channel);
  }

  /**
   */
  public static abstract class HrImplBase implements io.grpc.BindableService {

    /**
     */
    public void employees(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.nekojarashi.grpcjavasample.hr.EmployeesReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EMPLOYEES, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_EMPLOYEES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.nekojarashi.grpcjavasample.hr.EmployeesReply>(
                  this, METHODID_EMPLOYEES)))
          .build();
    }
  }

  /**
   */
  public static final class HrStub extends io.grpc.stub.AbstractStub<HrStub> {
    private HrStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HrStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HrStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HrStub(channel, callOptions);
    }

    /**
     */
    public void employees(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.nekojarashi.grpcjavasample.hr.EmployeesReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EMPLOYEES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HrBlockingStub extends io.grpc.stub.AbstractStub<HrBlockingStub> {
    private HrBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HrBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HrBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HrBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nekojarashi.grpcjavasample.hr.EmployeesReply employees(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EMPLOYEES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HrFutureStub extends io.grpc.stub.AbstractStub<HrFutureStub> {
    private HrFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HrFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HrFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HrFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nekojarashi.grpcjavasample.hr.EmployeesReply> employees(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EMPLOYEES, getCallOptions()), request);
    }
  }

  private static final int METHODID_EMPLOYEES = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HrImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(HrImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMPLOYEES:
          serviceImpl.employees((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.nekojarashi.grpcjavasample.hr.EmployeesReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_EMPLOYEES);
  }

}
