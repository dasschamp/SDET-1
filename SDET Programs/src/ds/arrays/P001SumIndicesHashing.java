package ds.arrays;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P001SumIndicesHashing {

	//Hashing
	
	/*	input: {2,3,1,4,6}
	 * 	k: 5
	 * 
	 * 1. find sum[i] = 0 (sum + input)
	 * 
	 * 2. find diff[i] = (sum - k)
	 * 
	 */

	private void getSumIndices(int[] input,int target){

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int sum=0;
		
		map.put(0,-1);
		
		for (int i = 0; i < input.length; i++) {
			sum+=input[i];
			
			map.put(sum,i);
			
			
			if(map.containsKey(sum - target)) {
				System.out.println("the index is {"+(map.get(sum - target)+1)+","+i+"}");
			}
		}
		
	}



	@Test
	public void example1(){

		int[] numbers = {1,2,2,1,1};
		int target = 3;

		
		getSumIndices(numbers, target);

	}

	@Test
	public void example2(){

		int[] numbers = {2,3,-1,4,6};
		int target = 5;

		getSumIndices(numbers, target);

	}

	@Test
	public void example3(){

		int[] numbers = {2,3,1,4,1,4};
		int target = 5;

		getSumIndices(numbers, target);
	}

}
