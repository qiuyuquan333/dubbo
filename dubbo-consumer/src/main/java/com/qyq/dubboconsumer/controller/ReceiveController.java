package com.qyq.dubboconsumer.controller;

import com.qyq.dubboconsumer.service.GetMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiveController {

    @Autowired
    private GetMessageService messageService;

    @RequestMapping("/get")
    public String getMessage(){
        return messageService.send();
    }

}
