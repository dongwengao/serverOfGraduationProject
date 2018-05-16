package com.dwg.gp.service;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.bean.EmployeeExample;
import com.dwg.gp.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeInfoService {
    @Autowired
    EmployeeMapper employeeMapper;

    public Employee getEmployeeForDriver(int id) {
        return employeeMapper.selectByDriverPrimaryKey(id);
    }

    public void updateEmployee(HashMap map) {
        employeeMapper.updateByMap(map);
    }

    public Employee getEmployeeForManager(int id) {
        return employeeMapper.selectByManagerPrimaryKey(id);
    }

    public Employee getEmployeeForCostar(int id) {
        return employeeMapper.selectByCostarPrimaryKey(id);
    }
}
