package Observer;

import Observable.StockObservable;

public class MobileObserver implements StockObserver {
	String username;

	public MobileObserver(String username) {
		this.username = username;
	}

	@Override
	public void update(StockObservable stockObservable) {
popup();
	}
	private void popup() {
		System.out.println("Notification received by user "+ username);
	}
}
