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

import com.user.entity.PaymentLoginEntity;
import com.user.entity.UserEntity;
import com.user.repository.PaymentLoginRepository;
import com.user.service.PaymentLoginService;


@RestController
@CrossOrigin("*")
@RequestMapping("login")
public class PaymentLoginController {
	
	@Autowired
	private PaymentLoginService paymentLoginService;
	
	//add data
	@PostMapping("/add")
	public PaymentLoginEntity add(@RequestBody PaymentLoginEntity paymentLoginEntity) {
		PaymentLoginEntity addData = paymentLoginService.addData(paymentLoginEntity);
		return addData;
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<PaymentLoginEntity>> readAll(){
		List<PaymentLoginEntity> list = (List<PaymentLoginEntity>)this.paymentLoginService.getAll();
		return ResponseEntity.of(Optional.of(list));
	}

}
