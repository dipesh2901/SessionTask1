package com.neosoft.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Trainer {

	int tr_id,salary;
	String name,course;
	
	public Trainer(int tr_id,String name,String course,int salary){
		this.tr_id=tr_id;
		this.name=name;
		this.course=course;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		
		//Making ArrayList for taking 5 objects
		ArrayList<Trainer> al=new ArrayList<Trainer>();
		
		//Making another ArrayList for storing the Filtered Values
		ArrayList<Trainer> newCollection=new ArrayList<Trainer>();
		
		//Adding the 5 Objects with anonymous Objects
		al.add(new Trainer(101,"Kaustubh","Java",50000));
		al.add(new Trainer(102,"Seemarjeet","Logic Building and Android Development",40000));
		al.add(new Trainer(103,"Priyanka","Java",15000));
		al.add(new Trainer(104,"Prathamesh","Web Development",60000));
		al.add(new Trainer(105,"Ajinkya","Java",100000));
		
		//Using Iterator to Traverse Through the first List and Filtering the Objects which satisfies the condition and adding it to another List
		
		Iterator<Trainer> iterator1=al.iterator();
		while(iterator1.hasNext()) {
			Trainer t=iterator1.next();
			if(t.salary>20000 && t.course.equals("Java")) {
			newCollection.add(t);
			}
		}
		
		//Removing the unWanted Object using index property
		for(int i=0;i<al.size();i++) {
			if(al.get(i).salary>20000&&al.get(i).course.equals("Java")) {
				al.remove(i);
			}
		}
		
		//Using Iterator to traverse through the new List and displaying the  output
		Iterator<Trainer> iterator2=newCollection.iterator();	
		while(iterator2.hasNext()) {
			Trainer t6=iterator2.next();
			System.out.println("Trainer Id: "+t6.tr_id+", Trainer Name: "+t6.name+", Trainer Course: "+t6.course+", Trainer Salary: "+t6.salary);
	
		}
	}

}
