package collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_prop_Sorting {

	public static void main(String[] args) {
		 List<Integer> li = new ArrayList<Integer>();
		 li.add(45);
		 li.add(67);
		 li.add(43);
		 li.add(33);
		 li.add(11);
		 li.add(23);
		 System.out.println(li);
		 
		 //sorting using collection class utility methods
		Collections.sort(li);
		System.out.println("after sorting elements: " + li);
	}

}
