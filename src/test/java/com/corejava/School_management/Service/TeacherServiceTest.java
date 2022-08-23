package com.corejava.School_management.Service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

import com.corejava.School_management.entity.Teacher;

public class TeacherServiceTest {
	TeacherService ts = new TeacherService();
	@Ignore
	@Test
	public void addTeacher() {
		assertEquals("Teacher added successfully",ts.addTeacher(new Teacher(203,"katre","741245896",40000)));
	}

	@Test
	public void viewTeacher() {
		assertNotNull(ts.viewTeacher(203));
	}

	@Test
	public void viewAllTeacher() {
		assertNotNull(ts.viewAllTeacher());
	}

	@Test
	public void updateTeacher() {
		assertEquals("Teacher data updated successfully",ts.updateTeacher(201, "teacherName", "Mirdula"));
	}

	@Ignore
	@Test
	public void DeleteTeacher() {
		assertEquals("Teacher deleted successfully", ts.deleteTeacher(203));
	}

	@Test
	public void payTeacherSalary() {
		assertNotNull("Teacher salary paid successfully",ts.payTeacherSalary(203, 40000));
	}

}
