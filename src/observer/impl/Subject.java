package observer.impl;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
	public List<Observer> googleObservers = new ArrayList<>();
	public List<Observer> ibmObservers = new ArrayList<>();

	public void register(StockTypes type, Observer observer);

	public void unRegister(StockTypes type, Observer observer);

	public void notifyObserver(StockTypes type);

	public void setGooglePrice(int googlePrice);

	public void setIbmPrice(int googlePrice);
}
