
public class TestEmp {
	
	public static void displayEmployee(Employee eref[]) {
		for(Employee e:eref) {
			e.display();
			
			System.out.println("Salary is:"+e.calsal());
			//using rtti anf type casting
			/*if(e instanceof SalesPerson)
				System.out.println("sales person insentiv:"+((SalesPerson)e).calinsentiv());*/
			if(e instanceof SrDeveloper) {
				System.out.println("SrDeveloper Insentiv:"+((SrDeveloper)e).cal_Intensive());
			}
			System.out.println("*****************");
		
		}
	}

	public static void main(String[] args) {
		
		/*WageEmployee we=new WageEmployee(0, null, null, null, 0, 0, 0, 0);
		we.display();
		System.out.println("--------------------------------");
		
		MyDate d1=new MyDate(07,"April",2021);
		Address adrs=new Address("India","Delhi","Noida");
		
		WageEmployee we1=new WageEmployee(789,"Salman",d1,adrs,2,8000, 0, 0);
		we1.display();
		
		System.out.println("---------------------------");
		WageEmployee we2=new WageEmployee(232,"Rohit",new MyDate(9,"July",2021),new Address("India","MP","Bhilwada"),7,23243, 0, 0);
		we2.display();*/
		
		MyDate d1=new MyDate(1,"jun",1740);
		Address add=new Address();
		
		Employee e[]=new Employee[2];
		//e[0]=new Employee(1, "shashi", new MyDate(3, "june",6367),new Address("India", "MH", "Sangli"));
		//e[1]=new WageEmployee(232,"Rohit",new MyDate(9,"July",2021),new Address("India","MP","Bhilwada"),7,23243, 0, 0);
		displayEmployee(e);
		
	
		
	}

}

