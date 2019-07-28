package dsProblems;

public class MissingNumberInArray {

	
	private static int [] arr = {1,2,3,4,5,7,8,9,10};
	
	private static int getSumofFirstNnumbers(int n) {
		if(n==0 || n<0) {
			return 0;
		}else
			return (n*(n+1))/2;
	}
	
	private static int sumOfEmlemntsOfArray(int[] arr) {
		int sum = 0;
		
		if(arr.length ==0) {
			return 0;
		}
		for(int a : arr) {
			sum += a;
		}
		return sum;
	}
	public static void main(String[] args) {

		int missingNumber = getSumofFirstNnumbers(10) - sumOfEmlemntsOfArray(arr);
		System.out.println("the missing number is "+missingNumber);

	}

	
	
}
