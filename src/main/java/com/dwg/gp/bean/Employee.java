package com.dwg.gp.bean;

import java.util.Arrays;

public class Employee {
    private Integer id;

    private Integer department;

    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", department=" + department +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", state=" + state +
                ", privilege=" + privilege +
                ", photo=" + Arrays.toString(photo) +
                ", deliver=" + deliver +
                ", manager=" + manager +
                ", dePartment=" + dePartment +
                '}';
    }

    private String password;

    private Integer gender;

    private String phone;

    private Integer state;

    private Integer privilege;

    private byte[] photo;

    public Deliver getDeliver() {
        return deliver;
    }

    public void setDeliver(Deliver deliver) {
        this.deliver = deliver;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    private Deliver deliver;

    private Manager manager;

    public Department getDePartment() {
        return dePartment;
    }

    public void setDePartment(Department dePartment) {
        this.dePartment = dePartment;
    }

    private Department dePartment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}