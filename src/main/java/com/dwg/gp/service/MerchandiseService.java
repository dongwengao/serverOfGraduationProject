package com.dwg.gp.service;

import com.dwg.gp.bean.Merchandise;
import com.dwg.gp.dao.MerchandiseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchandiseService {

    @Autowired
    MerchandiseMapper merchandiseMapper;

    public void addAMerchandiseAndGetId(Merchandise merchandise){
        merchandiseMapper.insertForId(merchandise);
    }
}
