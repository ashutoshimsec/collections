package dsProblems;

import utils.StringUtils;

/* Java Program to find the 
missing number in a given unsorted array 
duplicates are not allowed */

public class MissingNumberInArray {

	
	private static Integer[] arr = {1,2,3,4,5,7,8,9,10};
	
	
	public static void main(String[] args) {

		int missingNumber = StringUtils.getSumofFirstNnumbers(10) - StringUtils.sumOfEmlemntsOfArray(arr);
		System.out.println("the missing number is "+missingNumber);

	}

	
	
}
