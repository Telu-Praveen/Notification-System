package Observer;

import Observable.StockObservable;

public class EmailObserver implements StockObserver {
    String email;
    
    
	public EmailObserver(String email) {
		this.email = email;
	}


	@Override
	public void update(StockObservable stockObservable) {
		sendemail(email);
		
	}
	private void sendemail(String email) {
		System.out.println("email is sent to"+email);
	}

}
