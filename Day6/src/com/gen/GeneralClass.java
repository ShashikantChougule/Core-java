package com.gen;

public class GeneralClass {

	Object obj;

	public GeneralClass() {

	}

	public GeneralClass(Object obj) {

		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "GeneralClass [obj=" + obj + "]";
	}

}
