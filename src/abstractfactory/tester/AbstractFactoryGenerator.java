package abstractfactory.tester;

import abstractfactory.creator.CarFactory;
import abstractfactory.creator.HondaCarFactory;
import abstractfactory.creator.VolkswagenFactory;

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
