package listDemo;

//package myCollections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class ToCompair implements Comparable<ToCompair>
{
	private String name;
	private int age;
	private String platform;
	
	public ToCompair(String name, int age, String platform)
	{
		this.name = name;
		this.age = age;
		this.platform = platform;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}


	public String toString()
	{
		return this.getName()+" "+this.getAge()+" "+this.getPlatform();
	}
	
	public int compareTo(ToCompair tc)
	{
		ToCompair c = (ToCompair)tc;
		return c.getAge()>this.getAge() ? 1 :c.getAge()<this.getAge() ? -1 :0;
 
	}
	
	public boolean equals(ToCompair tc)
	{
		if(this == tc)
			return true;
		
		if(this.getAge() == tc.getAge())
			return true;
		if(tc.getClass() != this.getClass() || tc==null)
			return false;
		else
			return false;
		
	}
	
}

public class MyComparable{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToCompair tc1 = new ToCompair("Ashutosh Kumar",26,"JAVA");
		ToCompair tc2 = new ToCompair("Amit Kumar",23,"C");
		ToCompair tc3 = new ToCompair("Alok Gupta",25,"PHP");
		ToCompair tc4 = new ToCompair("Amit Parmar",28,"JAVA");
		
		List<ToCompair> l = new ArrayList<ToCompair>();
		l.add(tc1);
		l.add(tc2);
		l.add(tc3);
		l.add(tc4);
		
		Collections.sort(l);
		System.out.println(l);
    }

	

}
