package iss.bank.entity;

/**
 * Adminlog entity. @author MyEclipse Persistence Tools
 */

public class Adminlog implements java.io.Serializable {

	// Fields

	private Integer logId;
	private Admin admin;
	private String logContent;

	// Constructors

	/** default constructor */
	public Adminlog() {
	}

	/** minimal constructor */
	public Adminlog(Admin admin) {
		this.admin = admin;
	}

	/** full constructor */
	public Adminlog(Admin admin, String logContent) {
		this.admin = admin;
		this.logContent = logContent;
	}

	// Property accessors

	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getLogContent() {
		return this.logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

}