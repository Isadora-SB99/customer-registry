package br.faccat.padarqsis.customerregistry.rabbitMQ;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@AllArgsConstructor
@Slf4j
public class CustomerConsumer {

    private CustomerProducer customerProducer;

    @RabbitListener(queues = {"existing-client-queue"})
    public void receive(@Payload Message message){
        log.info("Message " + message + " " + LocalDateTime.now());
        String payload = String.valueOf(message.getPayload());

        customerProducer.generateAnswer("Received successfully: " + payload);
    }
}
