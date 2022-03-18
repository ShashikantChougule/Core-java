package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer, String> empMap=new HashMap<Integer, String>();
		empMap.put(101, "Sam");
		empMap.put(102, "Geeta");
		empMap.put(103, "Seeta");
		empMap.put(104, "Seeta");
		
		System.out.println(empMap.get(101));
		
		System.out.println(empMap.containsKey(102));
		
		Set<Integer> keySet=empMap.keySet();
		System.out.println(keySet);
		Iterator<Integer> itr=keySet.iterator();
		while(itr.hasNext()) {
			Integer ikey=itr.next();
			System.out.println("Key Is : "+ikey+"\t Value : "+empMap.get(ikey));
		}
		

	}

}
