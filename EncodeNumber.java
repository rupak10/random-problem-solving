package com.rupak.miu;

import java.util.ArrayList;
import java.util.List;

public class EncodeNumber {
	
	private static Integer number = 500;

	public static void main(String[] args) {
		List<Integer> list = encodeNumber(number);
		System.out.println("list : "+list);
	}

	private static List<Integer> encodeNumber(Integer n) {
		List<Integer> list = new ArrayList<>();
		Integer len = n / 2;
		Integer i = 2;
		while(n != 0 && i<= len) {
			if(n % i == 0) {
				list.add(i);
				n = n / i;
			}
			else {
				i++;
			}
		}
		return list;
	}

}
