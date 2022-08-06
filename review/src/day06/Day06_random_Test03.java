package day06;

import java.util.Scanner;
import java.util.Random;

public class Day06_random_Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		Random r = new Random();
		
		int numR = r.nextInt(9) + 1;
		System.out.print(input + " X " + numR + " = ");
		int answer = sc.nextInt();

		if(input * numR == answer) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
	}
}
