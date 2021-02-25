package br.com.mgr.spring.producer.amqp.implementation;

import br.com.mgr.spring.producer.amqp.AmqpProducer;
import br.com.mgr.spring.producer.dto.MessageDto;
import org.springframework.stereotype.Component;

@Component
public class ProducerRabbitMQImp implements AmqpProducer<MessageDto> {


    @Override
    public void producer(MessageDto messageDto) {

    }
}
