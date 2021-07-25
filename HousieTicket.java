package com.neosoft.task;
import java.lang.Math;
//import java.util.Arrays;

public class HousieTicket {
	//Declaring Required variables
	int counter,row_fill,maxK=9,minK=0,maxRandom=8,minRandom=0;
	
	//Declaring String array for the housie number to be placed in each column
	String[] col0= {"1","2","3","4","5","6","7","8","9","10"};
	String[] col1= {"11","12","13","14","15","16","17","18","19","20"};
	String[] col2= {"21","22","23","24","25","26","27","28","29","30"};
	String[] col3= {"31","32","33","34","35","36","37","38","39","40"};
	String[] col4= {"41","42","43","44","45","46","47","48","49","50"};
	String[] col5= {"51","52","53","54","55","56","57","58","59","60"};
	String[] col6= {"61","62","63","64","65","66","67","68","69","70"};
	String[] col7= {"71","72","73","74","75","76","77","78","79","80"};
	String[] col8= {"81","82","83","84","85","86","87","88","89","90"};
	
	//Method which will take 2 parameters as rows and columns and will print random housie ticket
	public void ticket(int row,int column) {
		
		try {
		//Taking Random value from 0 to 9 for k which will traverse in the Array of numbers
		int k=(int)(Math.random() * (maxK - minK + 1) + minK); 
		int j;
	
		//Taking random value from 0 to 8 for random variable which will be providing the detail of where to start the traversal
		int random=(int)(Math.random() * (maxRandom - minRandom + 1) + minRandom);
		
		//This String array is the array of housie ticket 
		String[][] arr=new String[row][column];
		
		//Initializing housie ticket with space as there is initially nothing in hoisie ticket
		for(int i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				arr[i][j]="";
			}
		}
		
		
		//Traversing into row of housie ticket
		for(int i=0;i<row;i++) {
			row_fill=0;
			
			
			if(random<4) {
				random=column-1;
			}
			
			//Traversing through columns of Housie Ticket
			for(j=random;j>=0;j--) {
				counter=0;
				//There is a restriction that each row should contain only 5 numbers
				if(row_fill>=5) {
					break;
				}
				//As traversing random will decrease which means it has already covered 1 part of column.
				random--;
		
				//If it goes out of index then it should be initialized to K=0
				if(k>9){
					k=0;
				}
			
				//It will check if there is already a number filled in the particular column. And will start the counter
				for(int z=i-1;z>=0;z--) {
					if(arr[z][j]!="") {
						counter++;
						
					}
				}
				
				//If the counter becomes 2 which means it has fulfilled the limit of 2 in that particular column.So the column loop will be breaked
				if(counter==2) {
					arr[i][j]="";
				}
				
				//Else it will move to the switch case
				else {
					switch(j) {
						case 0:
							//If it is for 0th column than it will enter into case 0. 
							//Checking whether the same number has occured in that particular column.
							for(int s=i-1;s>=0;s--) {
								//If same number is repeated then it will enter into this loop
								if(arr[s][j].equals(col0[k])) {
									//If k is already 9 or greater than that then it will initialize to 0 as there might be runtime error of IndexOutOfBounds
									if(k>=9) {
										k=0;
									}
									else {
										k++;
									}
									break;
								}
							}
							//The Housie ticket will take value from the array
							arr[i][j]=col0[k++];
							row_fill++;
							break;
						case 1:
							for(int s=i-1;s>=0;s--) {
								if(arr[s][j].equals(col1[k])) {
									if(k>=10) {
										k=0;
									}
									else {
										k++;
									}
									break;
								}
							}
							arr[i][j]=col1[k++];
							row_fill++;
							break;
						case 2:
							for(int s=i-1;s>=0;s--) {
								if(arr[s][j].equals(col2[k])) {
									if(k>=9) {
										k=0;
									}
									else {
										k++;
									}
									break;
								}
							}
							arr[i][j]=col2[k++];
							row_fill++;
							break;
						case 3:
							for(int s=i-1;s>=0;s--) {
								if(arr[s][j].equals(col3[k])) {
									if(k>=9) {
										k=0;
									}
									else {
										k++;
									}
									break;
								}
							}
							arr[i][j]=col3[k++];
							row_fill++;
							break;
						case 4:
							for(int s=i-1;s>=0;s--) {
								if(arr[s][j].equals(col4[k])) {
									if(k>=9) {
										k=0;
									}
									else {
										k++;
									}
									break;
								}
							}
							arr[i][j]=col4[k++];
							row_fill++;
							break;
						case 5:
							for(int s=i-1;s>=0;s--) {
								if(arr[s][j].equals(col5[k])) {
									if(k>=9) {
										k=0;
									}
									else {
										k++;
									}
									break;
								}
							}
							arr[i][j]=col5[k++];
							row_fill++;
							break;
						case 6:
							for(int s=i-1;s>=0;s--) {
								if(arr[s][j].equals(col6[k])) {
									if(k>=9) {
										k=0;
									}
									else {
										k++;
									}
									break;
								}
							}
							arr[i][j]=col6[k++];
							row_fill++;
							break;
						case 7:
							for(int s=i-1;s>=0;s--) {
								if(arr[s][j].equals(col7[k])) {
									if(k>=9) {
										k=0;
									}
									else {
										k++;
									}
									break;
								}
							}
							
							arr[i][j]=col7[k++];
							row_fill++;
							break;
						case 8:
							for(int s=i-1;s>=0;s--) {
								if(arr[s][j].equals(col8[k])) {
									if(k>=9) {
										k=0;
									}
									else {
										k++;
									}
									break;
								}
							}
							arr[i][j]=col8[k++];
							row_fill++;
							break;
						default:
							break;
							
				}
				
			}
				
		}
			//System.out.println(random);
			random++;
			
			//System.out.println(random);
		}
		
		//Displaying the Housie Ticket
		for(int i=0;i<row;i++) {
			for( j=0;j<column;j++) {
				
					System.out.print(arr[i][j]+",");
				
			}
			System.out.println();
		}
		}
		catch(Exception e) {
			System.out.println("There is a certain kind of error. For more information: "+e.getMessage()+"/n"+e.getStackTrace());
		}
	}

	//Main Method
	public static void main(String[] args) {
		HousieTicket ht=new HousieTicket();
		int row=3,column=9;
		ht.ticket(row,column);
	}

}
