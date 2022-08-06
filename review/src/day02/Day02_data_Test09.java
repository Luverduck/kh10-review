package day02;

import java.lang.*;

public class Day02_data_Test09 {

	public static void main(String[] args) {
    
    		int pricePerHour = 1200;
    
    		int inHour = 12;
    		int inMinute = 40;
    
    		int outHour = 16;
    		int outMinute = 10;
    
    		int inTime = inHour * 60 + inMinute;
    		int outTime = outHour * 60 + outMinute;
    
    		int totalTime = outTime - inTime;
    
    		int totalPrice = pricePerHour * totalTime / 60;
    
    		int netPrice = totalPrice / 100 * 100;
    
    		System.out.println(netPrice);
    
    	}

}