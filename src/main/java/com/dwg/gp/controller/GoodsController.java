package com.dwg.gp.controller;

import com.dwg.gp.bean.Goods;
import com.dwg.gp.bean.Msg;
import com.dwg.gp.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/goodsListByTypeId")
    @ResponseBody
    public Msg getGoodsByTypeId(HttpServletRequest request, @RequestParam("id") Integer id){
        List<Goods> list=goodsService.getGoodsByTypeId(id);
        return Msg.success().add("goods",list);
    }
}
