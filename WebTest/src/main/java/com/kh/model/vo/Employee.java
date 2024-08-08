package com.kh.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class Employee {
	private int empId;
	private String empName;
	private String email;
	private String phone;
}