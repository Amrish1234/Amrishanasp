package com.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.PaymentDetailEntity;
import com.user.entity.UserEntity;
import com.user.service.PaymentDetailService;

@RestController
@CrossOrigin("*")
@RequestMapping("/detail")
public class PaymentDetailsController {
	
	@Autowired
	private PaymentDetailService paymentDetailService;
	
	@PostMapping("/add")
	public PaymentDetailEntity add(@RequestBody PaymentDetailEntity paymentDetailEntity) {
		PaymentDetailEntity add = this.paymentDetailService.addData(paymentDetailEntity);
		return add;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<PaymentDetailEntity>> readAll(){
		List<PaymentDetailEntity> list = (List<PaymentDetailEntity>)this.paymentDetailService.getAll();
		return ResponseEntity.of(Optional.of(list));
	}
}
