package com.dwg.gp.service;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.bean.Truck;
import com.dwg.gp.dao.TruckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckService {
    @Autowired
    TruckMapper truckMapper;

    public List<Truck> getAllTruck(){
        return truckMapper.seleckAllTruck();
    }
}
