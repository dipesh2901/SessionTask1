package com.neosoft.programs;
import java.util.Scanner;


public class Program2 {
	int l_r_space,space,insides;
	int k=-1;
	int j=1;
	public void Pattern(int row,int column) {
		
		for(int i=1;i<=row;i++) {
			space=column-(k+2);//space=1-(-1+2) space=0
			l_r_space=space/2;// l_r_space=0
			insides=column-space;// insides=1-0=1
			while(l_r_space>0) {
				System.out.print(" ");
				l_r_space--;
			}
			while(insides>0) {
				System.out.print(j++);
				System.out.print(" ");
				insides=insides-2;
			}
			l_r_space=(space/2)-1;//l_r_space=-1
			while(l_r_space>0) {
				System.out.print(" ");
				l_r_space--;
			}
			System.out.println();
			k=k+2;
		}
		
	}
	
	
	public static void main(String []args) {
		
		Program2 p2=new Program2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row=sc.nextInt();//row=1
		int column=(row*2)-1;//column=(1*2)-1 column=1
		p2.Pattern(row,column);
		sc.close();
		
	}

}
