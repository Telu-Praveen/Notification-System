package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.StockObserver;

public class CerealObservable implements StockObservable {
	
	List<StockObserver> observerlist;
	int count;

	
	
	public CerealObservable(int count) {
		super();
		this.observerlist = new ArrayList<>();
		this.count = count;
	}

	@Override
	public void addObserver(StockObserver stockobserver) {
		System.out.println("Added cereal stock observer to the list");
		observerlist.add(stockobserver);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(StockObserver stockobserver) {
		observerlist.remove(stockobserver);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
System.out.print("Notifying all subscribers for Cereals");
		
		for(StockObserver stockobserver:observerlist) {
			stockobserver.update(this);
		}
		
	}

	@Override
	public void setData(int newcount) {
		if(newcount==0) {
			System.out.println("Stock is Zero");
		}
		else if(newcount>0) {
			notifyObservers();
			this.count=newcount;
		}else {
			System.out.println("The Product count cannot be zero ");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return count;
	}

}
