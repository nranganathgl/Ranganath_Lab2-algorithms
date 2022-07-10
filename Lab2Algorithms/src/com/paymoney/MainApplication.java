package com.paymoney;

import com.paymoney.model.DailyTransactionAndTraget;

/**
 * 
 * @author ranganath
 * Main program for PayMoney
 */
public class MainApplication {

	public static void main(String[] args)throws Exception {

		DailyTransactionAndTraget object = new DailyTransactionAndTraget();

		object.insertTransactionValues();
		object.insertTargetValues();
	}

}
