package creational.abstractfactory.creator;

import creational.abstractfactory.product.Beetle;
import creational.abstractfactory.product.Car;
import creational.abstractfactory.product.Golf;

public class VolkswagenFactory implements CarFactory {
	private static final String MANUFACTURER = "Volkwagen";

	@Override
	public Car makeCar(CarModel carModel) {
		if (carModel.equals(CarModel.Beetle)) {
			return new Beetle(MANUFACTURER);
		} else if (carModel.equals(CarModel.Golf)) {
			return new Golf(MANUFACTURER);
		}
		return null;
	}
}
