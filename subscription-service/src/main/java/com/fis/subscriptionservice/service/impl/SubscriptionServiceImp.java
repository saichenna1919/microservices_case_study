package com.fis.subscriptionservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.subscriptionservice.model.Subscription;
import com.fis.subscriptionservice.repository.SubscriptionRepository;
import com.fis.subscriptionservice.service.Subscriptionservice;

@Service
public class SubscriptionServiceImp implements Subscriptionservice {
	
	@Autowired SubscriptionRepository subscriptionRepository;

	@Override
	public List<Subscription> getSubscriptions() {
		List<Subscription> subscriptions = subscriptionRepository.findAll();
		return subscriptions;
	}

	@Override
	public void postSubscription(Subscription subscription) throws Exception {
		
		List<Subscription> subscriptions = subscriptionRepository.findAll();
		boolean isExist = false;
		for(Subscription subsc : subscriptions) {
			if(subsc.getBookId().equalsIgnoreCase(subscription.getBookId())) {
				isExist = true;
			}
		}
		if(!isExist) {
			subscriptionRepository.saveAndFlush(subscription);
		} else {
			throw new Exception ("Already Exist");
		}
			
	}

}
