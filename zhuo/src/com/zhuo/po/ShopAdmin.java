package com.zhuo.po;

/**
 * ShopAdmin entity. @author MyEclipse Persistence Tools
 */
public class ShopAdmin extends AbstractShopAdmin implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShopAdmin() {
	}

	/** minimal constructor */
	public ShopAdmin(String loginId) {
		super(loginId);
	}

	/** full constructor */
	public ShopAdmin(String loginId, String loginPwd, String loginName) {
		super(loginId, loginPwd, loginName);
	}

}
