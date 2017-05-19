package com.zhuo.po;

/**
 * AbstractShopGoods entity provides the base persistence definition of the
 * ShopGoods entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopGoods implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private String goodsName;
	private Double price;
	private Integer goodsType;
	private Integer goodsStatus;
	private String goodsPic;
	private String detail;

	// Constructors

	/** default constructor */
	public AbstractShopGoods() {
	}

	/** minimal constructor */
	public AbstractShopGoods(Integer goodsId) {
		this.goodsId = goodsId;
	}

	/** full constructor */
	public AbstractShopGoods(Integer goodsId, String goodsName, Double price,
			Integer goodsType, Integer goodsStatus, String goodsPic,
			String detail) {
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.price = price;
		this.goodsType = goodsType;
		this.goodsStatus = goodsStatus;
		this.goodsPic = goodsPic;
		this.detail = detail;
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(Integer goodsType) {
		this.goodsType = goodsType;
	}

	public Integer getGoodsStatus() {
		return this.goodsStatus;
	}

	public void setGoodsStatus(Integer goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

	public String getGoodsPic() {
		return this.goodsPic;
	}

	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}