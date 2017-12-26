package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@NotEmpty
	@Column(name = "fullname")
	private String fullname;
	
	@NotEmpty
	@Column(name = "gender")
	private int gender;
	
	@NotEmpty
	@Column(name = "age")
	private int age;
	
	@NotEmpty
	@Column(name = "address")
	private String address;

	@NotEmpty
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	
	@NotEmpty
	@Column(name = "dateJoin")
	private Date dateJoin;
	
	@NotEmpty
	@Column(name = "image")
	private String image;
	
	@NotEmpty
	@Column(name = "money")
	private int money;
	
	@NotEmpty
	@Column(name = "indentityCard")
	private Long indentityCard;
	
	@NotEmpty
	@Column(name = "phone")
	private String phone;
	
	@Email
	@NotEmpty
	@Column(name = "email")
	private String email;
	
	@NotEmpty
	@Column(name = "password")
	private String password;
	
	@NotEmpty
	@Column(name = "role")
	private int role;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateJoin() {
		return dateJoin;
	}

	public void setDateJoin(Date dateJoin) {
		this.dateJoin = dateJoin;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Long getIndentityCard() {
		return indentityCard;
	}

	public void setIndentityCard(Long indentityCard) {
		this.indentityCard = indentityCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
}
