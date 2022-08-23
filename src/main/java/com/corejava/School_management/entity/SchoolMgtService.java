package com.corejava.School_management.entity;

import java.util.List;

import com.corejava.School_management.Dao.StudentDao;
import com.corejava.School_management.Dao.TeacherDao;

public class SchoolMgtService {
	 	private StudentDao sdao = new StudentDao();
	 	private TeacherDao tdao = new TeacherDao();
	    private static long  totalMoneyEarned;
	    private static long totalMoneySpent;
		public SchoolMgtService() {
			super();
			totalMoneyEarned = sdao.getTotalFeesPaid();
			totalMoneySpent = tdao.getTotalMoneySpent();
		}
		 

		  
		    public long getTotalMoneyEarned() {
		        return totalMoneyEarned;
		    }

		  
		   public static void updateTotalMoneyEarned(int MoneyEarned) {
		        totalMoneyEarned += MoneyEarned;
		    }

		   
		    public long getTotalMoneySpent() {
		        return totalMoneySpent;
		    }

		  
		    public static void updateTotalMoneySpent(int moneySpent) {
		        totalMoneyEarned-=moneySpent;
		        totalMoneySpent+=moneySpent;
		     }
		 

			@Override
			public String toString() {
				long balance = totalMoneyEarned - totalMoneySpent;
				
				return "SchoolMgtService [TotalMoneyEarned" + totalMoneyEarned + ", TotalMoneySpent="
						+ totalMoneySpent + "Balance Fund Amount: "+ balance+"]";
			}

}
