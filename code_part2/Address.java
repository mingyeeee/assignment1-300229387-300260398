public class Address {
	private String street;
	private int number;
	private String postal;
	
	public Address (String street, int number, String postal) {
		this.street = street;
		this.number = number;
		this.postal = postal;
	}
	
	public String getStreet() {
		return street;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getPostal() {
		return postal;
	}
}
