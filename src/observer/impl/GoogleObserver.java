package observer.impl;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoogleObserver implements Observer {
	private int googlePrice;
	private int observerId;
	private static int observerCounter = 0;

	public GoogleObserver() {
		observerCounter++;
		observerId = observerCounter;
	}

	@Override
	public void update(int googlePrice) {
		setGooglePrice(googlePrice);
		System.out.println(
				"Hello there " + this.observerId + " Just to notify that the google price updated to " + googlePrice);
	}

}
