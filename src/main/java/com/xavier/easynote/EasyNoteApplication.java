package com.xavier.easynote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.EntityListeners;

@SpringBootApplication
@EnableJpaAuditing
public class EasyNoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyNoteApplication.class, args);
    }

}
