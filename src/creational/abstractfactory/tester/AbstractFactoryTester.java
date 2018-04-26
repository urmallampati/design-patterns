package creational.abstractfactory.tester;

import creational.abstractfactory.creator.CarFactory;
import creational.abstractfactory.creator.CarModel;
import creational.abstractfactory.product.Car;

/*
 * Abstract Factory: Provide an interface for creating families of related 
 * or dependent objects without specifying their concrete classes.
 * Remember we added Honda and Volkswagen families here. 
 * May be Volkswagen car factory has some extra fields that 
 * specify a particular way to create a Beetle. 
 * So, the point here is that rather than using a generic
 * CarFactory object factory method we are using a more 
 * specific type and as a result more encapsulation.
 */
public class AbstractFactoryTester {
	public static void main(String args[]) {
		CarFactory hondaFactory = AbstractFactoryGenerator.getCarFactory(CarManufacturer.HONDA);
		CarFactory volkswagenFactory = AbstractFactoryGenerator.getCarFactory(CarManufacturer.VOLKSWAGEN);
		Car accordCar = hondaFactory.makeCar(CarModel.Accord);
		Car fitCar = hondaFactory.makeCar(CarModel.Fit);
		Car beetleCar = volkswagenFactory.makeCar(CarModel.Beetle);
		Car golfCar = volkswagenFactory.makeCar(CarModel.Golf);
		accordCar.drive();
		fitCar.drive();
		beetleCar.drive();
		golfCar.drive();

	}
}
