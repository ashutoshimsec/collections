package dsProblems;

import utils.StringUtils;

/* Java Program to find the 
missing number in a given unsorted array
with duplicates allowed */

public class MissingNUmberWithDuplicateArray {

	/* taken Integer because set cannot remove duplicate elements 
	 * for primitive data type such as int */
	private static Integer[] arr = {1,1,2,3,4,4,5,6,7,8,10,10,10};
	
	public static void main(String[] args) {
		
		Integer[] uniquearr = StringUtils.getUniqueElements(arr);
		
		
		
		int sumOfNelements = StringUtils.getSumofFirstNnumbers(10);
		int sumOfArray = StringUtils.sumOfEmlemntsOfArray(uniquearr);
		
		System.out.println("the missing element is ==> "+(sumOfNelements - sumOfArray ));
	}
	
}
