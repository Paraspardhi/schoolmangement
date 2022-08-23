package com.corejava.School_management.entity;

import static org.junit.Assert.*;
import com.corejava.School_management.entity.Student;
import org.junit.Test;

public class SchoolMgtServiceTest {
	SchoolMgtService sms = new SchoolMgtService();

	@Test
	public void GetTotalMoneyEarned() {
		assertNotNull(sms.getTotalMoneyEarned());
	}

	@Test
	public void GetTotalMoneySpent() {
		assertNotNull(sms.getTotalMoneySpent());
	}

}
