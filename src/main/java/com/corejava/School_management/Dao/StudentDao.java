package com.corejava.School_management.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.corejava.School_management.entity.Student;

public class StudentDao {
	private EntityManagerFactory emf;
	private EntityManager em;

	public StudentDao() {
		emf = Persistence.createEntityManagerFactory("Student");
		em = emf.createEntityManager();
	}

	public String insertStudentDetails(Student s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		return "Student data inserted successfully";
	}

	public Student getStudent(int studentId) {
		em.getTransaction().begin();
		Student s = em.find(Student.class, studentId);
		em.getTransaction().commit();
		return s;
	}

	public String updateStudentDetails(int studentId, String property, String value) {

		em.getTransaction().begin();
		Student s = em.find(Student.class, studentId);
		if (property.equalsIgnoreCase("studentName")) {
			s.setStudentName(value);
		} else if (property.equalsIgnoreCase("mobileNo")) {
			s.setStudentMblNo(value);
			
		} else if (property.equalsIgnoreCase("studentFeesTotal")) {
			s.setStudentFeesTotal(Integer.parseInt(value));
		}
		em.getTransaction().commit();
		return "Student data updated successfully";
	}

	public String deleteStudent(int studentId) {
		em.getTransaction().begin();
		Student s = em.find(Student.class, studentId);
		em.remove(s);
		em.getTransaction().commit();
		return "Student deleted successfully";
	}

	public List<Student> getAll() {
		em.getTransaction().begin();
		Query q = em.createNamedQuery("viewAllStudent");
		List<Student> slist = q.getResultList();
		em.getTransaction().commit();
		return slist;
	}
	
	public String payPendingFees(int studentId,int fees)
	{
		em.getTransaction().begin();
		Student s = em.find(Student.class,studentId);
		s.payFees(fees);
		em.getTransaction().commit();
		if(s.getRemainingFees()>0)
		{return "Pending Fees: "+s.getRemainingFees();}
		else
		{
			return "Thankyou for paying total fees";
		}
			
	}
	
	public long getTotalFeesPaid()
	{
		long fund = 0L;
		for(Student s:getAll())
		{
			fund += s.getStudentFeesPaid();
		}
		return fund;
	}
}
 