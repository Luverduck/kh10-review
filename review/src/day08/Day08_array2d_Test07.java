package day08;

import java.util.Random;

public class Day08_array2d_Test07 {

	public static void main(String[] args) {
		
		// 행과 열 입력
		int row = 5;
		int column = 5;
		
		// 배열 생성
		int[][] array = new int[row][column];
		
		Random r = new Random();
		
		// 랜덤 위치에 숫자 1에서 25까지 배치
		int count = 1;
		for(int i = 0 ; i < row * column ; i ++) {
			int x = r.nextInt(5);
			int y = r.nextInt(5);
			if(array[x][y] == 0) {
				array[x][y] = count;
				count ++;
			}
			else {		// array[x][y] 값이 0이 아니라면 (이미 숫자가 배치됨)
				i --;	// 다시 배치 (시행 취소)
			}
		}
		
		// 배열 출력
		for(int i = 0 ; i < row ; i ++) {
			for(int j = 0 ; j < column ; j ++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
