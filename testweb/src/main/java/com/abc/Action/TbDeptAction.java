package com.abc.Action;

import com.abc.entity.TbDept;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.abc.service.TbDeptService;

import javax.annotation.Resource;

/**
 * Created by csx on 2017/12/24.
 */
@Controller("deptAction")
@Scope("prototype")
public class TbDeptAction {

    private TbDept dept;

    @Resource(name = "deptService")
    private TbDeptService deptService;

    public String addDept(){
       if (deptService.addDept(dept)){
           System.out.println("添加成功");
       }else {
           System.out.println("添加失败");
       }
        return "addDept";
    }


    public void setDeptService(TbDeptService deptService) {
        this.deptService = deptService;
    }

    public TbDept getDept() {
        return dept;
    }

    public void setDept(TbDept dept) {
        this.dept = dept;
    }
}
