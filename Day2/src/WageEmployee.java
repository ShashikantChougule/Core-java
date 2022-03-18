
public  class WageEmployee extends Employee{
	
	private int hrs;
	private int rate;
	public int calinsentiv;
	
	public WageEmployee(int i, String string, MyDate myDate, Address address, int j, int k, int price, int quantity){
		super();
		this.hrs=hrs;
		this.rate=rate;
		
		
	}
	
	public WageEmployee(int empId,String empName,MyDate Joindate,int hrs,int rate,Address Address) {
		super(empId,empName,Joindate,Address);
		this.hrs=hrs;
		this.rate=rate;
	}
	public void display() {
		super.display();
		System.out.println("Hrs: "+hrs+"\t Rate: "+rate);
	}

	@Override
	public double calsal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
