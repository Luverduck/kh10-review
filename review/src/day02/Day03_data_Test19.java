package day02;

import java.lang.*;

public class Day03_data_Test19 {

	public static void main(String[] args) {

		int freeTime = 300;
        
		int inHour = 9, inMinute = 50;
		int inTime = inHour * 60 + inMinute;
        
		int outHour = 16, outMinute = 22;
		int outTime = outHour * 60 + outMinute;
        
		int totalTime = outTime - inTime;
        
		boolean priceTF = totalTime >= freeTime;
        
		System.out.println(priceTF);

	}

}