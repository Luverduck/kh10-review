package day09_oop.method2;

public class Player {

	// 멤버 필드
	String name;
	String game;
	String type;
	int gold;
	int silver;
	int bronze;
	
	// 세팅 메소드
	void setting(String name, String game, String type, int gold, int silver, int bronze) {
		this.name = name;
		this.game = game;
		this.type = type;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	
	// 출력 메소드
	void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("종목 : " + this.game);
		System.out.println("구분 : " + this.type);
		System.out.println("금메달 : " + this.gold);
		System.out.println("은메달 : " + this.silver);
		System.out.println("동메달 : " + this.bronze);
		System.out.println();
	}
}
