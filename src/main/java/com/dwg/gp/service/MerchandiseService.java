package com.dwg.gp.service;

import com.dwg.gp.bean.Merchandise;
import com.dwg.gp.dao.MerchandiseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchandiseService {

    @Autowired
    MerchandiseMapper merchandiseMapper;

    public void addAMerchandiseAndGetId(Merchandise merchandise){
        merchandiseMapper.insertForId(merchandise);
    }

    public void updateMerchandise(Merchandise merchandise) {
        merchandiseMapper.updateByMerchandise(merchandise);
    }

    public List<Merchandise> getAllMerchandiseForendPoint(int shouldendpoint) {
        return merchandiseMapper.selectAllByShoudendPointId(shouldendpoint);
    }

    public void sureArrive(int id) {
        merchandiseMapper.updateByMerchandiseForState(id);
    }
}
