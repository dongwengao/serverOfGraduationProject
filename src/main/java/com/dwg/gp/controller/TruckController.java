package com.dwg.gp.controller;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.bean.Msg;
import com.dwg.gp.bean.Truck;
import com.dwg.gp.dao.EmployeeMapper;
import com.dwg.gp.dao.TruckMapper;
import com.dwg.gp.utils.Base64ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.image.ImageWatched;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/truck")
public class TruckController {

    @Autowired
    TruckMapper truckMapper;

    @Autowired
    EmployeeMapper employeeMapper;


    @RequestMapping("/truckall")
    public String getAllTruck(@RequestParam("id")int id,HttpServletRequest request, Model model) throws Exception {
        Employee employee=employeeMapper.selectByCostarPrimaryKey(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img", Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "/dispatcher/dispatcher_truck";
    }

    @RequestMapping("/usetruck")
    public String getUseTruck(@RequestParam("id")int id,HttpServletRequest request, Model model) throws Exception {
        Employee employee=employeeMapper.selectByCostarPrimaryKey(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img", Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "/dispatcher/dispatcher_truckuse";
    }



    @RequestMapping("/truckalljson")
    @ResponseBody
    public Msg getAllTruckForJson(HttpServletRequest request){
       List<Truck> trucks= truckMapper.seleckAllTruck();
        return Msg.success().add("trucks",trucks);
    }

    @RequestMapping("/truckusejson")
    @ResponseBody
    public Msg getUseTruckForJson(HttpServletRequest request){
        List<Truck> trucks= truckMapper.selectUseTruck();
        return Msg.success().add("trucks",trucks);
    }

}
