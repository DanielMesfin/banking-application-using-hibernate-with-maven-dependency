package com.daniel.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity

public class CreateAccount {
	@Id
	private String accountNumber;
	private String fullName;
	private String emailAddress;
	private String password;
	@OneToMany(mappedBy="oneAccountToManyTransaction")
	private List<Account2Account> transactionHistory;
	
	public List<Account2Account> getTransactionHistory() {
		return transactionHistory;
	}

	public void setTransactionHistory(List<Account2Account> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
