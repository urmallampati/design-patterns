package abstractfactory.creator;

import abstractfactory.product.Accord;
import abstractfactory.product.Car;
import abstractfactory.product.Fit;

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
