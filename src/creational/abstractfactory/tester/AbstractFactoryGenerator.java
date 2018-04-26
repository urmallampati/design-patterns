package creational.abstractfactory.tester;

import creational.abstractfactory.creator.CarFactory;
import creational.abstractfactory.creator.HondaCarFactory;
import creational.abstractfactory.creator.VolkswagenFactory;

public class AbstractFactoryGenerator {
	public static CarFactory getCarFactory(CarManufacturer manufacturer) {

		if (manufacturer.equals(CarManufacturer.HONDA)) {
			return new HondaCarFactory();
		} else if (manufacturer.equals(CarManufacturer.VOLKSWAGEN)) {
			return new VolkswagenFactory();
		}
		return null;

	}
}
