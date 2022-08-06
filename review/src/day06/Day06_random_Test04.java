package day06;

import java.util.Scanner;
import java.util.Random;

public class Day06_random_Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int countO = 0;
		int life = 3;
		while(true) {
			int first = r.nextInt(9) + 1;
			int second = r.nextInt(8) + 1;
			
			System.out.print(first + " X " + second + " = ");
			int answer = sc.nextInt();
			
			if(first * second == answer) {
				countO ++;
			}
			else {
				life --;
			}
			
			if(life <= 0) {
				break;
			}
		}
		
		System.out.println("Game Over!");
		System.out.println("맞춘 갯수 : " + countO);
	}
}
