package com.dwg.gp.service;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    EmployeeMapper employeeMapper;

    public Employee getEmployee(String name,String password){
        return employeeMapper.selectByNameAndPassword(name,password);
    }
}
