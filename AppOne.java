package com.rupak;

public class AppOne {

	public static void main(String[] args) {
		System.out.println(flippingBits(35601423));
	}
	
	public static void convertChar(char ch) {
		
	}
	
	
	public static long flippingBits(long n) {
        StringBuilder binaryNumber = new StringBuilder();
        if(n == 0){
            binaryNumber.append("0");
        }
        else{
            while(n != 0){
                long rem = n % 2;
                binaryNumber.append(rem);
                n = n / 2;
            } 
        }
        
        binaryNumber.reverse();
        
        int trailZeros = 32 - binaryNumber.length();
        StringBuilder extraZeros = new StringBuilder();
        for(int i=0; i<trailZeros; i++){
            extraZeros.append("0");
        }
        
        System.out.println("extraZeros : "+extraZeros);
        System.out.println("binaryNumber : "+binaryNumber);
        
        //32 bits binary number
        StringBuilder finalBinaryNumber = new StringBuilder();
        finalBinaryNumber.append(extraZeros).append(binaryNumber);
        System.out.println("finalBinaryNumber : "+finalBinaryNumber);
        
        long decimalNumber = 0;
        long position = 31;
        
        for(int i=0; i<finalBinaryNumber.length(); i++){
            char ch = finalBinaryNumber.charAt(i);
            System.out.println("ch : "+ch);
            long val;
            if(ch == '1'){
                val = 0;
            }
            else{
                val = 1;
            }
            System.out.println("val after flipping: "+val);
            decimalNumber += (val*(Math.pow(2, position)));
            position = position - 1;
        }
        
        return decimalNumber;
    }

}
