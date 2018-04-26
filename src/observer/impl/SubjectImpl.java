package observer.impl;

public class SubjectImpl implements Subject {
	private int googlePrice;
	private int ibmPrice;

	public SubjectImpl() {
	}

	@Override
	public void register(StockTypes type, Observer observer) {
		if (observer != null) {
			if (type.equals(StockTypes.IBM)) {
				ibmObservers.add(observer);

			} else if (type.equals(StockTypes.GOOGLE)) {
				googleObservers.add(observer);
			}
		}

	}

	@Override
	public void unRegister(StockTypes type, Observer observer) {
		if (observer != null) {
			if (type.equals(StockTypes.IBM)) {
				// Subject need to know about the IBMObserver impl class here.
				// We can alternatively use [ibmObservers.indexOf(observer) + 1]
				// to get ObserverId.
				// However, the observerId deduction is dependent on the
				// assumption that Ids start with 1.
				// What if it starts with 0 tomorrow. So, this is a tradeoff.
				System.out.println("Removing IBM observer with id " + ((IBMObserver) observer).getObserverId());
				ibmObservers.remove(observer);
			} else if (type.equals(StockTypes.GOOGLE)) {

				System.out.println("Removing Google observer with id " + ((GoogleObserver) observer).getObserverId());
				googleObservers.remove(observer);
			}
		}

	}

	@Override
	public void notifyObserver(StockTypes type) {
		if (type.equals(StockTypes.IBM)) {
			ibmObservers.forEach((observer) -> observer.update(ibmPrice));
		} else if (type.equals(StockTypes.GOOGLE)) {
			googleObservers.forEach((observer) -> observer.update(googlePrice));
		}
	}

	@Override
	public void setGooglePrice(int googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver(StockTypes.GOOGLE);
	}

	@Override
	public void setIbmPrice(int ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver(StockTypes.IBM);

	}

}
