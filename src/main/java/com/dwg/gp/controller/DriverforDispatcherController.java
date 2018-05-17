package com.dwg.gp.controller;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.bean.Msg;
import com.dwg.gp.dao.EmployeeMapper;
import com.dwg.gp.service.EmployeeInfoService;
import com.dwg.gp.utils.Base64ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/driver")
public class DriverforDispatcherController {



    @Autowired
    EmployeeInfoService employeeInfoService;

    @RequestMapping("/drivers")
    public String getDrivers(@RequestParam("id")int id, HttpServletRequest request, Model model) throws Exception {

        Employee employee=employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "/dispatcher/dispatcher_drivers";
    }


    @RequestMapping("/driversjson")
    @ResponseBody
    public Msg getDriversJson(HttpServletRequest request){

        List<Employee> drivers=employeeInfoService.getAllDriver();
        return Msg.success().add("drivers",drivers);
    }


}