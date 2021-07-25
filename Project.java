package com.neosoft.programs;

public class Project {

	int pid;
	String pname,pLocation;
	Employee e;
	Project(int pid,String pname,String pLocation,Employee e){
		this.pid=pid;
		this.pname=pname;
		this.pLocation=pLocation;
		this.e=e;
	}
	public void display() {
		if((e.esal>25000)&&(pname=="Web App")) {
		System.out.println(pid);
		System.out.println(pname);
		System.out.println(pLocation);
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.esal);
		System.out.println(e.project);
		}
		
	}
	private static void show1() {
		
	}
	private static void show1(int s) {
		
	}
	private final void don() {
		
	}
	private final void don(int j) {
		
	}
	
	public static void main(String []args) {
		Project p;
		Employee e1,e2,e3,e4;
		Project p1,p2,p3,p4;
		e1=new Employee(101,15000,"Farukh","Project Management");
		e2=new Employee(102,25000,"Soman","Project Management");
		p1=new Project(10001,"Mobile App","Mumbai",e1);
		p2=new Project(10001,"Mobile App","Mumbai",e2);
		e3=new Employee(103,25000,"Rudraksh","E-Commerce");
		e4=new Employee(102,28000,"Soman","E-Commerce");
		p3=new Project(10001,"Web App","Mumbai",e3);
		p4=new Project(10002,"Web App","Mumbai",e4);
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		
		
	}
}
