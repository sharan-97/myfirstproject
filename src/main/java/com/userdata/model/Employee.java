package com.userdata.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Employee {
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", salary=" + salary + "]";
	}
	@Id
	@Column(name="empid")
	private Integer empId;
	
	@NotBlank(message="name cant be blank ma")
	@Column(name="empname")
	private String empName;
	
	@Column(name="city")
	private String city;
	
	@Min(value=30000,message="salary is too less ma, cant accept")
	@Column(name="salary")
	private Integer salary;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	

}
