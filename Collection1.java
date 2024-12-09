package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("sonali");
		c1.add("25");
		c1.add("TCS");
		c1.add("soft engineer");
		c1.add(43);
		System.out.println(c1);
		
		Collection c2 = new ArrayList();
		c2.addAll(c1);
		c2.add("sonali");
		c2.add("25");
		c2.add("TCS");
		c2.add("soft engineer");
		c2.add(43);
		c2.add("pagar");
		
		System.out.println(c2);
		System.out.println(c1.remove(c2));
		
		
		
	}

}
