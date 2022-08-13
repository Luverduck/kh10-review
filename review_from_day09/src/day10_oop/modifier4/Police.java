package day10_oop.modifier4;

public class Police {

	// 멤버 필드
	private String name, position, location;
	private Gun gun;	// *** Gun 객체를 멤버필드에 생성한다
	
	// 생성자
	Police(String name, String position, String location){
		this.setName(name);
		this.setPosition(position);
		this.setLocation(location);
		this.gun = new Gun();	// 경찰 객체 생성시 총 객체를 생성
	}
	
	// getter & setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	// shoot 메소드
	public void shoot() {
		System.out.println(this.name + "가 총을 발사합니다!");	// 어떤 객체가 총을 발사했는지 표시하기 위함
		gun.fire();
	}
	
	// 출력 메소드
	public void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("직급 : " + this.position);
		System.out.println("근무지역 : " + this.location);
		gun.print();	// Gun 클래스에서 gun의 남은 총알 정보를 출력하는 print 메소드를 호출
		
		System.out.println();
	}
}
