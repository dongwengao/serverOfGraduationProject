package com.dwg.gp.controller;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.bean.Msg;
import com.dwg.gp.bean.Point;
import com.dwg.gp.service.EmployeeInfoService;
import com.dwg.gp.service.PointService;
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
@RequestMapping("/dispatch")
public class DispatcherController {


    @Autowired
    EmployeeInfoService employeeInfoService;

    @Autowired
    PointService pointService;

    @RequestMapping("/makedispatcher")
    public String MakeDispatcher(HttpServletRequest request, @RequestParam("id") int id,Model model) throws Exception {

        Employee employee=employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "/dispatcher/dispatcher_map";
    }

    @RequestMapping("/getallpointsneeddispatch")
    @ResponseBody
    public Msg getAllPointsNeedDispatch(HttpServletRequest requese){
        List<Point> pointList=pointService.getAllShouldDispatchPoints();
        return Msg.success().add("points",pointList);
    }

}
