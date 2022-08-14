package day12_oop.inherit5;

public class AVI extends Media {

	// 멤버 필드
	private double speed;
	
	// getter & setter
	public double getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(double speed) {
		if(speed < 0) {		// 재생 속도는 0보다 작을 수 없다
			return;
		}
		this.speed = speed;
	}
	
	// 생성자 - 재생 속도(speed)를 입력하지 않을 경우 자동으로 x1이 되도록
	public AVI(String fileName, long fileSize){
		super(fileName);
		this.setFileSize(fileSize);
		this.setSpeed(1);
	}
	
	// 생성자 - 재생 속도(speed)를 직접 입력할 수 있도록
	public AVI(String fileName, long fileSize, double speed) {
		super(fileName);
		this.setFileSize(fileSize);
		this.setSpeed(speed);
	}
	
	// 메소드
}
