package com.collection;

import java.util.HashMap;
import java.util.Map;

class Dog1 {
	String name;

	public Dog1(String n) {
		name = n;
	}

	public boolean equals(Object o) {
		if ((o instanceof Dog1) && (((Dog1) o).name == name)) {
			return true;
		} else {
			return false;
		}
	}

	public int hashcode() {
		return name.length();
	}
}

class cat {
}

enum Pets {
	DOG, CAT, HOURSE
}

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map m = new HashMap();
		m.put("K1", new Dog1("aiko"));
		m.put("K2", Pets.DOG);
		m.put(Pets.CAT, "cat key");
		Dog1 d1 = new Dog1("clover");
		m.put(d1, "Dog key");
		m.put(new cat(), "Cat key");

		System.out.println(m.get("K1"));
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new cat()));
		System.out.println(m.size());

	}

}
