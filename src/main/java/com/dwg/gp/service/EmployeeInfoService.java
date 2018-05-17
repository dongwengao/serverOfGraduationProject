package com.dwg.gp.service;

import com.dwg.gp.bean.Employee;
import com.dwg.gp.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeInfoService {
    @Autowired
    EmployeeMapper employeeMapper;

    public Employee getEmployeeForDriver(int id) {
        return employeeMapper.selectByDriverPrimaryKey(id);
    }

    public void updateEmployeeForDriver(HashMap map) {
        employeeMapper.updateByMapForDriver(map);
    }

    public void updateEmployeeForcoStar(HashMap map) {
        employeeMapper.updateByMapForCostar(map);
    }

    public Employee getEmployeeForManager(int id) {
        return employeeMapper.selectByManagerPrimaryKey(id);
    }

    public Employee getEmployeeForCostar(int id) {
        return employeeMapper.selectByCostarPrimaryKey(id);
    }

    public LinkedList<Employee> getAllEmployee() {
        return employeeMapper.selectAll();
    }

    public void addEmployee(Employee employee) {
        employeeMapper.insert(employee);
    }

    public void deleteEmployeeById(int id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    public List<Employee> getAllDriver() {
        return employeeMapper.selectAllDriver();
    }
}
