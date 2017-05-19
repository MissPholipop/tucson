package com.zhuo.po;

/**
 * AbstractShopComment entity provides the base persistence definition of the
 * ShopComment entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopComment implements java.io.Serializable {

	// Fields

	private Integer comId;
	private String comName;
	private String comInfo;

	// Constructors

	/** default constructor */
	public AbstractShopComment() {
	}

	/** minimal constructor */
	public AbstractShopComment(Integer comId) {
		this.comId = comId;
	}

	/** full constructor */
	public AbstractShopComment(Integer comId, String comName, String comInfo) {
		this.comId = comId;
		this.comName = comName;
		this.comInfo = comInfo;
	}

	// Property accessors

	public Integer getComId() {
		return this.comId;
	}

	public void setComId(Integer comId) {
		this.comId = comId;
	}

	public String getComName() {
		return this.comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComInfo() {
		return this.comInfo;
	}

	public void setComInfo(String comInfo) {
		this.comInfo = comInfo;
	}

}