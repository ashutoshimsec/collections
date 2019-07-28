package array;

public class SimpleArray {

	public static void main(String[] args) {
		 
		//will give negativeArraySizeException
		int[] arr = new int[-1];
		System.out.println("the elements of array are "+arr);

	
	//will give array store exception if store different datatype
		  Object x[] = new String[3];
	         x[0] = new Integer(0);
	System.out.println("the value of x is "+x);
	}
	

}
