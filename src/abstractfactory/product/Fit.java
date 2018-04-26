package abstractfactory.product;

public class Fit implements Car {
	private String manufacturer;

	public Fit(String manufacturer) {
		super();
		this.manufacturer = manufacturer;
	}

	public void drive() {
		System.out.println("Driving Fit " + " manufactured by " + manufacturer);
	}
}
