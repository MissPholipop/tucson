package com.zhuo.po;

/**
 * ShopComment entity. @author MyEclipse Persistence Tools
 */
public class ShopComment extends AbstractShopComment implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShopComment() {
	}

	/** minimal constructor */
	public ShopComment(Integer comId) {
		super(comId);
	}

	/** full constructor */
	public ShopComment(Integer comId, String comName, String comInfo) {
		super(comId, comName, comInfo);
	}

}
