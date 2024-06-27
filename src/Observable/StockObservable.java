package Observable;

import Observer.StockObserver;

public interface StockObservable {

	public void addObserver(StockObserver stockobserver);

	public void removeObserver(StockObserver stockobserver);

	public void notifyObservers();

	public void setData(int count);

	public int getData();

}
