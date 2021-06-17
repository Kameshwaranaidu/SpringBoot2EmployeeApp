package com.v2soft.kamesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class Employee {
	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empDept;
	
	

}
