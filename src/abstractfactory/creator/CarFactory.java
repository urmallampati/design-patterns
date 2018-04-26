package abstractfactory.creator;

import abstractfactory.product.Car;

public interface CarFactory {
	public Car makeCar(CarModel carModel);
}
