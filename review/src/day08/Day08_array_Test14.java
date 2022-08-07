package day08;

public class Day08_array_Test14 {

	public static void main(String[] args) {
		
		// 배열의 생성
		int[] array = new int[] {30, 10, 20, 50, 40};
						
		// 정렬 전 출력
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// 삽입 정렬
		for(int nowIndex = 0 ; nowIndex < array.length ; nowIndex ++) {
			
			int backup = array[nowIndex];		// 현재 위치의 데이터를 백업에 저장
			int lastOverwrite = nowIndex;		// 마지막 덮어쓰기 위치를 마지막 백업 인덱스로 지정
			
			for(int previousIndex = 0 ; previousIndex < nowIndex ; previousIndex ++) {
				
				if(array[nowIndex] < array[previousIndex]) {	// 만약 이전 인덱스의 배열값이 현재 인덱스 위치의 배열 값보다 크면
					array[nowIndex] = array[previousIndex];		// 현재 인덱스 배열값을 그 인덱스의 배열값으로 바꾸고
					lastOverwrite = previousIndex;				// 마지막 덮어쓰기 위치를 그 인덱스로 바꾼다
				}
			}
			
			array[lastOverwrite] = backup;		// 최종적으로 배열의 마지막 덮어쓰기 위치에 백업 데이터를 대입한다
		}

		// 정렬 후 출력
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
