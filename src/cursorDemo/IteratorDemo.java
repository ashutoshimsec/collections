package cursorDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo implements Iterable{

	public class Employee{
		
		private int id;
		private String name;
		private int age;
		
		public Employee(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
		}
		
		
	}

	private List<Employee> emp = null;
	
	public IteratorDemo(List<Employee> e) {
		super();
		this.emp = e;
	}



	public IteratorDemo() {
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {

		LinkedList<IteratorDemo.Employee> ll = new LinkedList<IteratorDemo.Employee>();

		IteratorDemo itd = new IteratorDemo();
		
		//IteratorDemo.Employee emp = itd.new Employee(0, null, 0);
	
		ll.add(itd.new Employee(1, "Ashu", 28));
		ll.add(itd.new Employee(2, "Amit", 24));
		ll.add(itd.new Employee(3, "Alok", 28));
		ll.add(itd.new Employee(4, "Dipu", 29));
		ll.add(itd.new Employee(5, "Praju", 75));
		ll.add(itd.new Employee(7, "Annu", 28));
		ll.add(itd.new Employee(6, "Manisha", 26));
		ll.add(itd.new Employee(9, "Ashish", 28));
		ll.add(itd.new Employee(8, "Manish", 28));
		
		
		Iterator<IteratorDemo.Employee> itr  = ll.iterator();

		
		while(itr.hasNext()){
			System.out.println("the employee is => "+itr.next());
		}
		
	}



	@Override
	public Iterator iterator() {
		System.out.println("Custom iterator get called");
		return emp.iterator();
	}




}
