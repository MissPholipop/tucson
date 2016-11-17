package com.piano.common;

import java.util.List;



public interface ComService<T> {
	public List<T> queryAll();
	/**
	 * 分页查询基本信息
	 * @param pageNo
	 * @param row
	 * @return
	 */
	public List<T> queryByPage(int pageNo, int row);
	/**
	 * 根据编号查询基本信息
	 * @param TId
	 * @return
	 */
	public T findById(Integer tId);
	/**
	 * 根据基本登录账户查询基本信息
	 * @param nickName
	 * @return
	 */
	public T findByName(String nickName);
	/**
	 * 添加管路员信息
	 * @param T
	 */
	public void insert(T t);
	/**
	 * 更新基本信息
	 * @param T
	 */
	public void update(T t);
	/**
	 * 删除基本信息
	 * @param T
	 */
	public void delete(T t);
}
