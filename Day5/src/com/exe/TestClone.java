package com.exe;

import com.util.MyDate;

public class TestClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		MyDate d1=new MyDate(2, "Mrach", 2019);
		System.out.println(d1);
		
		MyDate copyCat=d1.clone();
		System.out.println(copyCat);
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
