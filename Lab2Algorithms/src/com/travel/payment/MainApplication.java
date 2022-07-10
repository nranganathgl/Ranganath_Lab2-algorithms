package com.travel.payment;

import com.travel.payment.model.CurrencyDenominationAndPayment;
/**
 * 
 * @author ranganath
 *
 *Main program for currency denominations
 */
public class MainApplication {

	public static void main(String[] args) {

		CurrencyDenominationAndPayment object = new CurrencyDenominationAndPayment();
		
		try {
			object.insertDenomination();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
