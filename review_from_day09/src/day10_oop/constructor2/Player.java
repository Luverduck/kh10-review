package day10_oop.constructor2;

public class Player {

	// 멤버 필드
	String name;
	String type;
	int level;
	
	// 생성자
	// 레벨을 입력받지 않았을 경우 자동으로 1이 되도록 (오버로딩)
	Player(String name, String type){
		this(name, type, 1);		//여기서 this는 생성자 자신을 지칭한다
	}
	
	// 레벨을 입력할 경우 해당 레벨이 되도록
	Player(String name, String type, int level){
		this.name = name;
		this.type = type;
		this.level = level;
	}
	
	// 레벨업 메소드
	void levelUP() {
		this.level ++;
	}
	
	// 출력 메소드
	void print() {
		System.out.println("아이디 : " + this.name);
		System.out.println("직업 : " + this.type);
		System.out.println("레벨 : " + this.level);
		System.out.println();
	}
}
