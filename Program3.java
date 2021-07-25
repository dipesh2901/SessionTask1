package com.neosoft.programs;
import java.util.Scanner;
import java.util.Arrays;

public class Program3 {
	public void swap(int[] arr)
	{
		int j=arr[0];
		int k=arr[0];
		int max_index=0;
		int min_index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<j){
				j=arr[i];
				min_index=i;
			}
			if(arr[i]>k){
				k=arr[i];
				max_index=i;
			}
		}
		arr[min_index]=k;
		arr[max_index]=j;
		System.out.println(Arrays.toString(arr));
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Program3 p3=new Program3();
	int[] arr=new int[5];
	System.out.println("Enter 5 numbers in an array:");
	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
	}
	p3.swap(arr);
	sc.close();
}
}
