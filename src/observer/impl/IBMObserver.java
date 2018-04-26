package observer.impl;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IBMObserver implements Observer {
	private int ibmPrice;
	private int observerId;
	private static int observerCounter = 0;

	public IBMObserver() {
		observerCounter++;
		observerId = observerCounter;

	}

	@Override
	public void update(int price) {
		setIbmPrice(price);
		System.out.println(
				"Hello there " + this.observerId + " Just to notify that the ibm price updated to " + ibmPrice);
	}

}
