package com.dwg.gp.controller;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.bean.Merchandise;
import com.dwg.gp.bean.Msg;
import com.dwg.gp.service.EmployeeInfoService;
import com.dwg.gp.service.MerchandiseService;
import com.dwg.gp.utils.Base64ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/manager1")
public class ManagerController {

    @Autowired
    EmployeeInfoService employeeInfoService;

    @Autowired
    MerchandiseService merchandiseService;

    @RequestMapping("/addmerchandise")
    public String addMerchandise(@RequestParam("id") int id,HttpServletRequest request, Model model) throws Exception {
        Employee employee=employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "manager/manager_addmerchandise";
    }


    @RequestMapping("/addmerchandiseforid")
    @ResponseBody
    public Msg addMerchandiseForId(HttpServletRequest request){
        Merchandise m=new Merchandise();
        merchandiseService.addAMerchandiseAndGetId(m);
        return Msg.success().add("mid",m.getId());
    }





}
