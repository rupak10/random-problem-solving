package com.rupak.miu;

public class FindTopElement {
	/**
	 * Find top k elements from an array.
	 * k is a integer and less than the size of the array
	 */
	private static int[] arr = {13, 8, 5, 20, 2, 1};
	
	public static void main(String[] args) {
		int k = 3;
		findTopElement(k, arr);
	}

	private static void findTopElement(int k, int[] inputArr) {
		//we will use bubble sort with k pass
		int n = inputArr.length;
		//let's assume k will always be less than n
		for(int i=0; i<k; i++) {
			for(int j=0; j<(n-1-i); j++) {
				if(inputArr[j] > inputArr[j+1]) {
					//swap
					int tmp = inputArr[j];
					inputArr[j] = inputArr[j+1];
					inputArr[j+1] = tmp;
				}
			}
		}
		
		for(int i=1; i<=k; i++){
			System.out.print(inputArr[n-i] + " ");
		}
		
	}

}
