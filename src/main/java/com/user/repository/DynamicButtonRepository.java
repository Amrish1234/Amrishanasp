package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.user.entity.DynamicButtonEntity;
import com.user.entity.UserEntity;

public interface DynamicButtonRepository extends JpaRepository<DynamicButtonEntity, Integer>{
	
	public DynamicButtonEntity findById(int id);
	
	
	@Query(value="select * from dynamic_button_entity where status=1",nativeQuery = true)
	public List<DynamicButtonEntity> findByStatus();

}
