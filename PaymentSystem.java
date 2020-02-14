package com.sanita.paysystem;

import java.util.ArrayList;
import java.util.List;

public class Payee {
	private List<> payees;
	
	public PaymentSystem() {
		payees = new ArrayList<>();
	}
	public void addPayee(Payee payee) {
		if (!payees.contains(payee)) {
			payees.add(payee);
		}
	}
	public void processPayments() {
		for(Payee payee : payees) {
			double grossPayment = payee.grossPayment();
			System.out.println("Paying to " + payee.name());
			System.out.println("Gross" + grossPayment);
			System.out.println("Transfered to account: " + payee.bankAccount());
		}
	}
}

}
