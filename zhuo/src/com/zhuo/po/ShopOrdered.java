package com.zhuo.po;

/**
 * ShopOrdered entity. @author MyEclipse Persistence Tools
 */
public class ShopOrdered extends AbstractShopOrdered implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShopOrdered() {
	}

	/** minimal constructor */
	public ShopOrdered(Integer orderedId) {
		super(orderedId);
	}

	/** full constructor */
	public ShopOrdered(Integer orderedId, Integer orderedQuantity,
			Integer orderedPic, String firms) {
		super(orderedId, orderedQuantity, orderedPic, firms);
	}

}
