package abstractfactory.product;

public class Golf implements Car {
	private String manufacturer;

	public Golf(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public void drive() {
		System.out.println("Driving Golf " + " manufactured by " + manufacturer);

	}

}
