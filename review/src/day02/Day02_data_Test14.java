package day02;

import java.lang.*;

public class Day02_data_Test14 {

	public static void main(String[] args) {
    
    		int kgWeight = 80;
    		int cmHeight = 180;
    
    		double mHeight = (double)cmHeight / 100;
    		double mHeightSquare = mHeight * mHeight;
    
    		double bmi = kgWeight / mHeightSquare;
    
    		double bmiDecimal = bmi * 100 / 100;
    
    		System.out.println(bmiDecimal);
    
    }
	
}