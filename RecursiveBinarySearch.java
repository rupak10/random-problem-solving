package com.rupak;

public class RecursiveBinarySearch {
	
	static int arr[] = {1, 2, 5, 7, 9, 15, 19};

	public static void main(String[] args) {
		
		int key = 15;
		int n = arr.length;
		int position = binarySearch(arr, key, 0, n);
		
		if(position != -1) {
			System.out.println(key + " found at : "+position + " index.");
		}
		else {
			System.out.println(key +" not found !");
		}
		
	}

	private static int binarySearch(int[] arr2, int key, int l, int r) {
		int m = (l + r) / 2;
		
		if(arr2[m] == key) {
			return m;
		}
		else if(key < arr2[m]) {
			return binarySearch(arr2, key, l, m);
		}
		else {
			return binarySearch(arr2, key, m+1, r);
		}
	}

}
