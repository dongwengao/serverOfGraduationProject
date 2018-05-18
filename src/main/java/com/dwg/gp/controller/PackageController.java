package com.dwg.gp.controller;

import com.dwg.gp.bean.Msg;
import com.dwg.gp.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import com.dwg.gp.bean.Package;

import java.util.List;

@Controller
@RequestMapping("/package")
public class PackageController {

    @Autowired
    PackageService packageService;

    @RequestMapping("/packageSave")
    @ResponseBody
    public String getPackageSaved(HttpServletRequest request,Package pack){
        System.out.println(pack);
        packageService.packageSaved(pack);
        return "success";
    }

    @RequestMapping("/packs")
    @ResponseBody
    public Msg getPacksByMId(HttpServletRequest request, @RequestParam("merchandiseId") Integer id){
        List list=packageService.getpacksByMid(id);
        return Msg.success().add("packs",list);
    }
}
