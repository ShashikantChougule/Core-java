package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(12);
		intList.add(20);
		intList.add(22);
		intList.add(120);
		intList.add(23);
		
		
		System.out.println("List Data : "+intList);
		
		Collections.sort(intList);
		
		System.out.println("Scored List : "+intList);
		
		List<Employee> empList=new ArrayList<Employee>();
		 empList.add(new Employee(1, "Shashi", 235667));
		 empList.add(new Employee(2, "Vikas", 23557));
		 empList.add(new Employee(3, "Ajay", 2357));
		 empList.add(new Employee(4, "Vijay", 276667));
		
		for(Employee e: empList) {
			System.out.println(e);
		}
		
		
		Collections.sort( empList);// by default go for comparable logic
		System.out.println("Sorted list : ");
		for(Employee e: empList) {
			System.out.println(e);
		}
		
		System.out.println("Sorting Employee with name");
		Collections.sort( empList,new EmpNameCompareImpl());//go for comparator logic
		System.out.println("Sorted list: ");
		for(Employee e: empList) {
			System.out.println(e);
		}
	}
}
