package com.neosoft.programs;

public class TestResource {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SharedResource s=new SharedResource();
		MyThread t1=new MyThread(2,5);
		MyThread t2=new MyThread(3,7);
		t1.start();
		t2.start();
		
		
	}

}
class SharedResource{
	
	synchronized static void doPrint(int i,int j) {
		
		int num=i;
		try {
		System.out.print(i+" ");
		Thread.sleep(1000);
		
		for(int k=1;k<=j;k++) {
			System.out.print(++num+" ");
				Thread.sleep(1000);
			
		}
		System.out.println();
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

class MyThread extends Thread{
	//SharedResource sr=new SharedResource();
	int i,j;
	public MyThread(int i,int j) {
		this.i=i;
		this.j=j;
	}
	@Override
	public void run() {
		
		SharedResource.doPrint(i, j);
	}
}
