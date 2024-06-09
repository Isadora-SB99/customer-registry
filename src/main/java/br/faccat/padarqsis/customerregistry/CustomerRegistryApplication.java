package br.faccat.padarqsis.customerregistry;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class CustomerRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerRegistryApplication.class, args);
    }

    //demo-pagamentos-worker

}
