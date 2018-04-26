package abstractfactory.product;

public class Accord implements Car {
	private String manufacturer;

	public Accord(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void drive() {
		System.out.println("Driving Accord " + " manufacturered by " + manufacturer);
	}
}
