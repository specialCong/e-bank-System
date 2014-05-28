package iss.bank.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Card entity. @author MyEclipse Persistence Tools
 */

public class Card implements java.io.Serializable {

	// Fields

	private Integer cardId;
	private User user;
	private String cardNum;
	private Double balance;
	private Boolean status;
	private Set records = new HashSet(0);

	// Constructors

	/** default constructor */
	public Card() {
	}

	/** minimal constructor */
	public Card(User user, String cardNum, Double balance, Boolean status) {
		this.user = user;
		this.cardNum = cardNum;
		this.balance = balance;
		this.status = status;
	}

	/** full constructor */
	public Card(User user, String cardNum, Double balance, Boolean status,
			Set records) {
		this.user = user;
		this.cardNum = cardNum;
		this.balance = balance;
		this.status = status;
		this.records = records;
	}

	// Property accessors

	public Integer getCardId() {
		return this.cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Set getRecords() {
		return this.records;
	}

	public void setRecords(Set records) {
		this.records = records;
	}

}