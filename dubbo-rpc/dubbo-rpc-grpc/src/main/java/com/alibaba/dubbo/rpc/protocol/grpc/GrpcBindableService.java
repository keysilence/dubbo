package com.alibaba.dubbo.rpc.protocol.grpc;

import io.grpc.BindableService;
import io.grpc.Channel;
import io.grpc.ServerServiceDefinition;

/**
 * Created by Silence on 17/3/1.
 */
public interface GrpcBindableService extends BindableService {

    Channel getChannel();

    void setChannel(Channel channel);

}
