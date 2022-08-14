package day12_oop.inherit8;

public abstract class Player {

	// 멤버 필드
	protected String id;
	protected int lv;

	// getter & setter
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLv() {
		return this.lv;
	}

	public void setLv(int lv) {
		if(lv <= 0) {
			return;
		}
		this.lv = lv;
	}

	// 생성자
	public Player(String id) {
		this(id, 1);
		//this.id = id;
		//this.setLv(1);
	}

	public Player(String id, int lv) {
		this.setId(id);
		this.setLv(lv);
	}

	// 메소드
	public void information() {
		System.out.println("아이디 : " + this.id);
		System.out.println("레벨 : " + this.lv);
	}

	// 추상 메소드
	public abstract void attack();
	public abstract void move();
}
