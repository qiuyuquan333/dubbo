package com.qyq.dubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import service.SendMessageService;

@Service
public class GetMessageService implements SendMessageService {

    @Reference
    SendMessageService sendMessageService;

    @Override
    public String send() {
        return sendMessageService.send();
    }
}
