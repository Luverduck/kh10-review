package day08;

public class Day08_array2d_Test09_1 {

	public static void main(String[] args) {
		
		// 배열
		int[][] array = new int[][] {
			{100, 90, 80, 0, 0, 0},
			{95, 92, 93, 0, 0, 0},
			{70, 95, 95, 0, 0, 0}
		};
		
		// 합계
		for(int i = 0 ; i < array.length ; i ++) {
			int sum = 0;
			for(int j = 0 ; j < array[i].length ; j ++) {
				sum += array[i][j];
			}
			array[i][3] = sum;
		}
		
		// 평균
		for(int i = 0 ; i < array.length ; i ++) {
			array[i][4] = array[i][3] / 3;
		}
		
		// 등수 출력
		for(int i = 0 ; i < array.length ; i ++) {
			int mySum = array[i][3];
			int rank = 1;
			for(int j = 0 ; j < array.length ; j ++) {
				if(mySum < array[j][3]) {
					rank ++;
				}
			}
			array[i][5] = rank;
		}
		
		// 배열 출력
		for(int i = 0 ; i < array.length ; i ++) {
			for(int j = 0 ; j < array[i].length ; j ++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
