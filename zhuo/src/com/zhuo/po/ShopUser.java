package com.zhuo.po;

/**
 * ShopUser entity. @author MyEclipse Persistence Tools
 */
public class ShopUser extends AbstractShopUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShopUser() {
	}

	/** minimal constructor */
	public ShopUser(String loginId, String tel, String email) {
		super(loginId, tel, email);
	}

	/** full constructor */
	public ShopUser(String loginId, String loginPwd, String nickName,
			String tel, String email, String address) {
		super(loginId, loginPwd, nickName, tel, email, address);
	}

}
