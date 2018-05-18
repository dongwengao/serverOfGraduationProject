package com.dwg.gp.controller;

import com.dwg.gp.bean.Msg;
import com.dwg.gp.bean.Point;
import com.dwg.gp.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/point")
public class PointController {


    @Autowired
    PointService pointService;

    @RequestMapping("/getpoints")
    @ResponseBody
    public Msg getPoints(HttpServletRequest request){
        List<Point>  list=pointService.getAllPoints();
        return Msg.success().add("points",list);
    }
}
