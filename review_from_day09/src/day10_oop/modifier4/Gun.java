package day10_oop.modifier4;

public class Gun {

	// 멤버 필드 - 총알 수
	private int bullet;
	
	// getter & setter
	public int getBullet() {
		return this.bullet;
	}
	
	public void setBullet(int bullet) {
		if(bullet > 0) {
			this.bullet = bullet;
		}
	}
	
	// 생성자
	Gun(){	// 생성자의 매개변수가 없도록 해야 입력되는 총알 정보가 없게 된다
		this.setBullet(2);	// 생성시 총알을 2개 가지고 있도록
	}
	
	// fire 메소드
	public void fire() {
		if(this.bullet > 0) {
			System.out.println("빵야!");
			this.bullet--;
		}
		else {
			System.out.println("딸깍!");
		}
	}
	
	// 정보 출력 메소드
	public void print() {
		System.out.println("남은 총알 수 :" + this.bullet + "발");
	}
}
