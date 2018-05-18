package com.dwg.gp.controller;

import com.dwg.gp.bean.Goodstype;
import com.dwg.gp.bean.Msg;
import com.dwg.gp.dao.GoodsMapper;
import com.dwg.gp.dao.GoodstypeMapper;
import com.dwg.gp.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/goodsType")
public class GoodsTypeController {

    @Autowired
    GoodsTypeService goodsTypeService;

    @RequestMapping("/goodsTypelist")
    @ResponseBody
    public Msg getGoodsType(HttpServletRequest request){
        List<Goodstype> list=goodsTypeService.getAllGoodsType();
        return Msg.success().add("goodsTypes",list);
    }
}
