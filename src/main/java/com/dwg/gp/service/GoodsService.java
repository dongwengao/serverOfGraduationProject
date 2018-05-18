package com.dwg.gp.service;

import com.dwg.gp.bean.Goods;
import com.dwg.gp.dao.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    public List<Goods> getGoodsByTypeId(int id){
        return goodsMapper.selectByTypeId(id);
    }
}
