package com.parentchild.demo.service;

import com.parentchild.demo.dao.ChildRepo;
import com.parentchild.demo.dao.ParentRepo;
import com.parentchild.demo.entity.Child;
import com.parentchild.demo.entity.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveParentChildService {

    @Autowired
    ParentRepo parentRepo;
    @Autowired
    ChildRepo childRepo;

    public void saveParentChild(Parent parent) {

        parentRepo.save(parent);

       for (Child child : parent.getChild()) {

            System.out.println("wfoid" + child.getChildName());
            System.out.println("parent.getParentid()"+parent.getParentid());
            child.setParentid(parent.getParentid());
            childRepo.save(child);
        }

    }}