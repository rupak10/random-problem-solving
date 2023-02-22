package com.rupak;

import java.util.HashSet;
import java.util.Set;

public class SubArrayGeneration {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		int n = arr.length;
		
		Set<String> uniqueSubArrSet = new HashSet<String>();
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print("{");
				String str = "";
				for(int k=i; k<=j; k++) {
					System.out.print(arr[k]);
					str += arr[k];
					if(k != j) {
						System.out.print(" ");
						str += "~";
					}
				}
				System.out.println("}");
				uniqueSubArrSet.add(str);
			}
		}
		
		System.out.println("\nUnique Sub Array : "+uniqueSubArrSet.size());
		
		
	}

}
