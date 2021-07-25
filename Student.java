package com.neosoft.programs;
import java.util.Scanner;

public class Student{
	static String stdid,name,course;
	static int marks;
	public Student(String stdid,String name,String course,int marks) {
		this.stdid=stdid;
		this.name=name;
		this.course=course;
		this.marks=marks;
	}
	public void display() {
		course=course.toUpperCase();
		if(course.equals("BCA") && marks>=60) {
			System.out.println("STUDENT ID: "+stdid);
			System.out.println("STUDENT NAME: "+name);
			System.out.println("STUDENT COURSE: "+course);
			System.out.println("STUDENT MARKS: "+marks);
		}
	}
	public static void main(String[] args) {
		Student s[]=new Student[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details: Enter to start giving the information");
		for(int i=0;i<5;i++) {
			sc.nextLine();
			System.out.println("Enter Student ID: ");
			stdid=sc.nextLine();
			System.out.println("Enter Student NAME: ");
			name=sc.nextLine();
			System.out.println("Enter Student COURSE: ");
			course=sc.nextLine();
			System.out.println("Enter Student MARKS: ");
			marks=sc.nextInt();
			s[i]=new Student(stdid,name,course,marks);
			s[i].display();
		}
		
	
		
	}
}