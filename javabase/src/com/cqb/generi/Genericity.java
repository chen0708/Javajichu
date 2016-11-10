package com.cqb.generi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Genericity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(12);
		list.add(13);
		list.add(14);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		
		for (Object object : list) {
			System.out.println(object);
		}
	//	list.add(new String("AA"));
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			Object obj =(Object)iter.next();
			System.out.println(obj);
		}
	}

}
