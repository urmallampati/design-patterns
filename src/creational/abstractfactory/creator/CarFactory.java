package creational.abstractfactory.creator;

import creational.abstractfactory.product.Car;

public interface CarFactory {
	public Car makeCar(CarModel carModel);
}
