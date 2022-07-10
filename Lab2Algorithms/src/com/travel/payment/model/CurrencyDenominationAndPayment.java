package com.travel.payment.model;

import java.util.Scanner;

import com.travel.payment.sort.service.MergeSort;

/**
 * 
 * @author ranganath
 *
 *         Requirement: You are a traveler and traveling to a country where the
 *         currency denominations are unknown and as you travel, you get to know
 *         about the denomination in random order. You want to make a payment of
 *         amount x, in such a way that the number of notes you give is minimum.
 */
public class CurrencyDenominationAndPayment {

	private int size;
	private int currencyDenomination[];
	private long amountToPay;
	private Scanner sc = new Scanner(System.in);
	private MergeSort sortObj = new MergeSort();

	public void insertDenomination() throws Exception{
		System.out.println("Enter the size of currency denominations");
		size = sc.nextInt();
		currencyDenomination = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			currencyDenomination[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		amountToPay = sc.nextLong();
		sortObj.sort(currencyDenomination, 0, currencyDenomination.length - 1);
		// printArray();
		displayPaymentApproach();
	}

	public void displayPaymentApproach() throws Exception {
		System.out.println("Your payment approach in order to give min no of notes will be");
		long balance = amountToPay;
		try {
		for (int i = 0; i < currencyDenomination.length && balance != 0; i++) {
			if (balance < currencyDenomination[i]) {
				continue;
			} else {
				long noOfNotes = balance / currencyDenomination[i];
				balance = balance - currencyDenomination[i] * noOfNotes;
				System.out.println(currencyDenomination[i] + ":" + noOfNotes);
			}
		}
		}catch(Exception e) {
			throw e;
		}
	}

	void printArray() {
		for (int val : currencyDenomination)
			System.out.print(val + ",");
	}
}
