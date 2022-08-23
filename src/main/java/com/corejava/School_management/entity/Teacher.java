package com.corejava.School_management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
@NamedQuery(name = "viewAllTeacher",query = "select t from Teacher t")
@Entity
public class Teacher {
@Id
	private int teacherId;
	private String teacherName;
	private String teacherMblno;
	private int teacherSalary;
	public Teacher() {
		super();
		
	}
	public Teacher(int teacherId, String teacherName, String teacherMblno, int teacherSalary) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherMblno = teacherMblno;
		this.teacherSalary = 0;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherMblno() {
		return teacherMblno;
	}
	public void setTeacherMblno(String teacherMblno) {
		this.teacherMblno = teacherMblno;
	}
	public int getTeacherSalary() {
		return teacherSalary;
	}
	public void setTeacherSalary(int teacherSalary) {
		this.teacherSalary = teacherSalary;
	}
	public void receiveSalary(int Salary) {
		teacherSalary+=Salary;
		SchoolMgtService.updateTotalMoneySpent(Salary);
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherMblno=" + teacherMblno
				+ ", teacherSalary=" + teacherSalary + "]";
	}
	

}
