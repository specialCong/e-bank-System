package iss.bank.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userLoginname;
	private String userPwd;
	private String username;
	private String identityNum;
	private String gender;
	private String address;
	private String telephone;
	private String birthday;
	private Set logindates = new HashSet(0);
	private Set cards = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
		this.userId = 0;
		this.address = "";
		this.birthday = "";
		this.gender = "";
		this.identityNum = "";
		this.userLoginname = "";
		this.username = "";
		this.userPwd = "";
		this.telephone = "";
		this.logindates = new HashSet<Logindate>(0);
		this.cards = new HashSet<Card>(0);
	}

	/** minimal constructor */
	public User(String userLoginname, String userPwd, String username,
			String identityNum) {
		this.userLoginname = userLoginname;
		this.userPwd = userPwd;
		this.username = username;
		this.identityNum = identityNum;
	}

	/** full constructor */
	public User(String userLoginname, String userPwd, String username,
			String identityNum, String gender, String address,
			String telephone, String birthday, Set logindates, Set cards) {
		this.userLoginname = userLoginname;
		this.userPwd = userPwd;
		this.username = username;
		this.identityNum = identityNum;
		this.gender = gender;
		this.address = address;
		this.telephone = telephone;
		this.birthday = birthday;
		this.logindates = logindates;
		this.cards = cards;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserLoginname() {
		return this.userLoginname;
	}

	public void setUserLoginname(String userLoginname) {
		this.userLoginname = userLoginname;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
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

	public Set getLogindates() {
		return this.logindates;
	}

	public void setLogindates(Set logindates) {
		this.logindates = logindates;
	}

	public Set getCards() {
		return this.cards;
	}

	public void setCards(Set cards) {
		this.cards = cards;
	}

}