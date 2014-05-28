package iss.bank.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Integer adminId;
	private String adminName;
	private String adminPwd;
	private Set adminlogs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** minimal constructor */
	public Admin(String adminName, String adminPwd) {
		this.adminName = adminName;
		this.adminPwd = adminPwd;
	}

	/** full constructor */
	public Admin(String adminName, String adminPwd, Set adminlogs) {
		this.adminName = adminName;
		this.adminPwd = adminPwd;
		this.adminlogs = adminlogs;
	}

	// Property accessors

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPwd() {
		return this.adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public Set getAdminlogs() {
		return this.adminlogs;
	}

	public void setAdminlogs(Set adminlogs) {
		this.adminlogs = adminlogs;
	}

}