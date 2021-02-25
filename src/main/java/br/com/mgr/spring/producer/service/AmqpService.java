package br.com.mgr.spring.producer.service;

import br.com.mgr.spring.producer.dto.MessageDto;

public interface AmqpService {

    void sendToConsumer(MessageDto message);

}
