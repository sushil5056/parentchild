package com.parentchild.demo.controller;

import com.parentchild.demo.entity.Parent;
import com.parentchild.demo.service.SaveParentChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaveParentChildDataController {

@Autowired
SaveParentChildService saveParentChildService;

   @PostMapping("/Save")
    public void saveParentChild(@RequestBody Parent parent){
         saveParentChildService.saveParentChild(parent);
    }
}
