package com.example.testowaniehibernate.Order.domain;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface KoszykRepository extends ListCrudRepository<Koszyk, Long> {
    @Modifying
    @Query("DELETE FROM Koszyk k WHERE k.createdAt < :threeDaysAgo")
    void deleteKoszykOlderThanThreeDays(@Param("threeDaysAgo") Date threeDaysAgo);
}