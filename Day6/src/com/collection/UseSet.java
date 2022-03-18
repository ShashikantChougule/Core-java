package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UseSet {
	public static void main(String[] args) {
		
		Set<String> nameSet=new HashSet<String>();
		nameSet.add("Shashi");
		nameSet.add("Vijay");
		nameSet.add("SuJAY");
		nameSet.add("Akshay");
		nameSet.add("Shashi");
		
		Iterator<String> itr=nameSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		TreeSet<String> names=new TreeSet<String>();
		names.addAll(nameSet);
		 System.out.println(names);
		
		
	}

}
