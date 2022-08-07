package day08;

import java.util.Scanner;

public class Day08_array2d_Test05_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 행과 열 입력
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		// 배열 생성
		int[][] array = new int[row][column];
		
		// 배열에 숫자 대입
		int count = 1;
		for(int j = 0 ; j < column ; j ++) {
			for(int i = 0 ; i < row ; i ++) {
				array[i][j] = count;
				count ++;
			}
		}
		
		// 배열 출력
		for(int i = 0 ; i < array.length ; i ++) {
			for(int j = 0 ; j < array[i].length ; j ++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
