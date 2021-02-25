package br.com.mgr.spring.producer.core.amqp.implementation;

import br.com.mgr.spring.producer.core.amqp.AmqpProducer;
import br.com.mgr.spring.producer.core.dto.MessageDto;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProducerRabbitMQImp implements AmqpProducer<MessageDto> {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.request.routing-key.producer}")
    private String queue;

    @Value("${spring.rabbitmq.request.exchange.producer}")
    private String exchange;

    @Override
    public void producer(MessageDto message) {
        try {
            rabbitTemplate.convertAndSend(exchange, queue, message);

        } catch (Exception ex){
            throw new AmqpRejectAndDontRequeueException(ex);
        }
    }
}
