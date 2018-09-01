package set;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {


		TreeSet lhs = new TreeSet() ;
		
	for(int i =120; i>100; i--){
		lhs.add(i);
	}
	
	//tresset will sort based on ascending order
	
	System.out.println("ceiling "+lhs.ceiling(10));	
	
	TreeSet hset = (TreeSet) lhs.headSet(110);
	
	TreeSet tset = (TreeSet) lhs.tailSet(110);
	
	TreeSet subSet =  (TreeSet) lhs.subSet(109, 118);
	
	System.out.println("headset is ==> "+hset);
	System.out.println("tail set is ==> "+tset);
	System.out.println("subset is ==>"+subSet );
	
	System.out.println("treeset comparator method is ==>"+lhs.comparator());  //by default it will return null
	
	
	
	}

}
