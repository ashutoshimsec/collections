//package myCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyList {
	
	public static void main(String[] args)
	{
		
	List<String> al = new ArrayList<String>();
	al.add("hello");
	al.add(String.valueOf(2));
	System.out.println(al);
	System.out.println(al.contains("hell"));
	
	
	List newList = new ArrayList();
	newList.add(24);
	newList.add("hello");
	System.out.println(newList);
	
	//sorting elements of list using sort
	List<String> strList = new ArrayList<String>();
	List<Integer> intList= new ArrayList<Integer>();
	strList.add("Ashutosh");
	strList.add("Amit");
	strList.add("Alok");
	strList.add("Dipender");
	strList.add("Sunish");
	strList.add("Amit Parmar");
	
	intList.add(2);
	intList.add(1);
	intList.add(-3);
	intList.add(8);

	//string sorting
	System.out.println("Before sorting "+strList);
	Collections.sort(strList);
	System.out.println("After sorting"+strList);
	
	//integer sorting
	System.out.println("Before intger value sorintg "+intList);
	Collections.sort(intList);
	System.out.println("After"+intList);
	}
	
 }
