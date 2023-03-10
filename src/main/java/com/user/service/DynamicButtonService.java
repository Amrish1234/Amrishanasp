package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.DynamicButtonEntity;

import com.user.repository.DynamicButtonRepository;

@Service
public class DynamicButtonService {
	
	@Autowired
	private DynamicButtonRepository dynamicButtonRepository;

	public DynamicButtonEntity addData(DynamicButtonEntity dynamicButtonEntity) {
		DynamicButtonEntity add=this.dynamicButtonRepository.save(dynamicButtonEntity);
		return add;
	}

	public List<DynamicButtonEntity> get() {
		List<DynamicButtonEntity> findAll = this.dynamicButtonRepository.findAll();
		return findAll;
	}
	
	
	public DynamicButtonEntity updateSingle(int id, DynamicButtonEntity dynamicButtonEntity){
		DynamicButtonEntity dynamicEntitydb = dynamicButtonRepository.findById(id);
//		userEntitydb.setUserName(userEntity.getUserName());
		dynamicEntitydb.setStatus(((DynamicButtonEntity) dynamicButtonEntity).getStatus());
//		userEntitydb.setAddress(userEntity.getAddress());
		return this.dynamicButtonRepository.save(dynamicEntitydb);
	}
	
	
	public List<DynamicButtonEntity> getStatus(){
		return  this.dynamicButtonRepository.findByStatus();
	}

}
