package day07;

public class Day07_array_Test07 {

	public static void main(String[] args) {
		
		//배열 생성
		float[] array = new float[] {75, 92, 86, 65, 79, 95, 88, 86, 72, 77};
		
		
		// 1. 배열 출력
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.println(array[i]);
		}
		
		
		// 2. 총합과 평균
		double sum = 0;
		for(int i = 0 ; i < array.length ; i ++) {
			sum += array[i];
		}
		
		double avg = sum / array.length;
		
		
		// 3. 성적 우수자(90점 이상)의 숫자 카운트 및 출력
		int count = 0;
		for(int i = 0 ; i < array.length ; i ++) {
			if(array[i] >= 90) {
				count ++;
			}
		}
		
		System.out.println("성적 우수자 : 총 " + count + "명");
		
		
		// 4. 이 반에 85점 이상의 학생이 전학을 왔을 때 예상 등수
		int newby = 85;
		int rank = 1;
		for(int i = 0 ; i < array.length ; i ++) {
			int meNewby = newby;
			if(meNewby < array[i]) {
				rank ++;
			}
		}
		
		System.out.println("예상 등수 : " + rank);
		
	}
}
