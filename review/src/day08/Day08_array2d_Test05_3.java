package day08;

import java.util.Scanner;

public class Day08_array2d_Test05_3 {

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
				if((i * j) % row == 0) {		// (i * j)를 3으로 나눈 나머지가 0인 차례에만
					array[i][j] = count;		// 배열에 count를 대입
					count ++;					// 대입 후 다음 대입을 위해 count를 증가
				}
				else if((i * j) % row == 1) {	// (i * j)를 3으로 나눈 나머지가 1인 차례에만
					array[i][j] = count;		// 배열에 count를 대입
					count ++;					// 대입 후 다음 대입을 위해 count를 증가
				}
				else if((i * j) % row == 2) {	// (i * j)를 3으로 나눈 나머지가 2인 차례에만
					array[i][j] = count;		// 배열에 count를 대입
					count ++;					// 대입 후 다음 대입을 위해 count를 증가
				}
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
