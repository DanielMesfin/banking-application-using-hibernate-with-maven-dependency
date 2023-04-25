package com.daniel.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AccountBalance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
     private Integer id;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private CreateAccount accountNumber;
	@Column(name="Balance")
private Double accountBalance;
	
public CreateAccount getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(CreateAccount accountNumber) {
		this.accountNumber = accountNumber;
	}
public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
public Double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(Double accountBalance) {
	this.accountBalance = accountBalance;
}
}
