
public class Address {
	
	private String Country;
	private String State;
	private String city;
	
	public Address()
	{
		//System.out.println("0-argument constructor");
		this.Country="India";
		this.State="MH10";
		this.city="Sangli-vita";
	}
	
	public Address(String country, String state, String city) {
		Country = country;
		State = state;
		this.city = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	public void displayAddress() 
	{
		System.out.println("Address [Country=" + Country + ", State=" + State + ", city=" + city + "]");
	}

	@Override
	public String toString() {
		return "Address [Country=" + Country + ", State=" + State + ", city=" + city + "]";
	}
	
	

	
}
