package observer.impl;

public class Tester {
	private static Subject subject = new SubjectImpl();

	public static void main(String args[]) {
		Observer gObserverOne = new GoogleObserver();
		Observer gObserverTwo = new GoogleObserver();
		Observer gObserverThree = new GoogleObserver();
		// Register all google observers
		subject.register(StockTypes.GOOGLE, gObserverOne);
		subject.register(StockTypes.GOOGLE, gObserverTwo);
		subject.register(StockTypes.GOOGLE, gObserverThree);

		// Change google price
		subject.setGooglePrice(101);

		// Unregister google observer
		subject.unRegister(StockTypes.GOOGLE, gObserverOne);

		// change google price
		subject.setGooglePrice(99);

		Observer iObserverOne = new IBMObserver();
		Observer iObserverTwo = new IBMObserver();

		subject.register(StockTypes.IBM, iObserverOne);
		subject.register(StockTypes.IBM, iObserverTwo);

		subject.setIbmPrice(43);

		subject.unRegister(StockTypes.IBM, iObserverTwo);
		subject.setIbmPrice(33);

	}
}
