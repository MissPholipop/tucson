package com.piano.service;

import java.util.List;



import org.springframework.stereotype.Service;

import com.piano.entity.Admin;
import com.piano.entity.base.BaseArgument;
import com.piano.exception.PianoException;
import com.piano.service.base.IBaseService;
/**
 * 管理员信息操作类
 * @author Yanfa
 *
 */
@Service
public interface AdminService extends IBaseService{
	/**
	 * 管理员登录
	 * @param admin 
	 * @throws PianoException 
	 *//*
	public void login(Admin admin) throws PianoException;
	*//**
	 * 查询所有管理员的信息
	 * @return
	 *//*
	public List<Admin> queryAll();
	*//**
	 * 分页查询管理员信息
	 * @param pageNo
	 * @param row
	 * @return
	 *//*
	public List<Admin> queryByPage(int pageNo, int row);
	*//**
	 * 根据编号查询管理员信息
	 * @param adminId
	 * @return
	 *//*
	public Admin findById(Integer adminId);
	*//**
	 * 根据管理员登录账户查询管理员信息
	 * @param nickName
	 * @return
	 *//*
	public Admin findByName(String nickName);
	*//**
	 * 添加管路员信息
	 * @param admin
	 *//*
	public void insert(Admin admin);
	*//**
	 * 更新管理员信息
	 * @param admin
	 *//*
	public void update(Admin admin);
	*//**
	 * 删除管理员信息
	 * @param admin
	 *//*
	public void delete(Admin admin);
*/		 /**
	      * 插入管理员信息
	      * @param arg
	      * @return
	      */
	 	public abstract BaseArgument insert(BaseArgument arg);
	    /**
	     * 查询管理员信息
	     * @param arg
	     * @return
	     */
	    public abstract BaseArgument select(BaseArgument arg);
	    /**
	     * 分页查询管理员信息
	     * @param arg
	     * @return
	     */
	    public abstract BaseArgument selectPaging(BaseArgument arg);
	    /**
	     * 更新管理员信息
	     * @param arg
	     * @return
	     */
	    public abstract BaseArgument update(BaseArgument arg);
	    /**
	     * 删除管理员信息
	     * @param arg
	     * @return
	     */
	    public abstract BaseArgument delete(BaseArgument arg);
	
	
}
