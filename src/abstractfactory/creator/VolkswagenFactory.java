package abstractfactory.creator;

import abstractfactory.product.Beetle;
import abstractfactory.product.Car;
import abstractfactory.product.Golf;

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
