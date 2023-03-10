package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.PaymentDetailEntity;
import com.user.repository.PaymentDetailRepository;
import com.user.repository.PaymentLoginRepository;
@Service
public class PaymentDetailService {
	
	@Autowired
	private PaymentDetailRepository paymentDetailRepository;

	public PaymentDetailEntity addData(PaymentDetailEntity paymentDetailEntity) {
		PaymentDetailEntity save = this.paymentDetailRepository.save(paymentDetailEntity);
		return save;
	}

	public List<PaymentDetailEntity> getAll() {
		List<PaymentDetailEntity> findAll = (List<PaymentDetailEntity>) paymentDetailRepository.findAll();
		return findAll;
	}

}
