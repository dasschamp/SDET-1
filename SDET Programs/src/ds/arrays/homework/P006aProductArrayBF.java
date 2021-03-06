package ds.arrays.homework;

import java.util.Arrays;

import org.junit.Test;

public class P006aProductArrayBF {

	/* 6) Given an array nums of n integers where n > 1,  
return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Input:  [1,2,3,4]
Output: [24,12,8,6]

Input: [0,3,4,2]
Output: [ 24, 0, 0, 0]


Interview Question from Amazon


		
	 * 2. Traverse from i=0 till input.length
	 * 		Traverse from j=0 till input.length
	 * 			i. output[i] *= input[j]
	 * 
	*/
	
	private String solution(int[] input){
		
		int[] output= new int[input.length];
		
		for(int i=0; i<input.length; i++){
			output[i]=1;
			for(int j=0; j<input.length; j++){
				if(i!=j)output[i] *= input[j];
				
			}
		}
		return Arrays.toString(output);
	}
	
	@Test
	public void testData1(){

		int input[]= {0,3,4,5};

		System.out.println(solution(input));

	}
	
}
