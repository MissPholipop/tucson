package com.zhuo.po;

/**
 * AbstractShopUser entity provides the base persistence definition of the
 * ShopUser entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopUser implements java.io.Serializable {

	// Fields

	private String loginId;
	private String loginPwd;
	private String nickName;
	private String tel;
	private String email;
	private String address;

	// Constructors

	/** default constructor */
	public AbstractShopUser() {
	}

	/** minimal constructor */
	public AbstractShopUser(String loginId, String tel, String email) {
		this.loginId = loginId;
		this.tel = tel;
		this.email = email;
	}

	/** full constructor */
	public AbstractShopUser(String loginId, String loginPwd, String nickName,
			String tel, String email, String address) {
		this.loginId = loginId;
		this.loginPwd = loginPwd;
		this.nickName = nickName;
		this.tel = tel;
		this.email = email;
		this.address = address;
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

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}