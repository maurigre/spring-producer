package br.com.mgr.spring.producer.core.amqp;

public interface AmqpProducer<T> {
    void producer(T t);
}
