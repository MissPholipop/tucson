package com.piano.service.serviceIml;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.piano.entity.Admin;
import com.piano.entity.base.BaseArgument;
import com.piano.exception.PianoException;
import com.piano.service.AdminService;
import com.piano.service.base.BaseService;
@Service
public class AdminSeviceImpl  extends BaseService implements AdminService{
	 private static final Logger logger =LoggerFactory.getLogger(AdminSeviceImpl.class);
	@Override
	public BaseArgument insert(BaseArgument arg) {
		
		
		 try {
			 Admin entity = (Admin) arg.getObj();
	            int state = dao.insert(getMapper(entity, "insert"), entity);
	            if(state != -1){
	                arg.success().setObj(entity).setNum(state);
	            } else {
	                arg.fail();
	            }
	        } catch(Exception e){
	            logger.error("新增数据失败：" + e.getMessage(), e);
	            arg.fail("新增数据失败");
	        }
	        return arg;
		
	}

	@Override
	public BaseArgument select(BaseArgument arg) {

		 try {
	            Admin entity = (Admin) arg.getObj();
	            List<Admin> dataList = dao.select(getMapper(entity, "select"), entity);
	            if(dataList != null){
	                arg.success().setToRtn("list", dataList);
	            } else {
	                arg.fail();
	            }
	        } catch(Exception e){
	            logger.error("查询数据失败：" + e.getMessage(), e);
	            arg.fail("查询失败");
	        }
	        return arg;
	}

	@Override
	public BaseArgument selectPaging(BaseArgument arg) {
		try {
            Admin entity = (Admin) arg.getObj();
            Page page = (Page) arg.getReq("page");
            List<Admin> dataList = dao.select(getMapper(entity, "select"), entity, new RowBounds(page.getStartRow(), page.getPageSize()));
            if(dataList != null){
                arg.success().setToRtn("list", dataList);
            } else {
                arg.fail();
            }
        } catch(Exception e){
            logger.error("分页查询数据失败：" + e.getMessage(), e);
            arg.fail("分页查询失败");
        }
        return arg;
	}

	@Override
	public BaseArgument update(BaseArgument arg) {
		try {
            Admin entity = (Admin) arg.getObj();
            int state = dao.update(getMapper(entity, "update"), entity);
            if(state != -1){
                arg.success().setObj(entity).setNum(state);
            } else {
                arg.fail();
            }
        } catch(Exception e){
            logger.error("修改数据失败：" + e.getMessage(), e);
            arg.fail("修改数据失败");
        }
        return arg;
	}

	@Override
	public BaseArgument delete(BaseArgument arg) {
	    try {
	    	Admin entity = (Admin) arg.getObj();
            int state = dao.delete(getMapper(entity, "delete"), entity);
            if(state != -1){
                arg.success().setObj(entity).setNum(state);
            } else {
                arg.fail();
            }
        } catch(Exception e){
            logger.error("修改数据失败：" + e.getMessage(), e);
            arg.fail("修改数据失败");
        }
        return arg;
	}
	
}
/*public class AdminSeviceImpl implements AdminService {

	
	@Override
	public void login(Admin admin) throws PianoException {
		
			if(admin.getAdminName()==null){
				throw new PianoException("用户名不为空");
			}
		
		
		
		
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
*/