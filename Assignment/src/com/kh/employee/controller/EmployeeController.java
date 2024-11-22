package com.kh.employee.controller;

import com.kh.employee.model.vo.Employee;

import java.util.ArrayList;

public class EmployeeController {
    ArrayList<Employee> employees;
    Employee e = new Employee();

    public void add(int empNo, String name, char gender, String phone) {
        e.setEmpNo(empNo);
        e.setName(name);
        e.setGender(gender);
        e.setPhone(phone);
    }

    public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
        e.setEmpNo(empNo);
        e.setName(name);
        e.setGender(gender);
        e.setPhone(phone);
        e.setDept(dept);
        e.setSalary(salary);
        e.setBonus(bonus);
    }

    public void modify(String phone) {
        e.setPhone(phone);
    }

    public void modify(int salary) {
        e.setSalary(salary);
    }

    public void modify(double bonus) {
        e.setBonus(bonus);
    }

    public void remove() {
        e = null;
    }

    public String inform() {
        return (e == null) ? null : e.printEmployee();
    }
}
