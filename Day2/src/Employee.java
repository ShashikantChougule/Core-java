
public abstract class Employee {

	int Emp_id;
	String Emp_name;
	private MyDate mydate;
	private static Address address;
	private static String CompanyName;
	
	static
	{
		CompanyName="CitiusTech";
	}
	
	public abstract double calsal();
	
	
	public Employee(int i, String string, MyDate myDate2, String string2, int j, Address address2)
	{
		this.Emp_id=3232;
		this.Emp_name="John";
		this.mydate=new MyDate();
		this.setAddress(new Address());
		
	}
	
	public Employee(int id,String name,MyDate mydate,Address address)
	{
		this.Emp_id=id;
		this.Emp_name=name;
		this.mydate=mydate;
		this.setAddress(address);
	}
	/*
	 * public void init() { Emp_id=5768; Emp_name="Shivraj"; }
	 */
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public void display()
	{
		System.out.println("Company Name : "+CompanyName +" Employee ID: "+Emp_id);
		System.out.println("Joining");
		mydate.displayDate();
		System.out.println("Employee Address");
		getAddress().displayAddress();

	}
	
	public void setEmloyee(int id,String name)
	{
		Emp_id=id;
		Emp_name=name;
	}

	public static Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
	
