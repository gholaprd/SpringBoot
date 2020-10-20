package com.coforge.jay;

import java.util.Arrays;

public class RemovingDuplicateFromArray {

	public static void main(String args[]) {
		int[] a = { 4234, 22, 11, 745, -99, -5, -1, -9, 0 };
		bubbleSort(a);
	}

	public static void bubbleSort(int[] arr) {
		int length = arr.length;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		int size = arr.length;
		while(size>0) {
			System.out.println(arr[size-1]);
			--size;
		}
	}
}
