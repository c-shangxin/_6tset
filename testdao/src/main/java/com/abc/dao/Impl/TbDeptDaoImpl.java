package com.abc.dao.Impl;

import com.abc.dao.TbDeptDao;
import com.abc.entity.TbDept;
import org.springframework.stereotype.Repository;

/**
 * Created by csx on 2017/12/24.
 */
@Repository("deptDao")
public class TbDeptDaoImpl extends BaseDao implements TbDeptDao {

    @Override
    public boolean addDept(TbDept dept) {
        try {
            getSession().save(dept);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
