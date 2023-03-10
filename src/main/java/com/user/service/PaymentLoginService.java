package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.PaymentLoginEntity;
import com.user.repository.PaymentLoginRepository;

@Service
public class PaymentLoginService {
	
	@Autowired
	private PaymentLoginRepository paymentLoginRepository;

	public PaymentLoginEntity addData(PaymentLoginEntity paymentLoginEntity) {
	PaymentLoginEntity add = paymentLoginRepository.save(paymentLoginEntity);
	return add;
	}

	public List<PaymentLoginEntity> getAll() {
		
		List<PaymentLoginEntity> findAll = this.paymentLoginRepository.findAll();
		return findAll;
	}
}
