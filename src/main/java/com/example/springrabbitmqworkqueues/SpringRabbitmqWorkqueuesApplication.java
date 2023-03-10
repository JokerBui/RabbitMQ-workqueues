package com.example.springrabbitmqworkqueues;

import com.example.springrabbitmqworkqueues.sender.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRabbitmqWorkqueuesApplication  implements CommandLineRunner {

    @Autowired
    private Producer producer;
    public static void main(String[] args) {
        SpringApplication.run(SpringRabbitmqWorkqueuesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 10000; i < 10010; i++) {
            producer.sendMsg(i);
        }
    }
}
