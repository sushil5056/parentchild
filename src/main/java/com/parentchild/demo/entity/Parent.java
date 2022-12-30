package com.parentchild.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parentid;
    private String parentName;

   @OneToMany(mappedBy = "parentid")
   /* @OneToMany(targetEntity = Child.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "parentid",referencedColumnName = "parentid")*/
    private List<Child> child;

}
