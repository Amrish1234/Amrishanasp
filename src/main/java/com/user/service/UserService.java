package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.user.entity.UserEntity;
import com.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	public UserEntity addData(UserEntity userEntity) {
		UserEntity add = userRepository.save(userEntity);
		return add;
	}
	
	//getAll
	public List< UserEntity> getAll() {
		 List<UserEntity> findAll =  (List<UserEntity>)this.userRepository.findAll();
		return findAll;
	}
	
	//getSingle
	public Optional<UserEntity> getSingle(Integer id) {
		return this.userRepository.findById(id);
	}
	public void deleteSingle(Integer id) {
		this.userRepository.deleteById(id);;
	}
	
	//put
	public UserEntity updateSingle(int id, UserEntity userEntity){
		UserEntity userEntitydb = userRepository.findById(id);
//		userEntitydb.setUserName(userEntity.getUserName());
		userEntitydb.setStatus(((UserEntity) userEntity).getStatus());
//		userEntitydb.setAddress(userEntity.getAddress());
		return this.userRepository.save(userEntitydb);
	}
	
	//get Status
	public List<UserEntity> getStatus(){
		return this.userRepository.findByStatus();
	}
}
