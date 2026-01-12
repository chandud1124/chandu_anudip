package com.example.studentdetails.employee;

public class employee {
    private int empid;
    private String name;
    private double salary;
    
    // Constructor
    public employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }
    
    // Getters
    public int getEmpid() {
        return empid;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    // Setters
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}