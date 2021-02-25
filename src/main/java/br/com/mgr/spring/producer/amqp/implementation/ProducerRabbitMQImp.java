package br.com.mgr.spring.producer.amqp.implementation;

import br.com.mgr.spring.producer.amqp.AmqpProducer;
import br.com.mgr.spring.producer.configuration.ProducerRabbitConfiguration;
import br.com.mgr.spring.producer.dto.MessageDto;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProducerRabbitMQImp implements AmqpProducer<MessageDto> {

    @Value("${spring.rabbitmq.request.routing-key.procuder}")
    private String queue;

    @Value("${spring.rabbitmq.request.exchange.procuder}")
    private String exchange;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void producer(MessageDto message) {
        try {
            rabbitTemplate.convertAndSend(exchange, queue, message);

        } catch (Exception ex){
            throw new AmqpRejectAndDontRequeueException(ex);
        }
    }
}
