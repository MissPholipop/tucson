package com.zhuo.po;

/**
 * AbstractShopAdmin entity provides the base persistence definition of the
 * ShopAdmin entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopAdmin implements java.io.Serializable {

	// Fields

	private String loginId;
	private String loginPwd;
	private String loginName;

	// Constructors

	/** default constructor */
	public AbstractShopAdmin() {
	}

	/** minimal constructor */
	public AbstractShopAdmin(String loginId) {
		this.loginId = loginId;
	}

	/** full constructor */
	public AbstractShopAdmin(String loginId, String loginPwd, String loginName) {
		this.loginId = loginId;
		this.loginPwd = loginPwd;
		this.loginName = loginName;
	}

	// Property accessors

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPwd() {
		return this.loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

}