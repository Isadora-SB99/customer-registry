package br.faccat.padarqsis.customerregistry;

import br.faccat.padarqsis.customerregistry.message.MessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerRegistryApplication.class, args);
    }

    @Bean
    CommandLineRunner demo1(MessageProducer messageProducer) {
        return args -> {
            messageProducer.sendMessageToQueue1("Olá da Fila 1!");
            messageProducer.sendMessageToQueue2("Saudações da Fila 2!");
        };
    }
}
