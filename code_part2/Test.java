public class Test {
	
	private Employee o1;
	
	public static void main(String[] args) {
		Address[] addresses = new Address[]{
			new Address("Queen", 48, "K1P1N2"),
			new Address("King Edward",800, "K1N6N5"),
			null, null, null, null
		};
		
		Employee o1 = new Employee(
			"Falcao",
			40,
			15.50,
			addresses
		);
	}
}
