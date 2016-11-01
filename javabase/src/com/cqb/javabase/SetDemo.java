package com.cqb.javabase;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		// TODO Auto-generated method stub
		Set<Integer> intset = new HashSet<Integer>();
		Set<Integer> intset1 = new HashSet<Integer>();
		Set<String> strset = new HashSet<String>();
		intset1.add(1);
		intset1.add(2);
		intset1.add(3);
		intset1.add(4);
		out.println("intset1 : " + intset1);

		out.println("intset1.size() : " + intset1.size());

		intset1.add(3);
		intset1.add(3);
		intset1.add(3);
		intset1.add(3);
		intset1.add(3);
		out.println("intset1: " + intset1);

		intset1.add(5);
		out.println("intset1: " + intset1);

		intset1.toArray();
		out.println("intset1.toArray(): " + intset1.toArray());

		Object[] arr = intset1.toArray();
		out.print("arr[]元素为 ： ");
		for (Object i : arr) {
			out.print(i + " ");
		}
		out.println("");

		for (int i = 1; i <= 8; i++) {
			intset.add(i);
		}
		out.println("intset: " + intset);

		out.println("intset.contains(intset1): " + intset.contains(intset1));

		// intset.remove(intset1);
		intset.remove(3);
		out.println(" intset.remove(3): " + intset);

		intset.removeAll(intset1);
		out.println("intset.removeAll(intset1): " + intset);

		out.println("intset.isEmpty(11): " + intset.isEmpty());

		out.println("intset.containsAll(intset1): " + intset.containsAll(intset1));

	}

}
