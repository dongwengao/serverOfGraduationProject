package com.dwg.gp.controller;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.bean.Msg;
import com.dwg.gp.service.LoginService;
import com.dwg.gp.service.EmployeeInfoService;
import com.dwg.gp.utils.Base64ImageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    LoginService loginService;

    @Autowired
    EmployeeInfoService employeeInfoService;

    public Employee employee;
    public String img;

    @RequestMapping("/login")
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

//    @RequestMapping(value = "/driverdetailinfo")
//    @ResponseBody
//    public Employee getDetailInfo(@RequestParam(name="id")int id, Model model, HttpServletResponse response){
//        employee= employeeInfoService.getEmployeeForDriver(id);
//        return employee;
//    }

    @RequestMapping(value="/driverdetailinfo1")
    public String getDriverDetailInfo(@RequestParam(name="id")int id, Model model) throws Exception {
        employee= employeeInfoService.getEmployeeForDriver(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",img);
            return "driver/driver_detail";
    }

    @RequestMapping(value="/managerdetailinfo1")
    public String getMangerDetailInfo(@RequestParam(name="id")int id, Model model) throws Exception {
        employee= employeeInfoService.getEmployeeForManager(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",img);
        return "manager/manager_detail";
    }

    @RequestMapping(value="/costardetailinfo1")
    public String getCostarDetailInfo(@RequestParam(name="id")int id, Model model) throws Exception {
        employee= employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",img);
        if(employee.getPrivilege()==1){
            return "boss/boss_detail";
        }else if(employee.getPrivilege()==2){
            return "dispatcher/dispatcher_detail";
        }
        return null;
    }

    @RequestMapping("/delemployee")
    public String delemployee(@RequestParam("id")int id){
        employeeInfoService.deleteEmployeeById(id);
        return null;
    }

    @RequestMapping(value="getallemployees")
    public String geAllEmployees(Model model){
        model.addAttribute("employee",employee);
        model.addAttribute("img",img);
        return "boss/boss_addemployee";
    }

    @RequestMapping(value="/emps")
    @ResponseBody
    public Msg getAllEmployees(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model){
        List<Employee> emps = employeeInfoService.getAllEmployee();
        PageInfo page = new PageInfo(emps);
        return Msg.success().add("pageInfo",page);
    }

    @RequestMapping(value="/addemployee")
    public String addemployee(HttpServletRequest request,@RequestParam(value="img") MultipartFile image,Model model) throws IOException, SQLException {
        model.addAttribute("employee",employee);
        model.addAttribute("img",img);
        String name=request.getParameter("name");
        String gender=request.getParameter("gender");
        String phone=request.getParameter("phone");
        String department=request.getParameter("dId");
        java.sql.Blob blob=null;
        blob=new SerialBlob(image.getBytes());
        Employee e=new Employee();

        e.setName(name);
        e.setDepartment(Integer.parseInt(department));
        e.setGender(Integer.parseInt(gender));
        e.setPhone(phone);
        e.setPhoto(image.getBytes());
        employeeInfoService.addEmployee(e);
        return "boss/boss_addemployee";
    }


}