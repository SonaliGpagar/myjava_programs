package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		c1.add("sjkdjk");
		c1.add("nfhns");
		c1.add("skjadhi");
		c1.add("snadJ");
		System.out.println(c1);
		c1.add("cc");
		c1.add("cc");
		c1.add(null);
		c1.add(null);
		c1.add(null);
		System.out.println(c1);
		c1.remove("cc");
		System.out.println(c1);
		c1.removeAll(c1);
		System.out.println(c1);
		
		

		
	}
}
