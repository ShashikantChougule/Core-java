
public class Developer extends Employee {

	
	private String project_Name;
	private int no_Of_Days_Working;
	
	
	public Developer() {
		super();
		this.project_Name = "CitiusTech HealthCare";
		this.no_Of_Days_Working = 27;
	}

	public Developer(int id,String name,MyDate mydate,Address address,String project_Name, int no_Of_Days_Working) {
		super(id,name,mydate,address);
		this.project_Name = project_Name;
		this.no_Of_Days_Working = no_Of_Days_Working;
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Developer Intensive :"+cal_Intensive());
	}
	
	public int cal_Intensive()
	{
		return ((400+777)*no_Of_Days_Working);
	}



	public double calsal() {
      return 0;
	}
	
	
}
