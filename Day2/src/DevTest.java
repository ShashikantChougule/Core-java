
public class DevTest {

	public static void main(String[] args) {

		Developer dev1=new Developer();
		dev1.display();
		System.out.println("==============================");
		
		MyDate d1=new MyDate(07,"April",2021);
		Address adrs=new Address("India","Delhi","Noida");
		Developer dev2=new Developer(1234,"Shivraj",d1,adrs,"HDFC Bank",25);
		dev2.display();
		System.out.println("==============================");
		
		SrDeveloper sdev1=new SrDeveloper();
		sdev1.display();
		System.out.println("=========================");
		
		MyDate d2=new MyDate(07,"April",2021);
		Address adrs2=new Address("India","Delhi","Noida");
		SrDeveloper sdev2=new SrDeveloper(1234,"Shivraj",d1,adrs,"HDFC Bank",25,5);
		sdev2.display();
		
	}

}
