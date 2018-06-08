package com.dwg.gp.controller;

import com.dwg.gp.bean.*;
import com.dwg.gp.service.*;
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
public class DriverController {

    @Autowired
    EmployeeInfoService employeeInfoService;

    @Autowired
    DispatchService dispatchService;

    @Autowired
    MerchandiseService merchandiseService;

    @Autowired
    PointService pointService;

    @Autowired
    DeliverService deliverService;

    @RequestMapping("/getallmissions")
    public String GetAllMissions(HttpServletRequest request, @RequestParam("id")int id,Model model) throws Exception {
        Employee employee=employeeInfoService.getEmployeeForDriver(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "driver/driver_getallmissions";
    }

    @RequestMapping("/getalter")
    public String GetAlter(HttpServletRequest request,@RequestParam("id")int id,Model model) throws Exception {
        Employee employee=employeeInfoService.getEmployeeForDriver(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "driver/driver_getalter";
    }

    @RequestMapping("/manipulatedispatch")
    public String ManipulateDispatch(HttpServletRequest request,@RequestParam("id") int id,Model model) throws Exception {
        Employee employee=employeeInfoService.getEmployeeForDriver(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "driver/driver_manipulatedispatch";
    }

    @RequestMapping("/showroute")
    public String ShowRoute(HttpServletRequest request,@RequestParam("id") int id,Model model,@RequestParam("deliverid") int did){
        //更新司机转台为1
        deliverService.updateDeliverForStarted(did);
        //update dispatch start_date
        dispatchService.markStartDate(id);
        Dispatch dispatch=dispatchService.getDispatchByDId(id);
        int merchandise_id=dispatch.getMerchandiseId();
        Merchandise merchandise=merchandiseService.getMerchandiseById(merchandise_id);
        int startId=merchandise.getStartpoint();
        int endId=merchandise.getEndpoint();
        Point startPoint=pointService.getPointById(startId);
        Point endPoint=pointService.getPointById(endId);
        model.addAttribute("startp",startPoint.getLocation());
        model.addAttribute("endp",endPoint.getLocation());
        return "driver/driver_showroute";
    }



    @RequestMapping("/getdriverhistorydispatch")
    @ResponseBody
    public Msg GetDriverHistoryDispatch(HttpServletRequest request,@RequestParam("id") int id){
        List<Dispatch> list=dispatchService.getDriverHistoryDispatch(id);
        return Msg.success().add("dispatches",list);
    }

}
