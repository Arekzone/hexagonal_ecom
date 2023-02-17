package com.example.testowaniehibernate;

import com.example.testowaniehibernate.User.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class TestowanieHibernateApplication{


    public static void main(String[] args) throws IOException {
        SpringApplication.run(TestowanieHibernateApplication.class, args);

        }
    }




