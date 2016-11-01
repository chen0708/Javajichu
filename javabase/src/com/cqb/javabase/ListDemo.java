package com.cqb.javabase;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strlist1 = new ArrayList<String>();
		List<String> strlist2 = new ArrayList<String>();
		PrintStream out = System.out;

		out.println("strlist1.size() : " + strlist1.size());
		out.println("strlist2.size() : " + strlist2.size());

		out.println("******************************************");
		strlist1.add("I");
		strlist1.add("love");
		strlist1.add("Girl");
		strlist1.add("!");

		strlist2.add("I");
		strlist2.add("am");
		strlist2.add("cqb");

		out.println("strlist1.size() : " + strlist1.size());
		out.println("strlist2.size() : " + strlist2.size());
		out.println("******************************************");
		out.println("strlist1 : " + strlist1);
		out.println("strlist2 : " + strlist2);
	
		out.println("******************************************");
		strlist1.add("!");
		out.println("strlist1 : " + strlist1);

		out.println("******************************************");
		out.println("strlist1.get(3) : " + strlist1.get(3));

		out.println("******************************************");
         strlist1.contains(strlist2);
 		out.println("strlist1.contains(strlist2) : " +     strlist1.contains(strlist2));

	}

}
