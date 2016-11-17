package com.piano.service.serviceIml;

import java.util.List;

import org.springframework.stereotype.Service;

import com.piano.entity.Admin;
import com.piano.service.AdminService;
@Service
public class AdminSeviceImpl implements AdminService {

	
	@Override
	public void login(Admin admin) {
		
		
	}

	@Override
	public List<Admin> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> queryByPage(int pageNo, int row) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findById(Integer adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findByName(String nickName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Admin admin) {
		// TODO Auto-generated method stub
		
	}

}
