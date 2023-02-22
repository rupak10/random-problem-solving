package com.rupak.miu;

public class IsCubePowerful {

	public static void main(String[] args) {
		
		int number = 87;
		int result = isCubePowerful(number);
		System.out.println(result);
	}

	private static int isCubePowerful(int number) {
		if(number <= 0) {
			return 0;
		}
		
		int sum = 0;
		int tmpNumber = number;
		while (tmpNumber != 0) {
			int digit = tmpNumber % 10;
			sum += Math.pow(Double.valueOf(digit), Double.valueOf(3));
			tmpNumber = tmpNumber / 10;
		}
		
		if(sum == number) {
			return 1;
		}
		
		return 0;
	}

}
