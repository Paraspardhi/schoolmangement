package com.corejava.School_management.Service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

import com.corejava.School_management.entity.Student;

public class StudentServiceTest {
	
	StudentService ss = new StudentService();

	@Test
	public void addStudent() {
		assertEquals("Student data inserted successfully",ss.addStudent(new Student(109,"khushAL","7412896",50000)));
	}

	@Test
	public void viewStudent() {
		assertNotNull(ss.viewStudent(103));
	}

	@Test
	public void viewAllStudent() {
		assertNotNull(ss.viewAllStudent());
	}

	@Test
	public void updateStudent() {
		assertEquals("Student data updated successfully",ss.updateStudent(103, "studentName", "DHANA"));
	}

	@Test
	public void testDeleteStudent() {
		assertEquals("Student deleted successfully", ss.deleteStudent(102));
	}

	@Test
	public void testPayPendingFees() {
		assertEquals("Thankyou for paying total fees",ss.payPendingFees(107, 0));
	}

	@Test
	public void testGetTotalFeesPaid() {
		assertNotNull(ss.getTotalFeesPaid());
	}

}
