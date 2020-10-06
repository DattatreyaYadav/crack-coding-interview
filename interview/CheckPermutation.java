package com.crackig.interview;

//import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
	
/*	 
  static boolean permutation(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		return sorting(s1).equals(sorting(s2));
	}
	 
	static String sorting(String s) {
		char[] content=s.toCharArray();
		//here instead of using inbuilt sort method, we can go for sorting algorithms
		// for this method we should import java.util.Arrays;
		Arrays.sort(content);
		return new String(content);
	}
	
*/
	
	static boolean permutation(String s1,String s2) {
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		int [] letters=new int[128];
		char [] string = s1.toCharArray();
		for(char c : string)
		{
			letters[c]++;
		}
		for(int i=0;i<s2.length();i++) {
			int c=(int) s2.charAt(i);
			letters[c]--;
			if(letters[c]<0)
			{
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// getting input from the user
		
		System.out.println("enter first strings");
		String first= scan.nextLine();
		
		System.out.println("enter first strings");
		String second=scan.nextLine();
 
		boolean result=permutation(first,second);
		if(result)
		{
			System.out.println("given strings are permutation of each other ");
		}
		else {
			System.out.println("given strings are  not permutation of each other");
		}

		scan.close();
	}

}
