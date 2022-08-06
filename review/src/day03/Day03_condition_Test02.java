package day03;

import java.lang.*;

public class Day03_condition_Test02 {

	public static void main(String[] args) {

		int test1 = 85;
		int test2 = 52;
		
		double avg = (test1 + test2) / 2.0;
        
		if(avg >= 60) {
			System.out.println("통과");
		}

		if(avg < 60) {
			System.out.println("재시험");
		}
        
	}

}