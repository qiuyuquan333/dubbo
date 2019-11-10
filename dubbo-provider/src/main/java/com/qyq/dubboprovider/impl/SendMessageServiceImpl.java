package com.qyq.dubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.SendMessageService;

@Service
@Component
public class SendMessageServiceImpl implements SendMessageService {

    @Override
    public String send() {
        return "服务提供方发送消息！";
    }
}
