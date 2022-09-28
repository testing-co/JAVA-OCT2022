package com.heidichen.abstractdemo;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Payment laptop = new Payment(2000);
		CashPayment taco = new CashPayment(1.5);
		taco.pay();
		
		CreditCardPayment laptop = new CreditCardPayment(2000, "4242424242424242", "Heidi", "09/26");
		laptop.pay();
		
	}

}
