package creational.abstractfactory.creator;

import creational.abstractfactory.product.Accord;
import creational.abstractfactory.product.Car;
import creational.abstractfactory.product.Fit;

public class HondaCarFactory implements CarFactory {
	private static final String MANUFACTURER = "Honda";

	@Override
	public Car makeCar(CarModel carModel) {
		if (carModel.equals(carModel.Accord)) {
			return new Accord(MANUFACTURER);
		} else if (carModel.equals(carModel.Fit)) {
			return new Fit(MANUFACTURER);
		}
		return null;
	}

}
