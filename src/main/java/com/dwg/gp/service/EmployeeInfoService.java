package com.dwg.gp.service;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeInfoService {
    @Autowired
    EmployeeMapper employeeMapper;

    public Employee getEmployeeById(int id){
        return employeeMapper.selectByPrimaryKey(id);
    }

    public void updateEmployee(HashMap map){
        employeeMapper.updateByMap(map);
    }

}
