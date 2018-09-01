package cursorDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumberationDemo {

	
	
	//Enumeration cursor is only supported by leagacy classes.
	// we cannot use enumeration in list or set or map
	public static void main(String[] args) {


		Vector<Integer> v = new Vector<Integer>();
		
		for(int i=0;i<10;i++){	
			v.add(i);
		}
		
		Enumeration<Integer> e = v.elements();
		
		while (e.hasMoreElements()) {
		System.out.println("the elements of vectors are "+e.nextElement());
			
		}
		
		
	}

}
