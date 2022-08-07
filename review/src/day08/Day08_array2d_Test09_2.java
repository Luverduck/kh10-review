package day08;

public class Day08_array2d_Test09_2 {

	public static void main(String[] args) {
		
		// 배열
		int[][] array = new int[][] {
			{100, 90, 80, 0, 0, 0},
			{95, 92, 93, 0, 0, 0},
			{70, 95, 95, 0, 0, 0}
		};
		
		// 합계와 평균
		for(int i = 0 ; i < array.length ; i ++) {
			int sum = 0;	// i가 바뀜과 동시에 합계 변수 초기화
			int avg = 0;	// i가 바뀜과 동시에 평균 변수 초기화
			for(int j = 0 ; j < array[i].length ; j ++) {
				sum += array[i][j];		// j가 변할 때마다 sum에 array[i][j]를 더하여 대입
				avg = sum / 3;			// j가 변할 때마다 바뀐 sun에 대한 평균 저장 (평균 갱신)
			}
			array[i][3] = sum;
			array[i][4] = avg;
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
