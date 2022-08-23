package com.corejava.School_management.Service;

import java.util.List;

import com.corejava.School_management.Dao.TeacherDao;
import com.corejava.School_management.entity.Teacher;

public class TeacherService {
	
	private TeacherDao tdao = new TeacherDao();
	
	public String addTeacher(Teacher t) {
		return tdao.insertTeacherDetails(t);
	}

	public Teacher viewTeacher(int teacherId) {
		return tdao.getTeacher(teacherId);
	}

	public List<Teacher> viewAllTeacher() {
		return tdao.getAll();
	}

	public String updateTeacher(int teacherId, String property, String value) {
		return tdao.updateTeacherDetails(teacherId, property, value);
	}

	public String deleteTeacher(int teacherId) {
		return tdao.deleteTeacher(teacherId);

	}
	public String payTeacherSalary(int teacherId, int salary) {
		return tdao.payTeacherSalary(teacherId, salary);
	}
	public long getTotalMoneySpent() {
		return tdao.getTotalMoneySpent();
	}
}

