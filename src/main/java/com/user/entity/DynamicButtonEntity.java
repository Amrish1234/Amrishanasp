package com.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DynamicButtonEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private int id;
	private String dynamicButton;
	private boolean status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDynamicButton() {
		return dynamicButton;
	}
	public void setDynamicButton(String dynamicButton) {
		this.dynamicButton = dynamicButton;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public DynamicButtonEntity(int id, String dynamicButton, boolean status) {
		super();
		this.id = id;
		this.dynamicButton = dynamicButton;
		this.status = status;
	}
	public DynamicButtonEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
