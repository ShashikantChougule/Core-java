package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class UseList {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(100);
		list.add(123);
		list.add("Hello");
		list.add(true);
		
		for(Object obj:list) {
			if(obj instanceof Integer) {
				Integer ival=(Integer) obj;
				System.out.println("Integer values : "+ival);
			}
			if(obj instanceof String) {
				String str=(String) obj;
				System.out.println("String values : "+str);
			}
			if(obj instanceof Boolean) {
				Boolean b=(Boolean) obj;
				System.out.println("Boolean values : "+b);
			}
		}
		
		
		List<Integer> intlist=new ArrayList<Integer>();
		intlist.add(12);
		intlist.add(34);
		intlist.add(45);
		intlist.add(34);
		
		System.out.println("List contains : "+intlist);
		
		List<Integer> marklist=new Vector<Integer>();
		marklist.addAll(intlist);
		marklist.add(67);
		marklist.add(56);
		marklist.add(89);
		
		marklist.remove(0);
		System.out.println("List contains : "+marklist.contains(67));
		System.out.println("Size of the collection : "+marklist.size());
		
		
		Iterator<Integer> itr=marklist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
