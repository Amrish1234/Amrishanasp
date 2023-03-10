package com.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaymentDetailEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)	
	
	private int id;
	private String bussinessName;
	private String bussinessEmail;
	private String contact;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBussinessName() {
		return bussinessName;
	}
	public void setBussinessName(String bussinessName) {
		this.bussinessName = bussinessName;
	}
	public String getBussinessEmail() {
		return bussinessEmail;
	}
	public void setBussinessEmail(String bussinessEmail) {
		this.bussinessEmail = bussinessEmail;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public PaymentDetailEntity(int id, String bussinessName, String bussinessEmail, String contact, String firstName,
			String lastName, String address, String city, String country) {
		super();
		this.id = id;
		this.bussinessName = bussinessName;
		this.bussinessEmail = bussinessEmail;
		this.contact = contact;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.country = country;
	}
	public PaymentDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PaymentDetailEntity [id=" + id + ", bussinessName=" + bussinessName + ", bussinessEmail="
				+ bussinessEmail + ", contact=" + contact + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
