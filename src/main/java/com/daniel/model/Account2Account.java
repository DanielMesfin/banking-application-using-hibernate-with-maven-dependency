package com.daniel.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Account2Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer transationID;
	
	private String sender;
	
	private String reciver;
	private Double amountPassed;

	private String tType;
	@ManyToOne
	private CreateAccount oneAccountToManyTransaction;
	private String date;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getTransationID() {
		return transationID;
	}
	public void setTransationID(Integer transationID) {
		this.transationID = transationID;
	}
	public CreateAccount getOneAccountToManyTransaction() {
		return oneAccountToManyTransaction;
	}
	public void setOneAccountToManyTransaction(CreateAccount oneAccountToManyTransaction) {
		this.oneAccountToManyTransaction = oneAccountToManyTransaction;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReciver() {
		return reciver;
	}

	public void setReciver(String reciver) {
		this.reciver = reciver;
	}

	public Double getAmountPassed() {
		return amountPassed;
	}

	public void setAmountPassed(Double amountPassed) {
		this.amountPassed = amountPassed;
	}
}
