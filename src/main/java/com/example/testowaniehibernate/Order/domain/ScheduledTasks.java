package com.example.testowaniehibernate.Order.domain;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
@EnableScheduling
public class ScheduledTasks {
    @Autowired
    private KoszykRepository koszykRepository;

    @Transactional
    @Scheduled(fixedRate = 1000)
    public void deleteOldKoszyk() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        koszykRepository.deleteKoszykOlderThanThreeDays(cal.getTime());
    }


}