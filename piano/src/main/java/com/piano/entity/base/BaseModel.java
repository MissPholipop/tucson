package com.piano.entity.base;

import java.util.Date;

public class BaseModel {
	protected Integer id;
	protected Date createTime;
	protected Date modifyTime;
	public Integer getId() {
		return id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createtime) {
		this.createTime = createtime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
