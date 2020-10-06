package com.crackig.interview;

import java.util.Scanner;

public class isUnique {
	static boolean isUniqueString(String s)
	{
		
	   if(s.length()>128)
	   {
		   return false;
	   }
	   boolean char_set[]=new boolean[128];
	   for(int i =0;i<s.length();i++)
	   {
		   int value=s.charAt(i);
		   if(char_set[value])
		   {
			   return false;
		   }
		   char_set[value]=true;
	   }
	   return true;
		/*
		boolean result=true;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					result=false;
					break;
				}
			}
			if(!result)
			{
				break;
			}
		}
		
		return result;
		*/
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string ");
		//getting in put from the user
		String s=scan.nextLine().toLowerCase().trim();
		boolean result=isUniqueString(s);
		if(result)
		{
			System.out.println("String is unique");
		}
		else
		{
			System.out.println("String is not unique");
		}
		scan.close();
	}

}
