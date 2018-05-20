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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/dispatch")
public class DispatcherController {


    @Autowired
    EmployeeInfoService employeeInfoService;

    @Autowired
    PointService pointService;

    @Autowired
    DispatchService dispatchService;

    @Autowired
    MerchandiseService merchandiseService;

    @Autowired
    DeliverService deliverService;

    @Autowired
    TruckService truckService;

    @RequestMapping("/makedispatcher")
    public String MakeDispatcher(HttpServletRequest request, @RequestParam("id") int id,Model model) throws Exception {

        Employee employee=employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "/dispatcher/dispatcher_map";
    }

    @RequestMapping("/alldispatch")
    public String getAllDispatch(HttpServletRequest request,@RequestParam("id") int id,Model model) throws Exception {
        Employee employee=employeeInfoService.getEmployeeForCostar(id);
        model.addAttribute("employee",employee);
        model.addAttribute("img",Base64ImageUtil.byteArr2String(employee.getPhoto()));
        return "/dispatcher/dispatcher_alldispatches";
    }

    @RequestMapping("/getallpointsneeddispatch")
    @ResponseBody
    public Msg getAllPointsNeedDispatch(HttpServletRequest requese){
        List<Point> pointList=pointService.getAllShouldDispatchPoints();
        return Msg.success().add("points",pointList);
    }


    @RequestMapping("/getalldispatches")
    @ResponseBody
    public Msg getAllDispatches(HttpServletRequest request){
        List<Dispatch> list=dispatchService.getAllDispatches();
        return Msg.success().add("dispatches",list);
    }


    @RequestMapping("/savedispatch")
    @ResponseBody
    public Msg saveDispatch(HttpServletRequest requeset) throws ParseException {
        String dispatcherId=requeset.getParameter("dispatcherId");
        String createTime=requeset.getParameter("createTime");
        String merchandiseId=requeset.getParameter("merchandiseId");
        String truckId=requeset.getParameter("truckId");
        String deliverId=requeset.getParameter("deliverId");
        String endDateShould=requeset.getParameter("endDateShould");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date endshould=sdf.parse(endDateShould);
        Date time=new Date();
        Dispatch dispatch=new Dispatch();
        dispatch.setDeliverId(Integer.parseInt(deliverId));
        dispatch.setDispatcherId(Integer.parseInt(dispatcherId));
        dispatch.setMerchandiseId(Integer.parseInt(merchandiseId));
        dispatch.setTruckId(Integer.parseInt(truckId));
        dispatch.setEndDateShould(endshould);
        dispatch.setCreateTime(time);
        //update merchandise state
        merchandiseService.updateMerchandiseForDispatched(Integer.parseInt(merchandiseId));
        //update deliver state
        deliverService.updateDeliverForDispatched(Integer.parseInt(deliverId));
        //update truck state
        truckService.updateTruckForDispatched(Integer.parseInt(truckId));
        //add a dispatch
        dispatchService.addADispatch(dispatch);
        return null;
    }

}
