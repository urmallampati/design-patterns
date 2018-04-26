package abstractfactory.product;

public class Beetle implements Car {
	private String manufacturer;

	public Beetle(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public void drive() {
		System.out.println("Driving Beetle" + " manufactured by " + manufacturer);

	}

}
