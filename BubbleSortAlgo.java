package com.rupak.miu;

public class BubbleSortAlgo {
	
	/*
	 * 1. Bubble sort can be used to test an array is already sorted or not. 
	 * 2. Bubble sort can also be used to find the k largest elements from an array.
	 * i.e. If you are told to find the largest 3 numbers from an array, we can use bubble sort
	 * in this case. We will use only 3 pass here. 
	 * */
	
	/**
	 * Complexity : 
	 * Min : O(n) - when the list is already sorted
	 * Max : O(n^2)
	 */
	
	private static int[] arr = {10, 4, 3};
	private static int[] sortedArr = {10, 13, 14, 18, 22, 31};

	public static void main(String[] args) {
		System.out.println("Before Sorting:");
		printArr(arr);
		
		bubbleSort(arr);
		
		System.out.println("After Sorting:");
		printArr(arr);
		
		isArraySorted(sortedArr);
	}

	private static void isArraySorted(int[] inputArr) {
		int n = inputArr.length;
		int flag;
		for(int i=0; i<(n-1); i++) {
			flag = 0;
			for(int j=0; j<(n-1-i); j++) {
				if(inputArr[j] > inputArr[j+1]) {
					flag = 1;
					//swap
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			if(flag == 0) {
				System.out.println("Array is already sorted.");
				break;
			}
		}
	}

	private static void printArr(int[] inputArr) {
		int len = inputArr.length;
		for(int i=0; i<len; i++) {
			System.out.print(inputArr[i]);
			if(i < (len-1)) {
				System.out.print(" ");
			}
		}
		System.out.println("\n");
	}

	private static void bubbleSort(int[] inputArr) {
		int n = inputArr.length;
		for(int i=0; i<(n-1); i++) {
			for(int j=0; j<(n-1-i); j++) {
				if(inputArr[j] > inputArr[j+1]) {
					//swap
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}	
	}

}
