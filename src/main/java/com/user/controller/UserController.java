package com.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.UserEntity;
import com.user.service.UserService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/userDetails")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
    
	@Autowired
	private UserService userService;
	
	//add data
	@PostMapping("/add")
	public UserEntity add(@RequestBody UserEntity userEntity) {
		UserEntity addData = userService.addData(userEntity);
		return addData;
		
	}
	
	//get all data
//	@GetMapping("/getAll")
//	public Iterable<UserEntity> getAll(@RequestBody UserEntity userEntity){
//		return this.userService.getAll();
//		
//	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<UserEntity>> readAll(){
		List<UserEntity> list = (List<UserEntity>)this.userService.getAll();
		return ResponseEntity.of(Optional.of(list));
	}
	
	//get single data
//	@GetMapping("/getSingle/{Id}")
//	public Optional<UserEntity> getSingle(@PathVariable Integer Id) {
//		return this.userService.getSingle(Id);
//	}
	
	//delete data
	@DeleteMapping("/delete/{Id}")
	public void deleteSingle(@PathVariable Integer Id) {
		 this.userService.deleteSingle(Id);
	}
	
	//get Status
	@GetMapping("/getStatus")
	public List<UserEntity> getStatus()
	{
		return this.userService.getStatus();
	}
	
	
	@PutMapping("/update/{Id}")
	public UserEntity updateSingle(@PathVariable Integer Id,@RequestBody UserEntity userEntity){
		UserEntity updateSingle = this.userService.updateSingle(Id,userEntity);
		return updateSingle;
	}
}
