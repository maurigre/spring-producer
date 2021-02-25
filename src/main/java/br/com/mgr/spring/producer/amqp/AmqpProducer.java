package br.com.mgr.spring.producer.amqp;

public interface AmqpProducer<T> {
    void producer(T t);
}
