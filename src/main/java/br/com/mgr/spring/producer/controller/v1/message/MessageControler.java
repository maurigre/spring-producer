package br.com.mgr.spring.producer.controller.v1.message;


import br.com.mgr.spring.producer.dto.MessageDto;
import br.com.mgr.spring.producer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api-rabbitmq/v1/messages")
public class MessageControler {

    @Autowired
    private AmqpService service;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/send")
    public void sendToConsummer(@RequestBody MessageDto message){

        service.sendToConsumer(message);
    }

}
