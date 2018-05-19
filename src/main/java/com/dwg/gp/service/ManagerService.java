package com.dwg.gp.service;

import com.dwg.gp.bean.Manager;
import com.dwg.gp.dao.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    ManagerMapper managerMapper;

    public Manager getManagerById(int id){
        return managerMapper.selectByPrimaryKey(id);
    }
}
