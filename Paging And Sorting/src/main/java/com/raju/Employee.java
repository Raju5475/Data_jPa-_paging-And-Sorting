package com.raju;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class Employee {
	@Id
private String emp_name; 
private int  emp_Id; 
private double emp_salary; 
private String emp_dept; 
}
