package com.zhuo.po;

/**
 * ShopAdress entity. @author MyEclipse Persistence Tools
 */
public class ShopAdress extends AbstractShopAdress implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShopAdress() {
	}

	/** minimal constructor */
	public ShopAdress(String shopId) {
		super(shopId);
	}

	/** full constructor */
	public ShopAdress(String shopId, String shopAdress) {
		super(shopId, shopAdress);
	}

}
