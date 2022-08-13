package day10_oop.getter3;

public class Student {

	// 멤버 필드
	String name;
	int level, korean, english, math;
	
	// name에 대한 getter & setter
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	// level에 대한 getter & setter
	int getLevel() {
		return this.level;
	}
	
	void setLevel(int level) {
		switch(level) {
		case 1:	case 2:	case 3:
			break;
		}
		this.level = level;
	}
	
	// korean에 대한 getter & setter
	int getKorean() {
		return this.korean;
	}
	
	void setKorean(int korean) {
		if(korean >= 0 && korean <= 100) {
			this.korean = korean;
		}
	}
	
	// english에 대한 getter & setter
	int getEnglish() {
		return this.english;
	}
	
	void setEnglish(int english) {
		if(english >= 0 && english <= 100) {
			this.english = english;
		}
	}
	
	// math에 대한 getter & setter
	int getMath() {
		return this.math;
	}
	
	void setMath(int math) {
		if(math >= 0 && math <= 100) {
			this.math = math;
		}
	}
	
	// 총점 및 평균에 대한 getter
	int getSum() {
		return this.korean + this.english + this.math;
	}
	
	int getAvg() {
		return getSum() / 3;
	}
	
	// 등급에 대한 getter
	String getGrade() {
		if(getAvg() < 70) {
			return "F";
		}
		else if(getAvg() < 80) {
			return "C";
		}
		else if(getAvg() < 90) {
			return "B";
		}
		else {
			return "A";
		}
	}
	
	// 생성자
	Student(String name, int level, int korean, int english, int math){
		this.setName(name);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	
	// 출력 메소드
	void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("총점 : " + this.getSum());
		System.out.println("평균 : " + this.getAvg());
		System.out.println("등급 : " + this.getGrade());
		System.out.println();
	}
}
