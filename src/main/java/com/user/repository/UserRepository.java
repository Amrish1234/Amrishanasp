package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.user.entity.UserEntity;

import jakarta.transaction.Transactional;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{

	public UserEntity findById(int id);
//	@Modifying
//	@Transactional
//	@Query("Update user1.user_Entity set status = status where id=id")
//	Integer updateStatus(boolean status, int id)
	@Query(value="select * from user_entity where status=1",nativeQuery = true)
	public List<UserEntity> findByStatus();
}
