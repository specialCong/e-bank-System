package iss.bank.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer userinfoId;
	private User user;
	private String username;
	private String identityNum;
	private String gender;
	private String address;
	private String telephone;
	private String birthday;
	private Set cards = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(User user, String username, String identityNum) {
		this.user = user;
		this.username = username;
		this.identityNum = identityNum;
	}

	/** full constructor */
	public Userinfo(User user, String username, String identityNum,
			String gender, String address, String telephone, String birthday,
			Set cards) {
		this.user = user;
		this.username = username;
		this.identityNum = identityNum;
		this.gender = gender;
		this.address = address;
		this.telephone = telephone;
		this.birthday = birthday;
		this.cards = cards;
	}

	// Property accessors

	public Integer getUserinfoId() {
		return this.userinfoId;
	}

	public void setUserinfoId(Integer userinfoId) {
		this.userinfoId = userinfoId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIdentityNum() {
		return this.identityNum;
	}

	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Set getCards() {
		return this.cards;
	}

	public void setCards(Set cards) {
		this.cards = cards;
	}

}