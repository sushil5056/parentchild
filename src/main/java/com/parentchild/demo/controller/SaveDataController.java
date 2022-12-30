package com.parentchild.demo.controller;


import com.parentchild.demo.entity.Employee;
import com.parentchild.demo.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ListIterator;

@RestController
@RequestMapping("/API")
public class SaveDataController {

    @Autowired
    SaveService saveService;

    @PostMapping("/saveData")
    public Employee saveAddress(@RequestBody Employee employee){

        return saveService.saveEmployee(employee);

    }
}
