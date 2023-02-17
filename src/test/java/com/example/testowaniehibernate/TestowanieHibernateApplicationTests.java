package com.example.testowaniehibernate;

import com.example.testowaniehibernate.Order.domain.Koszyk;
import com.example.testowaniehibernate.Order.domain.KoszykRepository;
import com.example.testowaniehibernate.Order.domain.Order;
import com.example.testowaniehibernate.Order.domain.ScheduledTasks;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestowanieHibernateApplicationTests {

    private KoszykRepository koszykRepository;

    TestowanieHibernateApplicationTests(KoszykRepository koszykRepository) {
        this.koszykRepository = koszykRepository;
    }

    @Test
    void contextLoads() {
    }



    }

