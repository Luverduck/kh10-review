package day10_oop.setter2;

public class Lecture {

	// 멤버 필드
	String course;
	int time;
	int price;
	String type;
	
	// setter
	// 1) 강좌명
	void setCourse(String course) {
		this.course = course;
	}
	
	// 2) 시간 - 30시간 단위로 제한
	void setTime(int time) {
		if(time % 30 != 0) {
			return;
		}
		this.time = time; 		// 그렇지 않으면의 else를 쓸 필요가 없어진다
	}
	
	// 3) 가격 - 음수가 되지 않도록 제한
	void setPrice(int price) {
		if(price < 0) {
			return;
		}
		this.price = price;
	}
	
	// 4) 구분 - 온라인/오프라인/혼합
	void setType(String type) {
		switch(type) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.type = type;
		}
	}
	
	// 생성자
	Lecture(String course, int time, int price, String type){
		this.setCourse(course);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
	
	// 출력 메소드
	void print() {
		System.out.println("강좌명 : " + this.course);
		System.out.println("강의시간 : " + this.time);
		System.out.println("수강료 : " + this.price);
		System.out.println("구분 : " + this.type);
		System.out.println();
	}
}
