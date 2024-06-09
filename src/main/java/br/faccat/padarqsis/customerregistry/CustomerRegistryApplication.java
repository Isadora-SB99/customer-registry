package br.faccat.padarqsis.customerregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerRegistryApplication.class, args);
    }

//    @Bean
//    CommandLineRunner demo1(MessageProducer messageProducer) {
//        return args -> {
//            messageProducer.sendMessageToQueue1("Olá da Fila 1!");
//            messageProducer.sendMessageToQueue2("Saudações da Fila 2!");
//        };
//    }
}
