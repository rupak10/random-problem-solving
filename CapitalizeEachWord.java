package com.rupak;

public class CapitalizeEachWord {

	public static void main(String[] args) {
		String text = "six lakh five hundred";
		
		System.out.println(capitalizeEachWord(text));

	}
	
	private static String capitalizeEachWord(String str) {
		String cappedStr = "";
		String[] strArr = str.split("\\ ");
		int len = strArr.length;
		for (int i = 0; i < len; i++) {
			cappedStr += Character.toUpperCase(strArr[i].charAt(0)) + strArr[i].substring(1);
			cappedStr += " ";
		}

		return cappedStr.trim();
	}

}
