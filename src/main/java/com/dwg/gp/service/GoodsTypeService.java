package com.dwg.gp.service;


import com.dwg.gp.bean.Goodstype;
import com.dwg.gp.dao.GoodstypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeService {

    @Autowired
    GoodstypeMapper goodstypeMapper;

    public List<Goodstype> getAllGoodsType(){
        return goodstypeMapper.selectAll();
    }

}
