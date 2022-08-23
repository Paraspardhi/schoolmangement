package com.corejava.School_management;

import java.util.Scanner;

import com.corejava.School_management.Service.StudentService;
import com.corejava.School_management.Service.TeacherService;
import com.corejava.School_management.entity.SchoolMgtService;
import com.corejava.School_management.entity.Student;
import com.corejava.School_management.entity.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    			Scanner sc = new Scanner(System.in);
    			System.out.println("Welcome to School Management System");
    			System.out.println();
    			System.out.println("What you are looking for?");
    			System.out.println("1. Student Management\n2. Teacher Management\n3. School Management");
    			System.out.println();
    			System.out.println("Give your choice:");
    			int choice = sc.nextInt();
    			char ch = 'C';
    			while(choice == 1 || choice == 2 || choice == 3)
    			{
    			switch (choice) {
    			case 1:
    				ch = 'S';
    				while (ch == 'S') {
    					System.out.println("\nStudent Management");
    					System.out.println("*****************");
    					System.out.println();
    		        	System.out.println("1. Add Student Details \n2. View Student Details \n3. Update Student Details \n4. Delete Student \n5.View All");
    		        	System.out.println("6.Payfees\n7.Exit");

    					System.out.println("\nEnter your option: ");
    					int option = sc.nextInt();

    					StudentService ss = new StudentService();
    					int studentId;
    					int studentFeesPaid = 0;

    					String studentName;
    					String studentMblNo;
    					switch (option) {
    					case 1:
    		        		System.out.println("Add Student Details :");
    		        		System.out.println();
    		    			System.out.println("Enter student Id  :-->");
    		    			studentId = sc.nextInt();
    		    			System.out.println("Enter Student Name :-->");
    		    			studentName = sc.next();
    		    			System.out.println("Enter Mobile Number :-->");    		    			
    		    			studentMblNo = sc.next();
    		    			System.out.println("Enter student fees :-->");    		    			
    		    			studentFeesPaid = sc.nextInt();
    		    			Student s = new Student(studentId,studentName,studentMblNo,studentFeesPaid);
    		 
    		    			System.out.println("");
    		    			System.out.println(ss.addStudent(s));
    		    			System.out.println();
    		    			break;
    					case 2:
    		        		System.out.println("View Student Details :");
    		        		System.out.println();
    		        		System.out.println("Enter studentId :");
    		        		studentId = sc.nextInt();
    		        		System.out.println(ss.viewStudent(studentId));
    		        		System.out.println();
    		        		break;
    					case 3:
    		        		System.out.println("Update Student Details");
    		        		System.out.println();
    		        		System.out.println("Enter student Id  :-->");
    		        		studentId = sc.nextInt();
    		    			System.out.println("Enter Property Name :-->");
    		    			String property = sc.next();
    		    			System.out.println("Enter Property value :-->");
    		    			String value = sc.next();
    		    			System.out.println("");
    		    			System.out.println(ss.updateStudent(studentId, property,value));
    		    			System.out.println();
    		    			break;
    					case 4:
    		        		System.out.println("Delete Student");
    		        		System.out.println();
    		        		System.out.println("Enter EnrollmentNo :");
    		        		studentId = sc.nextInt();
    		        		System.out.println(ss.deleteStudent(studentId));
    		        		break;
    					case 5:
    		        		System.out.println("View all Students");
    		        		for(Student stud: ss.viewAllStudent() )
    		        		{
    		        			System.out.println(stud.getStudentId()+" "+stud.getStudentName());
    		        		}
    		        		break;
    					case 6:
    						System.out.println("payfees");
    						System.out.println();
    						System.out.println("Enter student Id");
    						studentId = sc.nextInt();
    						System.out.println("enter student fees");
    						studentFeesPaid= sc.nextInt();
    						System.out.println(ss.payPendingFees(studentId, studentFeesPaid));
    						break;
    		        	default:
    		        		break;
    					
    					}
    					System.out.println("\nWant to continue in Student Management Press S");
    					ch = sc.next().charAt(0);
    				}
    				break;

    			case 2:
    				ch = 'T';
    				while (ch == 'T') {
    					System.out.println("\nTeacher Management");
    					System.out.println("*****************");
    					System.out.println();
    		        	System.out.println("1. Add Teacher Details \n2. View Teacher Details \n3. Update Teacher Details \n4. Delete Teacher \n5.View All");
    					System.out.println("6.Pay Salary\n7.Exit");
    					System.out.println("\nEnter your option: ");
    					int option = sc.nextInt();

    					TeacherService ts = new TeacherService();
    					int teacherId;
    					String teacherName;
    					String teacherMblno;
    					int teacherSalary=0;
    					switch (option) {
    					case 1:
    						System.out.println("Add Student Details :");
    		        		System.out.println();
    		    			System.out.println("Enter Teacher Id  :-->");
    		    			teacherId = sc.nextInt();
    		    			System.out.println("Enter Teacher Name :-->");
    		    			teacherName = sc.next();
    		    			System.out.println("Enter Teacher Mobile Number :-->");    		    			
    		    			teacherMblno = sc.next();
    		    			System.out.println("Enter Teacher salary :-->");    		    			
    		    			teacherSalary = sc.nextInt();
    		    			Teacher t = new Teacher(teacherId,teacherName,teacherMblno,teacherSalary);
    		        	/*	System.out.println("Add Teacher Details :");
    		        		System.out.println();
    		    			System.out.println("Enter Teacher Id  :-->");
    		    			teacherId = sc.nextInt();
    		    			System.out.println("Enter Teacher Name :-->");
    		    			teacherName = sc.next();
    		    			System.out.println("Enter Mobile Number :-->");
    		    			teacherMblno = sc.next();
    		    			System.out.println("Enter Teacher salary :-->");
    		    			teacherSalary = sc.nextInt();
    		    			Teacher t = new Teacher(teacherId,teacherName,teacherMblno,teacherSalary);*/
    		 
    		    			System.out.println("");
    		    			System.out.println(ts.addTeacher(t));
    		    			System.out.println();
    		    			break;
    					case 2:
    		        		System.out.println("View Teacher Details :");
    		        		System.out.println();
    		        		System.out.println("Enter Teacher Id :");
    		        		teacherId = sc.nextInt();
    		        		System.out.println(ts.viewTeacher(teacherId));
    		        		System.out.println();
    		        		break;
    					case 3:
    		        		System.out.println("Update Teacher Details");
    		        		System.out.println();
    		        		System.out.println("Enter Teacher Id  :-->");
    		        		teacherId = sc.nextInt();
    		    			System.out.println("Enter Property Name :-->");
    		    			String property = sc.next();
    		    			System.out.println("Enter Property value :-->");
    		    			String value = sc.next();
    		    			System.out.println("");
    		    			System.out.println(ts.updateTeacher(teacherId, property,value));
    		    			System.out.println();
    		    			break;
    					case 4:
    		        		System.out.println("Delete Teacher");
    		        		System.out.println();
    		        		System.out.println("Enter Teacher Id :");
    		        		teacherId = sc.nextInt();
    		        		System.out.println(ts.deleteTeacher(teacherId));
    		        		break;
    					case 5:
    		        		System.out.println("View all Teacher");
    		        		for(Teacher teac: ts.viewAllTeacher() )
    		        		{
    		        			System.out.println(teac.getTeacherId()+" "+teac.getTeacherName());
    		        		}
    		        		break;
    					case 6:
    						System.out.println("pay salary");
    						System.out.println();
    						System.out.println("Enter Teacher Id");
    						teacherId = sc.nextInt();
    						System.out.println("Enter Teacher Salary:");
    						teacherSalary = sc.nextInt();
    						System.out.println(ts.payTeacherSalary(teacherId, teacherSalary));
    						break;
    		        	default:
    						break;
    					}
    					System.out.println("\nWant to continue in Teacher Management Press T");
    					ch = sc.next().charAt(0);
    				}
    				break;
    			case 3:
    				ch = 'M';
    				while(ch == 'M') {
    					System.out.println("\nSchool Management");
    					System.out.println("********************");
    					System.out.println();
    					System.out.println("1. View student list \n2. View Teacher list \n3.View Funds \n4.Exit");
    					System.out.println("Enter your option");
    					int option = sc.nextInt();
    					SchoolMgtService sms = new SchoolMgtService();
    					StudentService ss = new StudentService();
    					TeacherService ts = new TeacherService();
    					switch (option) {
    					case 1:
    						System.out.println("View student list :");
    		        		System.out.println();
    		        		for(Student stud: ss.viewAllStudent() )
    		        		{
    		        			System.out.println(stud.getStudentId()+" "+stud.getStudentName());
    		        		}
    		        		break;
    					case 2:
    						System.out.println("View Teacher list");
    						System.out.println();
    						for(Teacher teac: ts.viewAllTeacher() )
    		        		{
    		        			System.out.println(teac.getTeacherId()+" "+teac.getTeacherName());
    		        		}
    		        		break;
    					case 3:
    						System.out.println("view funds");
    						System.out.println(sms.toString());
    						break;
    		        	default:
    						break;
    					}
    					System.out.println("\nWant to continue in School Management Press M");
    					ch = sc.next().charAt(0);
    				}
    				break;
    			default:
    				break;
    			}
    			System.out.println("1. Student Management\n2. Teacher Management\n3. School Management");
    			System.out.println();
    			System.out.println("Give your choice:");
    			choice = sc.nextInt();
    			}
    		}
    	

    }

