package cursorDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationDemo {

	
	
	//Enumeration cursor is only supported by leagacy classes.
	// we cannot use enumeration in list or set or map
	public static void main(String[] args) {


		Vector<Integer> v = new Vector<Integer>();
		
		for(int i=0;i<10;i++){	
			v.add(i);
		}
		
		Enumeration<Integer> e = v.elements();
		
		Iterator itr  = v.iterator();
		ListIterator listIterator = v.listIterator();
		
		while (e.hasMoreElements()) {
		System.out.println("the elements of vectors are "+e.nextElement());
			
		}
		
		
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		
		System.out.println("the enumeration implementation anonymous class object is ==> "+e.getClass().getName());  //here e will not give enumeration interface 
																									//object but it will give anonymous implementation class object
		
		//output will be Vector$1 --> where $1 is anonymous implementation class object
		
		System.out.println("the iterator implentation anonymous class object is ==> "+itr.getClass().getName());
		
		System.out.println("the Listiterator implentation anonymous class object is ==> "+listIterator.getClass().getName());
		
	}

}
