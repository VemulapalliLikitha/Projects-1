package com.wallet.model;

import java.time.LocalDate;

public class Account {

	private int accId;
	private long accNo;
	private String accType;
	private double balance;
	private LocalDate date;
	private int custId;
	private String custStatus;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustStatus() {
		return custStatus;
	}
	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accNo=" + accNo + ", accType=" + accType + ", balance=" + balance
				+ ", date=" + date + ", custId=" + custId + ", custStatus=" + custStatus + "]";
	}
	public Account(int accId, long accNo, String accType, double balance, LocalDate date, int custId,
			String custStatus) {
		super();
		this.accId = accId;
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
		this.date = date;
		this.custId = custId;
		this.custStatus = custStatus;
	}
	public Account() {
		
	}
	
	
	
}
