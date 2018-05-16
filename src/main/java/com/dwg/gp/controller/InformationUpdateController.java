package com.dwg.gp.controller;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.service.EmployeeInfoService;
import com.dwg.gp.utils.Base64ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.sql.rowset.serial.SerialBlob;
import java.util.HashMap;

@Controller
@RequestMapping("/updateInfo")
public class InformationUpdateController {

    @Autowired
    private EmployeeInfoService employeeInfoService;


    @RequestMapping(value="/updateDriver")
    public String updateDriver(HttpServletRequest request, Model model, @RequestParam(name="id") int id, @RequestParam(value="img") MultipartFile image) throws Exception {
        String name=request.getParameter("name");
        String gender=request.getParameter("gender");
        String phone=request.getParameter("phone");
        String workphone=request.getParameter("workphone");
        java.sql.Blob blob=null;
        blob=new SerialBlob(image.getBytes());

        HashMap<String,Object> map=new HashMap<String,Object>();
        map.put("id",id);
        map.put("name",name);
        map.put("gender",gender);
        map.put("phone",phone);
        map.put("workphone",workphone);
        map.put("image",blob);

        employeeInfoService.updateEmployeeForDriver(map);
        Employee employee= employeeInfoService.getEmployeeForManager(id);
        model.addAttribute("employee",employee);
        String img=Base64ImageUtil.byteArr2String(employee.getPhoto());
        model.addAttribute("img",img);
        return "/driver/driver_detail";
    }

//    @RequestMapping(value="/updateManager")
//    public String updateManager(HttpServletRequest request, Model model, @RequestParam(name="id") int id, @RequestParam(value="img") MultipartFile image) throws Exception {
//        String name=request.getParameter("name");
//        String gender=request.getParameter("gender");
//        String phone=request.getParameter("phone");
//        java.sql.Blob blob=null;
//        blob=new SerialBlob(image.getBytes());
//
//        HashMap<String,Object> map=new HashMap<String,Object>();
//        map.put("id",id);
//        map.put("name",name);
//        map.put("gender",gender);
//        map.put("phone",phone);
//        map.put("image",blob);
//
//        employeeInfoService.updateEmployeeForManagerByM(map);
//        Employee employee= employeeInfoService.getEmployeeForManager(id);
//        model.addAttribute("employee",employee);
//        String img=Base64ImageUtil.byteArr2String(employee.getPhoto());
//        model.addAttribute("img",img);
//        return "/manager/manager_detail";
//    }

    @RequestMapping(value="/updateCostar")
    public String updateCostar(HttpServletRequest request, Model model, @RequestParam(name="id") int id, @RequestParam(value="img") MultipartFile image) throws Exception {
        String name=request.getParameter("name");
        String gender=request.getParameter("gender");
        String phone=request.getParameter("phone");
        java.sql.Blob blob=null;
        blob=new SerialBlob(image.getBytes());

        HashMap<String,Object> map=new HashMap<String,Object>();
        map.put("id",id);
        map.put("name",name);
        map.put("gender",gender);
        map.put("phone",phone);
        map.put("image",blob);

        employeeInfoService.updateEmployeeForcoStar(map);
        Employee employee= employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        String img=Base64ImageUtil.byteArr2String(employee.getPhoto());
        model.addAttribute("img",img);
        if(employee.getPrivilege()==1){
            return "/boss/boss_detail";
        }else{
            if(employee.getDepartment()==3){

                return "/manager/manager_detail";
            }else if(employee.getDepartment()==4){
                return "/dispatcher/dispatcher_detail";
            }
        }
        return null;
    }

}
