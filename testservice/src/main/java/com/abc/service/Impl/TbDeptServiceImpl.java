package com.abc.service.Impl;

import com.abc.dao.TbDeptDao;
import com.abc.entity.TbDept;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.abc.service.TbDeptService;

import javax.annotation.Resource;

/**
 * Created by csx on 2017/12/24.
 */
@Service("deptService")
@Transactional(propagation = Propagation.REQUIRED)
public class TbDeptServiceImpl implements TbDeptService{
    @Resource(name = "deptDao")
    private TbDeptDao deptDao;
    @Override
    public boolean addDept(TbDept dept) {
        return deptDao.addDept(dept);
    }

    public void setDeptDao(TbDeptDao deptDao) {
        this.deptDao = deptDao;
    }
}
