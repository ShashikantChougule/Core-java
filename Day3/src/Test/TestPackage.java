package Test;
import java.time.LocalDate;
import batch.Batch;
import stud.Student;

import static stud.Student.getStudCount;



public class TestPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		Batch b;
		b=new Batch(1, "Java", "Core Java", "Pune",date);
		b.displayBatchInfo();
		
		Batch b1=new Batch(121, ".Net", "C#", "Pune", LocalDate.of(2021, 12, 5));		
		
		System.out.println("student Count: "+getStudCount());
		stud.Student stud;
		stud=new stud.Student(2, "Ajay", b);
		stud.display();
		
		Student s1=new Student(5, "Vikas", b1);
		s1.display();
		}
       

}
