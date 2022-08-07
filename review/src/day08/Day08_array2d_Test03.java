package day08;

import java.util.Scanner;

public class Day08_array2d_Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 행(row)과 열(column) 입력
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		// 배열 생성
		int[][] array = new int[row][column];
		
		// 숫자 대입
		int count = 1;
		for(int i = 0 ; i < array.length ; i ++) {
			for(int j = 0 ; j < array[i].length ; j ++) {
				array[i][j] = count;
				count ++;
			}
		}
		
		// 출력
		for(int i = 0 ; i < array.length ; i ++) {
			for(int j = 0 ; j < array[i].length ; j ++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
