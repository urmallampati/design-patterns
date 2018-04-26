package factorymethod;

import factorymethod.product.Beetle;
import factorymethod.product.Car;
import factorymethod.product.CarType;
import factorymethod.product.Golf;

public class CarFactory {
	public static Car createCar(CarType carType) {
		if (carType.equals(CarType.Beetle)) {
			return new Beetle();
		}
		if (carType.equals(CarType.Golf)) {
			return new Golf();
		}
		return null;

	}

}
