package com.zhuo.po;

/**
 * AbstractShopAdress entity provides the base persistence definition of the
 * ShopAdress entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopAdress implements java.io.Serializable {

	// Fields

	private String shopId;
	private String shopAdress;

	// Constructors

	/** default constructor */
	public AbstractShopAdress() {
	}

	/** minimal constructor */
	public AbstractShopAdress(String shopId) {
		this.shopId = shopId;
	}

	/** full constructor */
	public AbstractShopAdress(String shopId, String shopAdress) {
		this.shopId = shopId;
		this.shopAdress = shopAdress;
	}

	// Property accessors

	public String getShopId() {
		return this.shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopAdress() {
		return this.shopAdress;
	}

	public void setShopAdress(String shopAdress) {
		this.shopAdress = shopAdress;
	}

}