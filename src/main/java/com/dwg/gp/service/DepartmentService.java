package com.dwg.gp.service;

import com.dwg.gp.bean.Department;
import com.dwg.gp.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getAllDepartment(){
        return departmentMapper.selectAllDepartment();
    }
}
