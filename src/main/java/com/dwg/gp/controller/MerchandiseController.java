package com.dwg.gp.controller;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.bean.Merchandise;
import com.dwg.gp.bean.Msg;
import com.dwg.gp.service.EmployeeInfoService;
import com.dwg.gp.service.MerchandiseService;
import com.dwg.gp.utils.Base64ImageUtil;
import com.sun.xml.internal.ws.resources.HttpserverMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/merchandise")
public class MerchandiseController {

    @Autowired
    EmployeeInfoService employeeInfoService;

    @Autowired
    MerchandiseService merchandiseService;

    @RequestMapping("/getallmerchandise")
    public String getMerchandise(HttpServletRequest request, Model model, @RequestParam("id") int id) throws Exception {
        Employee employee=employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "/dispatcher/dispatcher_merchandise";
    }

    @RequestMapping("/getneeddispatche")
    public String getNeedDispatche(HttpServletRequest request,Model model,@RequestParam("id")int id) throws Exception {
        Employee employee=employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "/dispatcher/dispatcher_needdispatchemerchandise";
    }

    @RequestMapping("/getallmerchandiseforjson")
    @ResponseBody
    public Msg getAllMerchandiseForJson(HttpServletRequest request){
        List<Merchandise> list=merchandiseService.getAllMerchandise();
        return Msg.success().add("merchandises",list);
    }

    @RequestMapping("/getdispatchmerchandiseforjson")
    @ResponseBody
    public Msg getDispatchMerchandiseForJson(HttpServletRequest request){
        List<Merchandise> list=merchandiseService.getNeedDispatchMerchandise();
        return Msg.success().add("merchandise",list);
    }


}
