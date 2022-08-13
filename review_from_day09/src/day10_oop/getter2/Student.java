package day10_oop.getter2;

public class Student {
 
	// 멤버 필드
	String name, course;
	int score, scoreC;
	
	// name에 대한 getter & setter
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	// course에 대한 getter & setter
	String course() {
		return this.course;
	}
	
	void setCourse(String course) {
		this.course = course;
	}
	
	// score에 대한 getter & setter
	int getScore() {
		return this.score;
	}
	
	void setScore(int score) {
		if(score >= 0 && score <= 100) {		// set을 설정하는 방법 1)
			this.score = score;
		}
	}
	
	// scoreC에 대한 getter & setter
	int getScoreC() {
		return this.scoreC;
	}
	
	void setScoreC(int scoreC) {
		if(scoreC < 0 && scoreC > 100) {		// set을 설정하는 방법 2)
			return;
		}
		this.scoreC = scoreC;
	}
	
	// 총합에 대한 getter
	int getSum() {
		return this.score + this.scoreC;
	}
	
	// 평균에 대한 getter
	double getAvg() {
		return getSum() / 3.0;
	}
	
	// 생성자
	Student(String name, String course, int score, int scoreC){
		this.setName(name);
		this.setCourse(course);
		this.setScore(score);
		this.setScoreC(scoreC);
	}
	
	// 출력
	void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("과목 : " + this.course);
		System.out.println("서술형 점수 : " + this.score);
		System.out.println("평가자 체크리스트 점수 : " + this.scoreC);
		System.out.println("총점 : " + getSum());
		System.out.println("평균 : " + getAvg());
		System.out.print("통과 여부 : ");
		if(score >= 40 && scoreC >= 40 && getAvg() >= 60) {
			System.out.println("통과");
		}
		else {
			System.out.println("재평가");
		}
		
		System.out.println();	// 출력시 구분을 위한
	}
}
