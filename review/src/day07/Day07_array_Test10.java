package day07;

import java.util.Scanner;
import java.util.Random;

public class Day07_array_Test10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//생성하려는 배열의 크기 입력
		int num = sc.nextInt();
		
		//String 형태의 배열 생성
		String[] array = new String[num];
		
		//배열에 배열의 크기만큼 메뉴 입력
		for(int i = 0 ; i < array.length ; i ++) {
			String input = sc.next();
			array[i] = input;
		}
		
		//배열의 인덱스 0부터 (배열의 크기 - 1) 사이의 숫자 랜덤 선택하여 출력
		Random r = new Random();
		int numR = r.nextInt(array.length);
		
		System.out.println(array[numR]);
		
	}
}
