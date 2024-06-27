package Store;

import Observable.StockObservable;
import Observable.IphoneObservable;
import Observable.CerealObservable;
import Observer.StockObserver;
import Observer.EmailObserver;
import Observer.MobileObserver;

public class Main {
public static void main(String[] args) {
	
	StockObservable iphone=new IphoneObservable(3);
	StockObservable cereal=new CerealObservable(3);
	
	
	//create observer
	StockObserver mobileobserver1=new MobileObserver("Praveen");
	StockObserver mobileobserver2=new MobileObserver("Prav");
	StockObserver mobileobserver3=new MobileObserver("veen");
	StockObserver mobileobserver4=new MobileObserver("Pan");
	
	
	StockObserver emailobserver1=new EmailObserver("pavi@gmail.com");
	StockObserver emailobserver2=new EmailObserver("avi@gmail.com");
	StockObserver emailobserver3=new EmailObserver("thini@gmail.com");
	
	iphone.addObserver(emailobserver1);
	iphone.addObserver(mobileobserver1);
	iphone.addObserver(mobileobserver4);
	
	cereal.addObserver(emailobserver3);
	cereal.addObserver(mobileobserver4);
	
	iphone.setData(10);
	cereal.setData(9);
}
}
