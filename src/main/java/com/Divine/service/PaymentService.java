package com.Divine.service;

import com.stripe.exception.StripeException;
import com.Divine.model.Order;
import com.Divine.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
