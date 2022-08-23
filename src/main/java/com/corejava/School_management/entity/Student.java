package com.corejava.School_management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
@NamedQuery(name = "viewAllStudent",query = "select s from Student s")
@Entity
public class Student {
	@Id
	 private int studentId;
	    private String studentName;
	    private String studentMblNo;
	    private int studentFeesPaid;
	    private int studentFeesTotal;
	    
		public Student() {
			super();
			
		}

		public Student(int studentId, String studentName, String studentMblNo, int studentFeesPaid) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentMblNo = studentMblNo;
			this.studentFeesPaid = studentFeesPaid;
			this.studentFeesTotal = 50000;
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getStudentMblNo() {
			return studentMblNo;
		}

		public void setStudentMblNo(String studentMblNo) {
			this.studentMblNo = studentMblNo;
		}

		public int getStudentFeesPaid() {
			return studentFeesPaid;
		}

		
		public int getStudentFeesTotal() {
			return studentFeesTotal;
		}
		public void payFees(int fees){
	        this.studentFeesPaid+=fees;
	        SchoolMgtService.updateTotalMoneyEarned(fees);
		}
		 public int getRemainingFees(){
		        return studentFeesTotal-studentFeesPaid;
		    }

	

		public void setStudentFeesTotal(int studentFeesTotal) {
			this.studentFeesTotal = studentFeesTotal;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMblNo=" + studentMblNo
					+ ", studentFeesPaid=" + studentFeesPaid + ", studentFeesTotal=" + studentFeesTotal + "]";
		}
		
		
	    

}
