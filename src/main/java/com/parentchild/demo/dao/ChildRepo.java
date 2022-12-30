package com.parentchild.demo.dao;

import com.parentchild.demo.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepo  extends JpaRepository<Child,Integer> {

}
