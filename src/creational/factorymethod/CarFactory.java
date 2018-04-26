package creational.factorymethod;

import creational.factorymethod.product.Beetle;
import creational.factorymethod.product.Car;
import creational.factorymethod.product.CarType;
import creational.factorymethod.product.Golf;

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
