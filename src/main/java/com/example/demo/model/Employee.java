package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "EMPLOYEE")
public class Employee {
	 @Id
	 @Column(name="ENO")
	 private Integer eno;
	 
	 @Column(name="ENAME")
	 private String ename;
	 
	 @Column(name="JOB")
	 private String job;
	 
	 @Column(name="SALARY")
	 private Integer salary;

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer eno, String ename, String job, Integer salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + "]";
	}
	 
	 

}
