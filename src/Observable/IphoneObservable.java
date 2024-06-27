package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.StockObserver;

public class IphoneObservable implements StockObservable{
	
	List<StockObserver> observerlist;
	int count;
	
	public IphoneObservable(int count) {
		this.count=count;
		this.observerlist=new ArrayList<>();
	}

	@Override
	public void addObserver(StockObserver stockobserver) {
		System.out.println("Added iphone stock observer to the list");
		observerlist.add(stockobserver);
		
	}

	@Override
	public void removeObserver(StockObserver stockobserver) {
		observerlist.remove(stockobserver);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		System.out.print("Notifying all subscribers for Iphone");
		
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
			this.count=count;
		}else {
			System.out.println("The Product count cannot be zero ");
		}
	}

	@Override
	public int getData() {
		
		return count;
		// TODO Auto-generated method stub
	}

}
