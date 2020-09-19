package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class P003ArrayIntersectionBuiltinSetIntersection {

	/*
	Given two arrays, write a method to print their intersection. // Simple
    [1,2,4,5] [2,4,7,9] => [2,4]
    */		
	
//	Loop input1 for getting each array element
//	Add an inner loop in input1 loop and get input2 elements
//	Check input1 element == input2 element and store in output
	
	private int[] getArrayIntersection(int[] input1, int[] input2){
		
		int[] output = new int[Math.min(input1.length, input2.length)];
		int count=0;
		
		for(int i=0; i<input1.length; i++){
			for(int j=0; j<input2.length; j++){
				 
				if(input1[i] == input2[j] ){
					output[i]=input1[i];
					count++;
						
				}
				
			}
		}
		
		
		
		int[] output1 = new int[count];
		System.arraycopy(output, 0, output1, 0, count);
		
		return output1;
		
//		throw new RuntimeException("No intersection found");
	}
	
	
	@Test
	public void example1(){

		int[] input1 = {2,3,1,4,6};
		int[] input2 = {2,3,1,8};

		int[] intersectionArray = getArrayIntersection(input1, input2);
		System.out.println(Arrays.toString(intersectionArray));
		
	}

	
}
