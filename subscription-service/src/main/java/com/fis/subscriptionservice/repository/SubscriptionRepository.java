package com.fis.subscriptionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.subscriptionservice.model.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, String> {

}
