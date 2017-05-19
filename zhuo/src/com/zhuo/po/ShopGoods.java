package com.zhuo.po;

/**
 * ShopGoods entity. @author MyEclipse Persistence Tools
 */
public class ShopGoods extends AbstractShopGoods implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShopGoods() {
	}

	/** minimal constructor */
	public ShopGoods(Integer goodsId) {
		super(goodsId);
	}

	/** full constructor */
	public ShopGoods(Integer goodsId, String goodsName, Double price,
			Integer goodsType, Integer goodsStatus, String goodsPic,
			String detail) {
		super(goodsId, goodsName, price, goodsType, goodsStatus, goodsPic,
				detail);
	}

}
