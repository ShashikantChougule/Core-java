
public class SrDeveloper extends Developer {

	private int no_dev_report;

	
	public SrDeveloper() {
		super();
		this.no_dev_report = 24;
	}

	public SrDeveloper(int id,String name,MyDate mydate,Address address,String project_Name, int no_Of_Days_Working,int no_dev_report) {
		super(id, name, mydate, address, project_Name,  no_Of_Days_Working);
		this.no_dev_report = no_dev_report;
	}

	public void display()
	{
		super.display();
		System.out.println("Senior Developer Intensive :"+special_INT());
	}
	
	public int special_INT()
	{
		int intensive=super.cal_Intensive();
		int spcl_Intensive=(1000*no_dev_report);
		return (intensive+spcl_Intensive);
	}
	public double calsal() {
       return 0;
	}
	
	
}
