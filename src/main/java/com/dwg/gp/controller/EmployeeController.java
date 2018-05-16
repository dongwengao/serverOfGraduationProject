package com.dwg.gp.controller;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.service.LoginService;
import com.dwg.gp.service.EmployeeInfoService;
import com.dwg.gp.utils.Base64ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    LoginService loginService;

    @Autowired
    EmployeeInfoService employeeInfoService;

    public Employee employee;
    public String gender;
    public String img;

    @RequestMapping("login")
    public String login(HttpServletRequest request, HttpServletResponse response,Model m) throws Exception {
        String name=request.getParameter("username");
        String password=request.getParameter("password");
        employee= loginService.getEmployee(name,password);
        if(employee!=null){
            m.addAttribute("employee",employee);
            img=Base64ImageUtil.byteArr2String(employee.getPhoto());
            m.addAttribute("img",img);
        }
        if(employee.getDepartment()==1){
            return "boss/boss_index";
        }else if(employee.getDepartment()==2){
            return "driver/driver_index";
        }else if(employee.getDepartment()==3){
            return "manager/manager_index";
        }else if(employee.getDepartment()==4){
            return "dispatcher/dispatcher_index";
        }
        return null;
    }

    @RequestMapping(value = "/detailinfo")
    @ResponseBody
    public Employee getDetailInfo(@RequestParam(name="id")int id, Model model, HttpServletResponse response){
        employee= employeeInfoService.getEmployeeById(id);
        return employee;
    }

    @RequestMapping(value="/detailinfo1")
    public String getDetailInfo(@RequestParam(name="id")int id, Model model) throws Exception {
        employee= employeeInfoService.getEmployeeById(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",img);
        model.addAttribute("gender",gender);
        if(employee.getDepartment()==1){
            return "boss/boss_detail";
        }else if(employee.getDepartment()==2){
            return "driver/driver_detail";
        }else if(employee.getDepartment()==3){
            return "manager/manager_detail";
        }else if(employee.getDepartment()==4){
            return "dispatcher/dispatcher_detail";
        }
        return null;
    }

    @RequestMapping(value="/updateInfo")
    public String getDetailInfo(HttpServletRequest request,Model model,@RequestParam(name="id") int id,@RequestParam(value="img") MultipartFile image) throws Exception {
        String name=request.getParameter("name");
        String gender=request.getParameter("gender");
        String phone=request.getParameter("phone");
        String workphone=request.getParameter("workphone");
        System.out.println(image);
        java.sql.Blob blob=null;
        blob=new SerialBlob(image.getBytes());

        HashMap<String,Object> map=new HashMap<String,Object>();
        map.put("id",id);
        map.put("name",name);
        map.put("gender",gender);
        map.put("phone",phone);
        map.put("workphone",workphone);
        map.put("image",blob);

        employeeInfoService.updateEmployee(map);
        employee= employeeInfoService.getEmployeeById(id);
        model.addAttribute("employee",employee);
        img=Base64ImageUtil.byteArr2String(employee.getPhoto());
        model.addAttribute("img",img);
        System.out.println(id);
        return "/driver/driver_detail";
    }

}