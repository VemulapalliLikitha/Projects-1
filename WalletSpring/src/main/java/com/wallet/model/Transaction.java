package com.wallet.model;

import java.util.Date;

public class Transaction {

	private int custId;
	private int transId;
	private Date transDate;
	private String transType;
	private long fromAccNo;
	private double amount;
	private String description;
	private long toAccNo;
	private String status;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public long getFromAccNo() {
		return fromAccNo;
	}
	public void setFromAccNo(long fromAccNo) {
		this.fromAccNo = fromAccNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getToAccNo() {
		return toAccNo;
	}
	public void setToAccNo(long toAccNo) {
		this.toAccNo = toAccNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Transaction(int custId, int transId, Date transDate, String transType, long fromAccNo, double amount,
			String description, long toAccNo, String status) {
		super();
		this.custId = custId;
		this.transId = transId;
		this.transDate = transDate;
		this.transType = transType;
		this.fromAccNo = fromAccNo;
		this.amount = amount;
		this.description = description;
		this.toAccNo = toAccNo;
		this.status = status;
	}
	public Transaction() {
		
	}
	@Override
	public String toString() {
		return "Transaction [custId=" + custId + ", transId=" + transId + ", transDate=" + transDate + ", transType="
				+ transType + ", fromAccNo=" + fromAccNo + ", amount=" + amount + ", description=" + description
				+ ", toAccNo=" + toAccNo + ", status=" + status + "]";
	}
	
	
}
