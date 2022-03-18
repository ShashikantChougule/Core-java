package stud;

import batch.Batch;

public class Student {
	private int studId;
	private String studName;
	private Batch batch;
	private static int studCount;
	
	public Student() {
		studId=1;
		studName="some name";
		batch=new Batch();
		studCount ++;
		
	}
	public static int getStudCount() {
		return studCount;
	}

	public Student(int studId, String studName, Batch batch) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.batch = batch;
	}
	
	public void display() {
		System.out.println("Student Id: "+studId);
		System.out.println("Student Name: "+studName);
		System.out.println("Batch Info:");
		batch.displayBatchInfo();
	}


	
}
