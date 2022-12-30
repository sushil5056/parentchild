package com.parentchild.demo.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int employeeid;
    private String employeeFastName;
    private String employeeLastName;

    @OneToMany(targetEntity = Address.class, cascade= CascadeType.ALL)
    @JoinColumn(name = "employeeid_fk", referencedColumnName ="employeeid" )
    private List<Address> address;


    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }




    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeeFastName() {
        return employeeFastName;
    }

    public void setEmployeeFastName(String employeeFastName) {
        this.employeeFastName = employeeFastName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }
}
