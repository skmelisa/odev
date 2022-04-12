package yazilimodevi;

public class Address {
	private String streetAddress;
	private String city;
	private String state;
	private long zipCode;
	
	public Address (String street, String town, String st, long zip) {
		
		this.streetAddress=street;
		this.city=town;
		this.state=st;
		this.zipCode=zip;
	}

}
