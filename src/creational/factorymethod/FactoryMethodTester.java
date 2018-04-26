package creational.factorymethod;

import creational.factorymethod.product.Car;
import creational.factorymethod.product.CarType;

/*
 * Factory Method is used to create one product (here Product of type Car).
 * java.util.concurrent.Executors contains Factory and utility methods for creating 
 * ExecutorService, ScheduledExecutorService, ThreadFactory, Callable.
 * For instance, consider ThreadFactory. 
 * There are two methods for returning more specialized types of ThreadFactory:
 *  **** Executors::defaultThreadFactory() returns DefaultThreadFactory
 *       instance that is specialized form of ThreadFactory.
 *  **** Executors::privilegedThreadFactory() returns PrivilegedThreadFactory
 *       instance that is a more specialized form of ThreadFactory.
 *  
 */
public class FactoryMethodTester {
	public static void main(String args[]) {
		CarFactory factory = new CarFactory();
		Car beetleCar = factory.createCar(CarType.Beetle);
		beetleCar.drive();
		Car golfCar = factory.createCar(CarType.Golf);
		golfCar.drive();
	}
}
