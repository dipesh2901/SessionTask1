package com.neosoft.basicPrograms;

import java.util.*;

public class SetTest {

	
	public static void main(String[] args) {
		
		//Implementation Of HashSet
		
		Set<String> hash_set=new HashSet<String>();
		
		//Adding data to the hashset
		hash_set.add("Java");
		hash_set.add("is");
		System.out.println(hash_set);
		
		System.out.println("------------------------------------");
		//Making 2 HashSets set1 and set2 for checking the Union,Intersection and Symmetric Difference
		
		Set<Integer> set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,0}));
		
		Set<Integer> set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,4,5,6}));
		
		
		//Union
		Set<Integer> union=new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println(union);
		System.out.println("------------------------------------");
		
		
		//Intersection
		Set<Integer> intersection=new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		System.out.println("------------------------------------");
		
		
		//Symmetric Difference
		Set<Integer> difference=new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
		System.out.println("------------------------------------");
		
		
		//Using the hashing method to find whether the HashSet contains 2 or not
		System.out.println("2 is there?: "+difference.contains(2));
		
		//Removing a particular data from HashSet
		System.out.println("Remove 0: "+difference.remove(0));
		
		System.out.println("------------------------------------");
		
		//Iterating through the setDifference object and displaying the data using for each loop
		for(Integer i:difference)
			System.out.println("Element: "+i+", ");
		
		System.out.println("------------------------------------");
		
		
		//Iterating through the setDifference object and displaying the data using Iterator
		System.out.println("With Iterator");
		Iterator<Integer> itr=difference.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------");
		
		//Using LinkedHashSet
		
		Set<String> lhs=new LinkedHashSet<String>();
		lhs.add("DIpesh");
		lhs.add("Siesh");
		lhs.add("Rupesh");
		lhs.add("Jupesh");
		lhs.add("DIpesh");
		System.out.println(lhs);
		System.out.println("------------------------------------");
		
		
		lhs.remove("Jupesh");
		System.out.println(lhs);
		System.out.println("------------------------------------");
		
		
		Iterator<String> itr2=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("------------------------------------");
		
		//Implementing TreeSet
		Set<String> lhs2=new TreeSet<String>();
		lhs2.add("DIpesh");
		lhs2.add("Rupesh");
		lhs2.add("Siesh");
		lhs2.add("Jupesh");
		lhs2.add("DIpesh");
		System.out.println(lhs2);
		System.out.println("------------------------------------");
		
		
		lhs2.remove("Jupesh");
		System.out.println(lhs2);
		
		Iterator<String> itr3=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr3.next());
		}
	
	}
}
