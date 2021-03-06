package com.piano.service.base;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;







import org.apache.ibatis.session.RowBounds;/*
import org.apache.log4j.Logger;*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.piano.dao.base.IBaseDao;
import com.piano.entity.base.BaseArgument;




@Transactional(readOnly = false)
@Service("baseService")
public class BaseService implements IBaseService {
    private static final Logger log = LoggerFactory.getLogger(BaseService.class);
    
    @Resource(name="baseDao")
    protected IBaseDao dao;
    
    public <T> String getMapper(T record, String method) {
    	System.out.println("getMapper"+record.getClass());
        return getMapper(record.getClass(), method);
    }
    
    public <T> String getMapper(Class<?> classz, String method) {
        String name = classz.getSimpleName();
      //  System.out.println(classz.getSimpleName());
        if(!name.endsWith("Mapper")){
            name = name + "Mapper";
        }
        return "com.piano.dao."+name + "." + method;
    }

    /**
     * 新增记录
     */
    public <T> BaseArgument insert(T record) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.insert(getMapper(record, "select"), record);
            br.setObj(record);
            br.setNum(status);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("新增记录异常：" + e.getMessage());
            log.error("新增记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 新增记录
     * 
     * @param record
     * @return
     */
    @Override 
    public <T> BaseArgument insertSelecitve(T record) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.insert(getMapper(record, "insertSelective"), record);
            br.setObj(record);
            br.setNum(status);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
        	//e.printStackTrace();
            br.setMessage("新增记录异常：" + e.getMessage());
            log.error("新增记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 新增记录
     * 
     * @param record
     * @return
     */
    @Override 
    public <T> BaseArgument insert(String mapperId, T record) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.insert(mapperId, record);
            br.setObj(record);
            br.setNum(status);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("新增记录异常：" + e.getMessage());
            log.error("新增记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

	@Override    
    public BaseArgument insertBySelective(Class<?> clasz, Object obj) {
        BaseArgument br = new BaseArgument();
        try {
            String mapperId = getMapper(clasz, "insertBySelective");
            int status = dao.insertBySelect(mapperId, obj);
            br.setNum(status);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("新增记录异常：" + e.getMessage());
            log.error("新增记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 根据主键修改全部属性
     */
    @Override
    public <T> BaseArgument updateByPrimaryKey(T record) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.updateByPrimaryKey(getMapper(record, "updateByPrimaryKey"), record);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
            br.setNum(status);
        } catch (Exception e) {
            br.setMessage("修改记录异常：" + e.getMessage());
            log.error("修改记录异常：" + e.getMessage(), e);
            throw new RuntimeException("修改记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 根据条件修改有效数据
     */
    @Override
    public <T> BaseArgument updateSelective(String mapperId, T record) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.updateSelective(mapperId, record);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
            br.setNum(status);
        } catch (Exception e) {
            br.setMessage("修改记录异常：" + e.getMessage());
            log.error("修改记录异常：" + e.getMessage(), e);
            throw new RuntimeException("修改记录异常：" + e.getMessage());
        }
        return br;
    }
    
    /**
     * 根据主键修改全部属性
     */
    @Override
    public <T> BaseArgument updateByPrimaryKeySelective(T record) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.updateByPrimaryKey(getMapper(record, "updateByPrimaryKeySelective"), record);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
            br.setNum(status);
        } catch (Exception e) {
            br.setMessage("修改记录异常：" + e.getMessage());
            log.error("修改记录异常：" + e.getMessage(), e);
            throw new RuntimeException("修改记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 根据主键修改全部属性
     */
    @Override
    public <T> BaseArgument updateByPrimaryKey(String mapperId, T record) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.updateByPrimaryKey(mapperId, record);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
            br.setNum(status);
        } catch (Exception e) {
            br.setMessage("修改记录异常：" + e.getMessage());
            log.error("修改记录异常：" + e.getMessage(), e);
            throw new RuntimeException("修改记录异常：" + e.getMessage());
        }
        return br;
    }
    
    /**
     * 根据条件修改全部属性
     */
    @Override
    public <T> BaseArgument update(T record) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.update(getMapper(record, "update"), record);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
            br.setNum(status);
        } catch (Exception e) {
            br.setMessage("修改记录异常：" + e.getMessage());
            log.error("修改记录异常：" + e.getMessage(), e);
            throw new RuntimeException("修改记录异常：" + e.getMessage());
        }
        return br;
    }
    
    /**
     * 根据条件修改全部属性
     */
    @Override
    public <T> BaseArgument update(String mapperId, T record) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.update(mapperId, record);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
            br.setNum(status);
        } catch (Exception e) {
            br.setMessage("修改记录异常：" + e.getMessage());
            log.error("修改记录异常：" + e.getMessage(), e);
            throw new RuntimeException("修改记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 根据主键删除
     */
    @Override
    public BaseArgument deleteByPrimaryKey(Class<?> clasz, Object key) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.deleteByPrimaryKey(getMapper(clasz, "deleteByPrimaryKey"), key);
            br.setCode(status >= 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
            br.setNum(status);
        } catch (Exception e) {
            br.setMessage("删除记录异常：" + e.getMessage());
            log.error("删除记录异常：" + e.getMessage(), e);
            throw new RuntimeException("删除记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 根据主键删除
     */
    @Override
    public BaseArgument deleteByPrimaryKey(String mapperId, Object key) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.deleteByPrimaryKey(mapperId, key);
            br.setCode(status >= 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("删除记录异常：" + e.getMessage());
            log.error("删除记录异常：" + e.getMessage(), e);
            throw new RuntimeException("删除记录异常：" + e.getMessage());
        }
        return br;
    }
    
    /**
     * 根据条件删除
     */
    @Override
    public BaseArgument delete(Class<?> clasz, Object key) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.delete(getMapper(clasz, "delete"), key);
            br.setCode(status >= 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
            br.setNum(status);
        } catch (Exception e) {
            br.setMessage("删除记录异常：" + e.getMessage());
            log.error("删除记录异常：" + e.getMessage(), e);
            throw new RuntimeException("删除记录异常：" + e.getMessage());
        }
        return br;
    }
    
    /**
     * 根据条件删除
     */
    @Override
    public BaseArgument delete(String mapperId, Object key) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.delete(mapperId, key);
            br.setCode(status >= 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
            br.setNum(status);
        } catch (Exception e) {
            br.setMessage("删除记录异常：" + e.getMessage());
            log.error("删除记录异常：" + e.getMessage(), e);
            throw new RuntimeException("删除记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 根据主键查询单一记录
     */
    @Override
    public BaseArgument selectByPrimaryKey(Class<?> clasz, Object key) {
        BaseArgument br = new BaseArgument();
        try {
            Object entity = dao.selectByPrimaryKey(getMapper(clasz, "selectByPrimaryKey"), key);
            br.setObj(entity);
            br.setCode(BaseArgument.SUCCESS);
        } catch (Exception e) {
            br.setCode(BaseArgument.FAILED);
            br.setMessage("查询记录异常：" + e.getMessage());
            log.error("查询记录异常：" + e.getMessage(), e);
        }
        return br;
    }

    /**
     * 根据主键查询单一记录
     */
    @Override
    public BaseArgument selectByPrimaryKey(String mapperId, Object key) {
        BaseArgument br = new BaseArgument();
        try {
            Object entity = dao.selectByPrimaryKey(mapperId, key);
            br.setObj(entity);
            br.setCode(BaseArgument.SUCCESS);
        } catch (Exception e) {
            br.setCode(BaseArgument.FAILED);
            br.setMessage("查询记录异常：" + e.getMessage());
            log.error("查询记录异常：" + e.getMessage(), e);
        }
        return br;
    }

    /**
     * 根据条件查询多条记录
     * 
     * @param param
     * @return
     */
    @Override
    public BaseArgument select(Class<?> clasz, Map<String, Object> param) {
        BaseArgument br = new BaseArgument();
        try {
            List list = dao.select(getMapper(clasz, "select"), param);
            br.setToRtn("data", list);
            br.setCode(list != null ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("查询记录异常：" + e.getMessage());
            log.error("查询记录异常：" + e.getMessage(), e);
        }
        return br;
    }
    
    
    
    /**
     * 根据条件查询多条记录
     * 
     * @param param
     * @return
     */
    @Override
    public BaseArgument select(String mapperId, Map<String, Object> param) {
        BaseArgument br = new BaseArgument();
        try {
            List list = dao.select(mapperId, param);
            br.setToRtn("data", list);
            br.setCode(list != null ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("查询记录异常：" + e.getMessage());
            log.error("查询记录异常：" + e.getMessage(), e);
        }
        return br;
    }

    /**
     * 根据条件查询多条记录
     * 
     * @param record
     * @return
     */
    @Override
    public <T> BaseArgument select(T record) {
        BaseArgument br = new BaseArgument();
        try {
            List list = dao.select(getMapper(record, "select"), record);
            br.setToRtn("data", list);
            br.setCode(list != null ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("查询记录异常：" + e.getMessage());
            log.error("查询记录异常：" + e.getMessage(), e);
        }
        return br;
    }

    /**
     * 根据条件查询多条记录
     * 
     * @param record
     * @return
     */
    @Override
    public <T> BaseArgument select(String mapperId, T record) {
        BaseArgument br = new BaseArgument();
        try {
            List list = dao.select(mapperId, record);
            br.setToRtn("data", list);
            br.setCode(list != null ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("查询记录异常：" + e.getMessage());
            log.error("查询记录异常：" + e.getMessage(), e);
        }
        return br;
    }
	
    private RowBounds toRowBounds(Page page){
        return new RowBounds(page.getStartRow(), page.getPageSize());
    }
    
    private BaseArgument getFromPageList(BaseArgument br, Page page, Page pageList){
        List list = pageList.getResult();
        br.setToRtn("data", list);
        br.setCode(list != null ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        page.setTotal((int) pageList.getTotal());
        br.setToRtn("page", page);
        return br;
    }
    
    @Override
    public BaseArgument select(Class<?> clasz, Map<String, Object> param, Page page) {
        BaseArgument br = new BaseArgument();
        try {
            if(page != null){
                String mapperId = getMapper(clasz, "select");
                com.github.pagehelper.Page list = (com.github.pagehelper.Page) dao.select(mapperId, param,toRowBounds(page));
                getFromPageList(br, page, list);
            }else{
                return select(clasz, param);
            }
        } catch (Exception e) {
            br.setMessage("查询记录异常：" + e.getMessage());
            log.error("查询记录异常：" + e.getMessage(), e);
        }
        return br;
    }
    
    
    /**
     * 根据条件查询多条记录
     * 
     * @param param
     * @return
     */
    @Override
    public BaseArgument select(String mapperId, Map<String, Object> param, Page page) {
        BaseArgument br = new BaseArgument();
        try {
            if(page != null){
                Page list = (Page) dao.select(mapperId, param,toRowBounds(page));
                getFromPageList(br, page, list);
            }else{
                return select(mapperId, param);
            }
            
        } catch (Exception e) {
            br.setMessage("查询记录异常：" + e.getMessage());
            log.error("查询记录异常：" + e.getMessage(), e);
        }
        return br;
    }

	@Override
    public <T> BaseArgument select(T record, Page page) {
        BaseArgument br = new BaseArgument();
        try {
            if(page != null){
                String mapperId = getMapper(record, "select");
                Page list = (Page) dao.select(mapperId, record,toRowBounds(page));
                getFromPageList(br, page, list);
            }else{
                return select(record);
            }
        } catch (Exception e) {
            br.setMessage("查询记录异常：" + e.getMessage());
            log.error("查询记录异常：" + e.getMessage(), e);
        }
        return br;
    }

	@Override
    public <T> BaseArgument select(String mapperId, T record, Page page) {
        BaseArgument br = new BaseArgument();
        try {
            if(page != null){
                Page list = (Page) dao.select(mapperId, record, toRowBounds(page));
                getFromPageList(br, page, list);
            }else{
                return select(mapperId, record);
            }
        } catch (Exception e) {
            br.setMessage("查询记录异常：" + e.getMessage());
            log.error("查询记录异常：" + e.getMessage(), e);
        }
        return br;
    }
    

    /**
     * 批量新增
     * 
     * @param entitys
     */
    @Override
    public <T> BaseArgument insertBatch(Class<?> clasz, List<T> entitys) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.insertBatch(getMapper(clasz, "insertBatch"), entitys);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("新增记录异常：" + e.getMessage());
            log.error("新增记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 批量新增
     * 
     * @param entitys
     */
    @Override
    public <T> BaseArgument insertBatch(String mapperId, List<T> entitys) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.insertBatch(mapperId, entitys);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("批量新增记录异常：" + e.getMessage());
            log.error("批量新增记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 批量修改
     * 
     * @param entitys
     */
    @Override
    public <T> BaseArgument updateBatch(String mapperId, List<T> entitys) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.updateBatch(mapperId, entitys);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("批量修改记录异常：" + e.getMessage());
            log.error("批量修改记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 批量删除
     * 
     * @param entitys
     */
    @Override
    public <T> BaseArgument deleteBatch(String mapperId, List<T> entitys) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.deleteBatch(mapperId, entitys);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("批量删除记录异常：" + e.getMessage());
            log.error("批量删除记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 批量修改
     * 
     * @param entitys
     */
    @Override
    public <T> BaseArgument updateBatch(Class<?> clasz, List<T> entitys) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.updateBatch(getMapper(clasz, "updateBatch"), entitys);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("批量修改记录异常：" + e.getMessage());
            log.error("批量修改记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

    /**
     * 批量删除
     * 
     * @param entitys
     */
    @Override
    public <T> BaseArgument deleteBatch(Class<?> clasz, List<T> entitys) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.deleteBatch(getMapper(clasz, "deleteBatch"), entitys);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("批量删除记录异常：" + e.getMessage());
            log.error("批量删除记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

    @Override
    public BaseArgument deleteByInPrimaryKey(Class<?> clasz, List<Object> keys) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.deleteInPrimaryKey(getMapper(clasz, "deleteByInPrimaryKey"), keys);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("批量删除记录异常：" + e.getMessage());
            log.error("批量删除记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }

    @Override
    public BaseArgument deleteInPrimaryKey(String mapperId, List<Object> keys) {
        BaseArgument br = new BaseArgument();
        try {
            int status = dao.deleteInPrimaryKey(mapperId, keys);
            br.setCode(status > 0 ? BaseArgument.SUCCESS : BaseArgument.FAILED);
        } catch (Exception e) {
            br.setMessage("批量删除记录异常：" + e.getMessage());
            log.error("批量删除记录异常：" + e.getMessage(), e);
            throw new RuntimeException("新增记录异常：" + e.getMessage());
        }
        return br;
    }
    
}
