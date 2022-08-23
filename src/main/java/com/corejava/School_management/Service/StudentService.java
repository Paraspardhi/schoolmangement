package com.corejava.School_management.Service;

import java.util.List;

import com.corejava.School_management.Dao.StudentDao;
import com.corejava.School_management.entity.Student;

public class StudentService {
	private StudentDao sdao = new StudentDao();

	public String addStudent(Student s) {
		try
		{
		return sdao.insertStudentDetails(s);
		}
		catch(Exception e)
		{
			return "Something Wrong";
		}
	}

	public Student viewStudent(int studentId) {
		
		return sdao.getStudent(studentId);
	}

	public List<Student> viewAllStudent() {
		
		return sdao.getAll();
	}

	public String updateStudent(int studentId, String property, String value) {
		try
		{
		return sdao.updateStudentDetails(studentId, property, value);
		}
		catch(Exception e)
		{
			return "Something Wrong";
		}
	}

	public String deleteStudent(int studentId) {
		try
		{
		return sdao.deleteStudent(studentId);
	}
	catch(Exception e)
	{
		return "Something Wrong";
	}

	}
	public String payPendingFees(int studentId,int fees) {
		try
		{
		return sdao.payPendingFees(studentId, fees);
		}
		catch(Exception e)
		{
			return "Something Wrong";
		}
	}
	public long getTotalFeesPaid() {
		return sdao.getTotalFeesPaid();
	}
}
