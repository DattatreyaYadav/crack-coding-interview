
// design an algorithm to find all pairs of integers with in an array which sum to a specified value;

package com.crackig.interview;

import java.util.Arrays;
import java.util.Scanner;

public class PairsWithSum {

	public static void main(String[] args) {
	 
	 Scanner scan =new Scanner(System.in);
	 
	 int array[]= {2,3,4,5,6,7,8,9};
	 System.out.println("enter the specified value");
	 int value=scan.nextInt();
	 pairSum(array,value);
	 scan.close();
	}

	private static void pairSum(int[] array, int value) {
		Arrays.sort(array);
//		for(int i =0;i<array.length;i++)
//		{
//			System.out.print(array[i]);
//		}
		for(int i =0;i<array.length;i++)
		{
			int temp = value-array[i];
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]==temp)
				{
					System.out.println("{"+array[i]+","+temp+"}");
					break;
				}
			}
			
		}
	}
/*	
	// one more solution 
	private static void pairSums(int[] array, int sum) {
		Arrays.sort(array);
		int first=0;
		int last=array.length-1;
		while(first<last) {
			int s =array[first]+array[last];
			if(s==sum) {
				System.out.println(array[first]+ " "+array[last]);
				first++;
				last--;
			}
			else {
				if(s<sum)
					first++;
				else
					last--;
			}
		}
	}
	
*/
}
