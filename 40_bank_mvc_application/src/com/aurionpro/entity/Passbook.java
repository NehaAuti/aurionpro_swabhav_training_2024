package com.aurionpro.entity;



import java.math.BigDecimal;
import java.sql.Date;

public class Passbook {
    private int id;
    private String senderAccno;
    private String receiverAccno;
    private String transactionType;
    private BigDecimal amount;
    private Date transactionDate;
    private String status; 
    
   

	// Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenderAccno() {
        return senderAccno;
    }

    public void setSenderAccno(String senderAccno) {
        this.senderAccno = senderAccno;
    }

    public String getReceiverAccno() {
        return receiverAccno;
    }

    public void setReceiverAccno(String receiverAccno) {
        this.receiverAccno = receiverAccno;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
