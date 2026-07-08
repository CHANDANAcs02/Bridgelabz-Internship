//==========================
// File : Payment.java
//==========================
package com.bridgelabz.objectmodeling;

public interface Payment {

	void pay(double amount);

}

//==========================
// File : UpiPayment.java
//==========================
package com.bridgelabz.objectmodeling;

public class UpiPayment implements Payment {

	@Override
	public void pay(double amount) {

		System.out.println("Paid ₹" + amount + " using UPI.");
	}

}

//==========================
// File : CreditCardPayment.java
//==========================
package com.bridgelabz.objectmodeling;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {

		System.out.println("Paid ₹" + amount + " using Credit Card.");
	}

}

//==========================
// File : DebitCardPayment.java
//==========================
package com.bridgelabz.objectmodeling;

public class DebitCardPayment implements Payment {

	@Override
	public void pay(double amount) {

		System.out.println("Paid ₹" + amount + " using Debit Card.");
	}

}

//==========================
// File : NetBankingPayment.java
//==========================
package com.bridgelabz.objectmodeling;

public class NetBankingPayment implements Payment {

	@Override
	public void pay(double amount) {

		System.out.println("Paid ₹" + amount + " using Net Banking.");
	}

}

//==========================
// File : Checkout.java
//==========================
package com.bridgelabz.objectmodeling;

public class Checkout {

	public void processPayment(Payment payment, double amount) {

		payment.pay(amount);
	}

}

//==========================
// File : PaymentApplication.java
//==========================
package com.bridgelabz.objectmodeling;

public class PaymentApplication {

	public static void main(String[] args) {

		Checkout checkout = new Checkout();

		checkout.processPayment(new UpiPayment(), 1200);

		checkout.processPayment(new CreditCardPayment(), 2500);

		checkout.processPayment(new DebitCardPayment(), 1800);

		checkout.processPayment(new NetBankingPayment(), 3500);

	}

}