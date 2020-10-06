
//write a method to count the number of twos between two numbers


package com.crackig.interview;

import java.util.Scanner;

public class CountTwos {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		// get the input from the user
	    System.out.println("enter the range of two numbers");
	    int number1=scan.nextInt();
	    int number2=scan.nextInt();
	    
	    int result=twosCount(number1,number2);
	    System.out.println("total number of 2's between the given range are :" +result);
	    scan.close();
	}

     static int twosCount(int number1, int number2)
     {
		int count=0;
		int temp=number1;
		while(temp<=number2)
		{
		  int temp1=temp;
		  while(temp1>0)
		  {
			  int rem=temp1%10;
			  if(rem==2)
			  {
				  count=count+1;
		      }
			  temp1=temp1/10;
		  }
		  temp++;  
		}
		return count;
	 }
}
