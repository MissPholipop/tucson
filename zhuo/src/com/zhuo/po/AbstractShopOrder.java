package com.zhuo.po;

import java.sql.Timestamp;

/**
 * AbstractShopOrder entity provides the base persistence definition of the
 * ShopOrder entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopOrder implements java.io.Serializable {

	// Fields

	private String orderId;
	private Timestamp orderTime;
	private String orderUser;
	private String address;
	private Integer orderEnd;
	private Integer orderAnarchy;

	// Constructors

	/** default constructor */
	public AbstractShopOrder() {
	}

	/** minimal constructor */
	public AbstractShopOrder(String orderId) {
		this.orderId = orderId;
	}

	/** full constructor */
	public AbstractShopOrder(String orderId, Timestamp orderTime,
			String orderUser, String address, Integer orderEnd,
			Integer orderAnarchy) {
		this.orderId = orderId;
		this.orderTime = orderTime;
		this.orderUser = orderUser;
		this.address = address;
		this.orderEnd = orderEnd;
		this.orderAnarchy = orderAnarchy;
	}

	// Property accessors

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Timestamp getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderUser() {
		return this.orderUser;
	}

	public void setOrderUser(String orderUser) {
		this.orderUser = orderUser;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getOrderEnd() {
		return this.orderEnd;
	}

	public void setOrderEnd(Integer orderEnd) {
		this.orderEnd = orderEnd;
	}

	public Integer getOrderAnarchy() {
		return this.orderAnarchy;
	}

	public void setOrderAnarchy(Integer orderAnarchy) {
		this.orderAnarchy = orderAnarchy;
	}

}