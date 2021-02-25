package br.com.mgr.spring.producer.service.implementation;

import br.com.mgr.spring.producer.amqp.AmqpProducer;
import br.com.mgr.spring.producer.dto.MessageDto;
import br.com.mgr.spring.producer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitService implements AmqpService {

    @Autowired
    private AmqpProducer<MessageDto> amqp;

    @Override
    public void sendToConsumer(MessageDto message) {
        amqp.producer(message);
    }
}
