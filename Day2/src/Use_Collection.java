import java.util.TreeSet;

public class Use_Collection {
	
	
	public static void main(String[] args)
	{
	TreeSet<Employee> t = new TreeSet<Employee>();
	t.add(new Employee(5,"ram",30000));
	Employee e1=new Employee(2,”shyam”, 40000);
	t.add(e1);
	t.add(new Employee(1,”sita”,60000));
	System.out.println(t);
	}
	}


