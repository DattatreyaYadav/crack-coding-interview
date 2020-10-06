//problem statement
// given two arrays of integers. find a pair of values (one from each array )
//that you can swap to give the two arrays the same sum.

package com.crackig.interview;

public class SumSwap {

	public static void main(String[] args) {
		int [] array1= {4,1,2,1,1,2};
		int array2[]= {3,6,3,3};
		
		sumSwap(array1,array2);

	}

	private static void sumSwap(int[] array1, int[] array2) {
		
		int target=getTarget(array1,array2);
		if(target==0) {
			System.out.println("no need of swapping ");
		}
		else {
			for(int one: array1){
				for(int two:array2){
					int temp=Math.abs(one-two);
					if(temp==target) {
						System.out.println("{"+one+","+two+"}");
					}
				}
			}
		}
	}

	private static int getTarget(int[] array1, int[] array2) {
		int sum1=sum(array1);
		int sum2=sum(array2);
		if(sum1==sum2) {
			return 0;
		}
		else {
			return (sum1-sum2)/2;
		}
	}

	private static int sum(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		return sum;
	}
}
