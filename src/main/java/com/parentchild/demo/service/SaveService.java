package com.parentchild.demo.service;


import com.parentchild.demo.dao.AddressRepo;
import com.parentchild.demo.dao.EmployeeRepo;
import com.parentchild.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveService {

    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    AddressRepo addressRepo;

    public Employee saveEmployee(Employee employee){

       return employeeRepo.save(employee);
    }
}
