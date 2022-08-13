package day10_oop.modifier2;

public class Student {

	// 멤버 필드
	private String name;
	private int level, korean, english, math;
	
	// getter & setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		switch(level) {
		case 1: case 2: case 3:
			break;
		}
		this.level = level;
	}
	
	public int getkorean() {
		return this.korean;
	}
	
	public void setKorean(int korean) {
		if(korean >= 0 && korean <= 100) {
			this.korean = korean;
		}
	}
	
	public int getEnglish() {
		return this.english;
	}
	
	public void setEnglish(int english) {
		if(english >= 0 && english <= 100) {
			this.english = english;
		}
	}
	
	public int getMath() {
		return this.math;
	}
	
	public void setMath(int math) {
		if(math >= 0 && math <= 100) {
			this.math = math;
		}
	}
	
	public int getSum() {
		return this.korean + this.english + this.korean;
	}
	
	public double getAvg() {
		return getSum() / 3.0;
	}
	
	public String getGrade() {
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
	public void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("총점 : " + this.getSum());
		System.out.println("평균 : " + this.getAvg());
		System.out.println("등급 : " + this.getGrade());
	}
}
