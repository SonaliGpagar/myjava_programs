package collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_class {

	public static void main(String[] args) {
		 List<Integer> li = new ArrayList<Integer>();
		 li.add(565);
		 li.add(758);
		 li.add(456);
		 li.add(453);
		 li.add(899);
		 li.add(342);
		 System.out.println(li);
		 
		 //sorting using collection class utility methods
		Collections.sort(li);
		System.out.println("after sorting elements: " + li);
		
		 //reverse element
		 Collections.reverse(li);
		 System.out.println("reverse elements : " + li);
		
		//findind max
		int max = Collections.max(li);
		System.out.println("Maximum elements: " + max);
		
		//finding min
		int min = Collections.min(li);
		System.out.println("Minimum elements: " + min);
		
		 //shuffle element
		Collections.shuffle(li);
		 System.out.println("shuffle elements :" + li);
		 
		 //swapping
		Collections.swap(li, 1, 2);
		 System.out.println("swapping elements : " + li);
		 
		 //rotate(shift at last position)
		 Collections.rotate(li, 1);
		 System.out.println("rotate elements :" + li);
		 
		 //frequency
		System.out.println( Collections.frequency(li, 899));
		
		//replace old value to new value
		Collections.replaceAll(li, 565, 111);
		System.out.println(li);
		
		//disjoint(check two collections have any elements in common or not.)
		 // //It returns true if no any elements are common.
		 List<Integer> lii = new ArrayList<Integer>();
		 lii.add(565);
		 lii.add(758);
		 lii.add(456);
		 lii.add(453);
		 lii.add(899);
		 lii.add(341);
		System.out.println(Collections.disjoint(li, lii));
		
		 
		
		
		 
	}

}
