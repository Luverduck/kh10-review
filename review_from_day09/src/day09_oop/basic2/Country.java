package day09_oop.basic2;

public class Country {

	// 필드 생성
	int rank;
	String name;
	double score;
	
	//출력 메소드
	void print() {
		System.out.println("순위 : " + this.rank);
		System.out.println("국가 : " + this.name);
		System.out.println("점수 : " + this.score);
		System.out.println();
	}
	
}
