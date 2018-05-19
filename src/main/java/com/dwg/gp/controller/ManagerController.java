package com.dwg.gp.controller;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.bean.Manager;
import com.dwg.gp.bean.Merchandise;
import com.dwg.gp.bean.Msg;
import com.dwg.gp.service.EmployeeInfoService;
import com.dwg.gp.service.ManagerService;
import com.dwg.gp.service.MerchandiseService;
import com.dwg.gp.service.PackageService;
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
@RequestMapping("/manager1")
public class ManagerController {

    @Autowired
    EmployeeInfoService employeeInfoService;

    @Autowired
    MerchandiseService merchandiseService;

    @Autowired
    ManagerService managerService;

    @Autowired
    PackageService packageService;

    @RequestMapping("/addmerchandise")
    public String addMerchandise(@RequestParam("id") int id,HttpServletRequest request, Model model) throws Exception {
        Employee employee=employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "manager/manager_addmerchandise";
    }

    @RequestMapping("/examInputMerchandise")
    public String examInputMerchandise(@RequestParam("id") int id,HttpServletRequest request, Model model) throws Exception {
        Employee employee=employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "manager/manager_examInputmerchandise";
    }

    @RequestMapping("/suremerchandise")
    @ResponseBody
    public Msg sureMerchandise(@RequestParam("id") int id,HttpServletRequest request, Model model) throws Exception {
        merchandiseService.sureArrive(id);
        return Msg.success().add("success","success");
    }


    @RequestMapping("/suremerchandisepack")
    @ResponseBody
    public Msg sureMerchandisePack(@RequestParam("id") int id,HttpServletRequest request, Model model) throws Exception {
        packageService.surePackArrived(id);
        return Msg.success().add("success","success");
    }




    @RequestMapping("/getallinput")
    @ResponseBody
    public Msg getAllInput(HttpServletRequest request,@RequestParam("id") int id){
        Manager manager=managerService.getManagerById(id);
        int shouldendpoint=manager.getPoint().getId();
        List<Merchandise> merchandises=merchandiseService.getAllMerchandiseForendPoint(shouldendpoint);
        return Msg.success().add("merchandises",merchandises);
    }

    @RequestMapping("/addmerchandiseforid")
    @ResponseBody
    public Msg addMerchandiseForId(HttpServletRequest request){
        Merchandise m=new Merchandise();
        merchandiseService.addAMerchandiseAndGetId(m);
        return Msg.success().add("mid",m.getId());
    }

    @RequestMapping("/getpacksbymid")
    @ResponseBody
    public Msg getPacksByMid(HttpServletRequest request,@RequestParam("mid") int mid){
        return Msg.success().add("packs",packageService.getpacksByMid(mid));
    }

    @RequestMapping("/getpointId")
    @ResponseBody
    public Msg getPointId(HttpServletRequest request,@RequestParam("id") int id){
        Manager manager=managerService.getManagerById(id);
        return Msg.success().add("pointId",manager.getPointId());
    }

    @RequestMapping("/updatetheMerchandise")
    @ResponseBody
    public Msg updateTheMerchandise(HttpServletRequest request,Merchandise merchandise){
        merchandiseService.updateMerchandise(merchandise);
        return Msg.success().add("success","添加成功");
    }

}
