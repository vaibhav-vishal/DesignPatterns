package crea.pattern.prototype;

public class Client {

	public static void main(String[] args) {
		Employee orginal = new Employee(101, "Harvey Spectre");

		Employee prototype = null;

		try {
			prototype = (Employee) orginal.clone();
			prototype.setEmployeeName("Loius Litt");
		} catch (Exception e) {
		}
		System.out.println("Original " + orginal);
		System.out.println("Prototype " + prototype);

	}

}
