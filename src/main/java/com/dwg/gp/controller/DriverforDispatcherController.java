package com.dwg.gp.controller;

import com.dwg.gp.bean.Deliver;
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

    @RequestMapping("/driversuse")
    public String getUseDrivers(@RequestParam("id") int id,HttpServletRequest request,Model model) throws Exception {
        Employee employee=employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "/dispatcher/dispatcher_driversuse";
    }


    @RequestMapping("/driversjson")
    @ResponseBody
    public Msg getDriversJson(HttpServletRequest request){

        List<Employee> drivers=employeeInfoService.getAllDriver();
        return Msg.success().add("drivers",drivers);
    }


    @RequestMapping("/driversusejson")
    @ResponseBody
    public Msg getDriversuseJson(HttpServletRequest request){

        List<Employee> drivers=employeeInfoService.getAlluseDriver();
        return Msg.success().add("drivers",drivers);
    }

    @RequestMapping("/getdriverbypid")
    @ResponseBody
    public Msg getDriverByPid(HttpServletRequest requese,@RequestParam("id")int id){
        List<Deliver> drivers=employeeInfoService.getDeliverByPid(id);
        return Msg.success().add("drivers",drivers);
    }

}
