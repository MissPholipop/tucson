package com.zhuo.po;

/**
 * AbstractShopOrdered entity provides the base persistence definition of the
 * ShopOrdered entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopOrdered implements java.io.Serializable {

	// Fields

	private Integer orderedId;
	private Integer orderedQuantity;
	private Integer orderedPic;
	private String firms;

	// Constructors

	/** default constructor */
	public AbstractShopOrdered() {
	}

	/** minimal constructor */
	public AbstractShopOrdered(Integer orderedId) {
		this.orderedId = orderedId;
	}

	/** full constructor */
	public AbstractShopOrdered(Integer orderedId, Integer orderedQuantity,
			Integer orderedPic, String firms) {
		this.orderedId = orderedId;
		this.orderedQuantity = orderedQuantity;
		this.orderedPic = orderedPic;
		this.firms = firms;
	}

	// Property accessors

	public Integer getOrderedId() {
		return this.orderedId;
	}

	public void setOrderedId(Integer orderedId) {
		this.orderedId = orderedId;
	}

	public Integer getOrderedQuantity() {
		return this.orderedQuantity;
	}

	public void setOrderedQuantity(Integer orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public Integer getOrderedPic() {
		return this.orderedPic;
	}

	public void setOrderedPic(Integer orderedPic) {
		this.orderedPic = orderedPic;
	}

	public String getFirms() {
		return this.firms;
	}

	public void setFirms(String firms) {
		this.firms = firms;
	}

}