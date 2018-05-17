package com.dwg.gp.controller;

import com.dwg.gp.bean.Msg;
import com.dwg.gp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping(value="/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value="/list")
    @ResponseBody
    public Msg getDempartments(HttpServletRequest request){

        List list= departmentService.getAllDepartment();

        return Msg.success().add("list",list);
    }
}
