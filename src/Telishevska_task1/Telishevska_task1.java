package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaList2 {

	public static void main(String[] args) {

		List<String> Elements = new ArrayList<String>();
		
		Elements.add("a2");
		Elements.add("b3");
		Elements.add("e1");
		Elements.add("e1");
		Elements.add("a1");
		Elements.add("n1");
		Elements.add("t1");
		Elements.add("e1");
		
		System.out.println("ArrayList Elements");
		System.out.print("\t" + Elements);

		
		int k=(Elements.size()/2);
		for (int i = 0; i < k; i++) {
			if (Elements.get(i).equals("e1")) {
				Elements.set(i, "e2");
			}
		}
		System.out.println("\t");
		System.out.println("Sorted list of Elements are");
		System.out.print("\t" + Elements);
		
	
	}

}

