package day08;

public class Day08_array2d_Test09_3 {

	public static void main(String[] args) {
		
		// 배열
		int[][] array = new int[][] {
			{100, 90, 80, 0, 0, 0},
			{95, 92, 93, 0, 0, 0},
			{70, 95, 95, 0, 0, 0}
		};
		
		// 합계와 평균
		for(int j = 0 ; j < 3 ; j ++) {
			for(int i = 0 ; i < 3 ; i ++) {
				if((i + j) % array.length == 0) {
					array[i][3] += array[i][j];
					array[i][4] = array[i][3] / 3;
				}
				else if((i + j) % array.length == 1) {
					array[i][3] += array[i][j];
					array[i][4] = array[i][3] / 3;
				}
				else if((i + j) % array.length == 2) {
					array[i][3] += array[i][j];
					array[i][4] = array[i][3] / 3;
				}
			}
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
