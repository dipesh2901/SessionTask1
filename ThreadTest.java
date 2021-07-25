package com.neosoft.programs;

public class ThreadTest extends Thread {
	
	StringBuilder sb=new StringBuilder("java is nice");
	String sb2="java is nice";
	String[] sb3=sb2.split(" ");
	
	@Override
	public void run() {
		//System.out.println(sb.reverse());
		try {
			for(int i=sb3.length-1;i>=0;i--) {
				System.out.print(sb3[i]+" ");
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadTest tt =new ThreadTest();
		ThreadTest2 tt2=new ThreadTest2();
		tt.start();
		tt.join();
		tt2.start();
		tt2.join();
	}

}
class ThreadTest2 extends Thread{
	
	@Override
	public void run() {
		System.out.println();
		String str="java is nice";
		try {
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
			Thread.sleep(1000);
		}
		
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}