package week3.day3;

public class CanaraBank implements Payment {

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("The Cash on delivery selected");
	}

	@Override
	public void upiPayment() {
		// TODO Auto-generated method stub
		System.out.println("The UPI payment selected");
	}

	@Override
	public void cardPayments() {
		System.out.println("The card payment selected");

	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("The Internet banking selected");
	}

	public void recordPaymentDetails() {
		System.out.println("Record Payment details");
	}

}
