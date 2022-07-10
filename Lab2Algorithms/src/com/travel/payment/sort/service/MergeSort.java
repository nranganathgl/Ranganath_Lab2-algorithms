package com.travel.payment.sort.service;

import java.util.Arrays;

/**
 * 
 * @author ranganath
 * 
 *         This class sort the given input array into descending order.
 */
public class MergeSort {

	void merge(int arr[], int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArray[i] = arr[left + i];
		}

		for (int j = 0; j < n2; j++) {
			rightArray[j] = arr[mid + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = left;

		while (i < n1 && j < n2) {

			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}

	}

	public void sort(int currency[], int left, int right) {
		if (left < right) {

			int mid = (left + right) / 2;

			sort(currency, left, mid);
			sort(currency, mid + 1, right);

			merge(currency, left, mid, right);

		}
	}

	public static void main(String[] args) {
		int[] array = { 89, 32, 1, 342 };
		MergeSort ms = new MergeSort();
		ms.sort(array, 0, array.length - 1);

		System.out.println(Arrays.toString(array));
	}
}