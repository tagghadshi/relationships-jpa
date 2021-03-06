package com.tcs.entity.nativequeryexample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="DepartmentEntity")
@Table (name="department")
public class DepartmentEntity implements Serializable {
  
    private static final long serialVersionUID = 1L;
      
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
      
    public DepartmentEntity(){
    }
  
    public DepartmentEntity(String name) {
        super();
        this.name = name;
    }
      
    @OneToMany(mappedBy="department",cascade=CascadeType.PERSIST)
    private List<EmployeeEntity> employees = new ArrayList<EmployeeEntity>();
      
    //Setters and Getters
     
     @Override
    public String toString() {
        return "DepartmentVO [id=" + id + ", name=" + name + "]";
    }
}
