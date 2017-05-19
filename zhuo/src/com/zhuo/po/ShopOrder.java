package com.zhuo.po;

import java.sql.Timestamp;

/**
 * ShopOrder entity. @author MyEclipse Persistence Tools
 */
public class ShopOrder extends AbstractShopOrder implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShopOrder() {
	}

	/** minimal constructor */
	public ShopOrder(String orderId) {
		super(orderId);
	}

	/** full constructor */
	public ShopOrder(String orderId, Timestamp orderTime, String orderUser,
			String address, Integer orderEnd, Integer orderAnarchy) {
		super(orderId, orderTime, orderUser, address, orderEnd, orderAnarchy);
	}

}
