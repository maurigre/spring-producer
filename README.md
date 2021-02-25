# RABBITMQ - SPRING PRODUCER
O projet RabbitMQ Producer tem a finalidade de disponibilizar uma API Rest que realiza o envio de menssagem para uma fila no RabbitMQ.    

## Tecnologias utilizadas
* Spring Boot
* RabbitMQ 

## Estrutuda de diretorios adotada

* controller: Entry Points 
* core: Regra de negócio
* configurações: Destinado as configurações da aplicação/framework 

## Informações de como o projeto pode ser executado

### - Utilizando terminal:

* Primeiro passo, crie um clone do projeto. Comando : `git clone https://github.com/maurigre/spring-boot-rabbitmq.git`
* Entrar na pasta spring-producer localizada na raiz do projeto e aplicar o comando: `./mvnw clean compile package spring-boot:run`  

## Funcionalidades contidas na API
#### POST
* Envia menssagem: `POST/api-rabbitmq/v1/messages/send` 

### Detalhes
**Body:**

```json
{
  "text": "Ola pessoal"
}
```




