package com.dwg.gp.service;


import com.dwg.gp.dao.PackageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dwg.gp.bean.Package;

import java.util.List;

@Service
public class PackageService {

    @Autowired
    PackageMapper packageMapper;

    public void packageSaved(Package pack){
        packageMapper.insert(pack);
    }

    public List getpacksByMid(Integer id) {
        return packageMapper.selectByMerchandiseId(id);
    }

    public void surePackArrived(int id) {
        packageMapper.updateForState(id);
    }
}
