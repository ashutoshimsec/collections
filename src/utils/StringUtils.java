/**
 * 
 */
package utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author utility class for for arrays
 *
 */
public class StringUtils {

	
	/** returns the sum of first n numbers and return 0 if n is 0 or negative number or null
	 * @author ashutosh Kumar
	 * @param n number of elements
	 * @return return sum of first n elements
	 */
	public static int getSumofFirstNnumbers(int n) {
		if(n==0 || n<0) {
			return 0;
		}else
			return (n*(n+1))/2;
	}
	
	public static int sumOfEmlemntsOfArray(Integer[] uniquearr) {
		int sum = 0;
		
		if(uniquearr.length ==0) {
			return 0;
		}
		for(Integer a : uniquearr) {
			sum += a;
		}
		return sum;
	}

	/** @author ashutosh Kumar
	 * @param accepts integer array
	 * @return return integer array after removing duplicate
	 * 
	 */
	public static Integer[] getUniqueElements(Integer[] arr) {
		Integer []uniqueArr = new Integer[arr.length];
		
		List<Integer> lst = Arrays.asList(arr);
		 HashSet<Integer> set = new HashSet<Integer>(lst);
		
		Integer[] uniquearr =  set.toArray(new Integer[set.size()]);
		 
		return uniquearr;
	}

	
}
