package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P005HighestConsecutiveSumBF1 {

	/*
	Given an array of integers and a number k. Return the highest sum of any k consecutive elements in the array. // Medium
    [2,4,1,3,5,6,0,1,3,1] k=3 maxSum => 3+5+6 => 14
	 */		

	
	//0,1,2 then 1,2,3 then 2,3,4
	
	private int getHighestSumOfSubArray(int array[],int k) {
		
		int maxSum=0;
		int index=0;
		
		while(array.length - k >= index) {
			
			int sum=0;
			
			for(int i=index; i<index+k; i++) {
				sum=sum+array[i];
			}
		
			if(maxSum<sum) {
				maxSum=sum;
			}
			
			
			index++;
		}
		return maxSum;
	}
		
	

	@Test
	public void example1() {
		int[] input= {1,4,5,2,3,7,9,8};
		int k=3;
		System.out.println(getHighestSumOfSubArray(input,k));
	}
	
	
	@Test
	public void example2(){

		int[] input = {2,4,1,3,5,6,0,1,3,1};
		int k=3;
		System.out.println(getHighestSumOfSubArray(input,k));
	}

	
	
}
