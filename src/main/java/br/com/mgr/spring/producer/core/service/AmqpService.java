package br.com.mgr.spring.producer.core.service;

import br.com.mgr.spring.producer.core.dto.MessageDto;

public interface AmqpService {

    void sendToConsumer(MessageDto message);

}
