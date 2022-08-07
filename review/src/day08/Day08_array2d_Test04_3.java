package day08;

import java.util.Scanner;

public class Day08_array2d_Test04_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 행과 열 입력
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		// 배열 생성
		int[][] array = new int[row][column];
		
		// 배열에 숫자 대입
		int x = 0;
		int y = 0;
		int count = 0;
		for(int i = 0 ; i < row * column ; i ++) {
			if(y < column - 1) {
				count ++;
				array[x][y] = count;
				y ++;
			}
			else {
				count ++;
				array[x][y] = count;
				y = 0;
				x ++;				
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
		
		// 줄별 합계 및 출력
		for(int i = 0 ; i < array.length ; i ++) {
			int rowSum = 0;
			for(int j = 0 ; j < array[i].length ; j ++) {
				rowSum += array[i][j];
			}
			System.out.println(i + "번째 행의 합계 : " + rowSum);
		}
	}
}
