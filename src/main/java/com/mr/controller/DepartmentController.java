package com.mr.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2018/5/28.
 */
@Controller
@RequestMapping("department")
public class DepartmentController {

    @RequiresPermissions("department:list")
    @RequestMapping("list")
    public String list(){
        System.out.println("调用部门list方法");
        return "dept";
    }

    @RequiresPermissions("department:save")
    @RequestMapping("save")
    public String save(){
        System.out.println("调用部门save方法");
        return "dept";
    }

    @RequiresPermissions("department:delete")
    @RequestMapping("delete")
    public String delete(){
        System.out.println("调用部门delete方法");
        return "dept";
    }

    @RequiresPermissions("department:update")
    @RequestMapping("update")
    public String update(){
        System.out.println("调用部门update方法");
        return "dept";
    }
}
