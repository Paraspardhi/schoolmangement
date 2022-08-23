package com.corejava.School_management.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.corejava.School_management.entity.Student;
import com.corejava.School_management.entity.Teacher;

public class TeacherDao {
	private EntityManagerFactory emf;
	private EntityManager em;

	public TeacherDao() {
		emf = Persistence.createEntityManagerFactory("Teacher");
		em = emf.createEntityManager();
	}
	public String insertTeacherDetails(Teacher t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		return "Teacher data inserted successfully";
	}

	public Teacher getTeacher(int teacherId) {
		em.getTransaction().begin();
		Teacher t = em.find(Teacher.class, teacherId);
		em.getTransaction().commit();
		return t;
	}

	public String updateTeacherDetails(int teacherId, String property, String value) {

		em.getTransaction().begin();
		Teacher t = em.find(Teacher.class, teacherId);
		if (property.equalsIgnoreCase("teacherName")) {
			t.setTeacherName(value);
		} else if (property.equalsIgnoreCase("teacherMblno")) {
			t.setTeacherMblno(value);
		}else if (property.equalsIgnoreCase("teacherSalary")) {
			t.setTeacherSalary(Integer.parseInt(value));
		}
	

		em.getTransaction().commit();
		return "Teacher data updated successfully";
	}

	public String deleteTeacher(int teacherId) {
		em.getTransaction().begin();
		Teacher s = em.find(Teacher.class, teacherId);
		em.remove(s);
		em.getTransaction().commit();
		return "Teacher deleted successfully";
	}

	public List<Teacher> getAll() {
		em.getTransaction().begin();
		Query q = em.createNamedQuery("viewAllTeacher");
		List<Teacher> slist = q.getResultList();
		em.getTransaction().commit();
		return slist;
}
	public String payTeacherSalary(int teacherId, int salary) {
		em.getTransaction().begin();
		Teacher t = em.find(Teacher.class, teacherId);
		t.receiveSalary(salary);
		em.getTransaction().commit();
		return "Teacher salary recieved successfully";
	}
	public long getTotalMoneySpent()
	{
		long fund = 0L;
		for(Teacher t:getAll())
		{
			fund = fund + t.getTeacherSalary();
		}
		return fund;
	}
}
