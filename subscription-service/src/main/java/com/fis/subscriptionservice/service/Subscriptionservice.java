package com.fis.subscriptionservice.service;

import java.util.List;

import com.fis.subscriptionservice.model.Subscription;

public interface Subscriptionservice {
	
	List<Subscription> getSubscriptions();
	
	void postSubscription(Subscription subscription) throws Exception;

}
