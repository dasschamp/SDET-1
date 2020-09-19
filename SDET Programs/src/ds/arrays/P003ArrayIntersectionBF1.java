package ds.arrays;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class P003ArrayIntersectionBF1 {

	/*
	Given two arrays, write a method to print their intersection. // Simple
    [1,2,4,5] [2,4,7,9] => [2,4]
	 */		

	//	Loop input1 for getting each array element
	//	Add an inner loop in input1 loop and get input2 elements
	//	Check input1 element == input2 element and store in output

	
	private Set<Integer> getArrayIntersectionSetOuptut(int[] input1, int[] input2){

		Set<Integer> set=new HashSet<Integer>();

		for(int i=0; i<input1.length; i++){
			
			for(int j=0; j<input2.length; j++){

				if(input1[i] == input2[j] ){
					
					set.add(input1[i]);
			
				}

			}
		}

		return set;

		//		throw new RuntimeException("No intersection found");
	}

	@Test
	public void example1(){

		int[] input1 = {8,8,8,2,3,1,7,1};
		int[] input2 = {12,8,8,4,7,9};

		System.out.println(getArrayIntersectionSetOuptut(input1, input2));

	}

	@Test
	public void example2(){

		int[] input1 = {12,3,1,7,1};
		int[] input2 = {12,8,4,7,9};

		System.out.println(getArrayIntersectionSetOuptut(input1, input2));

	}

	@Test
	public void example3(){

		int[] input1 = {12,12,1,7,1};
		int[] input2 = {12,8,4,7,9};

		System.out.println(getArrayIntersectionSetOuptut(input1, input2));

	}
	
	@Test
	public void example4(){

		int[] input1 = {3,11,17,1};
		int[] input2 = {8,4,7,9};

		System.out.println(getArrayIntersectionSetOuptut(input1, input2));

	}

	@Test
	public void example5(){

		int[] input1 = {12,3,11,17,1};
		int[] input2 = {12,3,11,17,1};

		System.out.println(getArrayIntersectionSetOuptut(input1, input2));

	}
}
