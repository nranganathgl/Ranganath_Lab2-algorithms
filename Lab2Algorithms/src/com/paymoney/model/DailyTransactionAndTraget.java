package com.paymoney.model;

import java.util.Scanner;

/**
 * 
 * @author ranganath
 *
 *         PayMoney. processes thousands of transactions daily amounting to
 *         crores of Rupees. They also have a daily target that they must
 *         achieve. Given a list of transactions done by PayMoney and a daily
 *         target, your task is to determine at which transaction PayMoney
 *         achieves the same. If the target is not achievable, then display the
 *         target is not achieved.
 */
public class DailyTransactionAndTraget {

	private int transactionSize;
	private int targetSize;
	private int transactionArray[];
	private int targetArray[];
	private static int totalTransactions;
	private Scanner sc = new Scanner(System.in);

	public void insertTransactionValues() {
		System.out.println("Enter the size of transaction array");
		transactionSize = sc.nextInt();
		transactionArray = new int[transactionSize];
		System.out.println("Enter the values of array ");
		for (int i = 0; i < transactionSize; i++) {
			transactionArray[i] = sc.nextInt();
		}
	}

	boolean isTargetAchieved(int tagertValue) {
		int transactionSum = 0;
		totalTransactions = 0;
		for (int k = 0; k < transactionArray.length; k++) {
			transactionSum += transactionArray[k];
			totalTransactions++;
			if (transactionSum >= tagertValue) {
				return true;
			}
		}
		return false;
	}

	public void insertTargetValues() {
		System.out.println("Enter the total no of targets that needs to be achieved");
		targetSize = sc.nextInt();
		targetArray = new int[targetSize];
		for (int j = 0; j < targetSize; j++) {
			System.out.println("Enter the value of target");
			targetArray[j] = sc.nextInt();
			if (isTargetAchieved(targetArray[j])) {
				System.out.println("Target achieved after " + totalTransactions + " transactions");
			} else {
				System.out.println("Given target is not achieved");
			}
		}

	}

	public void printTransactionArray() {
		System.out.print("Transaction array values are: ");
		for (int val : transactionArray)
			System.out.print(val + ",");
		System.out.println();
	}

	public void printTargetArray() {
		System.out.print("Taget array values are: ");
		for (int val : targetArray)
			System.out.print(val + ",");
		System.out.println();
	}
}
