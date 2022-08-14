package day12_oop.inherit5;

public class MP3 extends Media {

	// 멤버 필드
	private int duration;
	
	// getter & setter
	public int getDuration() {
		return this.duration;
	}
	
	public void setDuration(int duration) {
		if(duration < 0) {	// 재생 시간은 0보다 작을 수 없다
			return;
		}
		this.duration = duration;
	}
	
	// 생성자 - 파일명(fileName)만 입력하는 경우, 파일크기(fileSize)나 재생시간(duration)은 자료형의 기본값으로 설정
	public MP3(String fileName) {
		super(fileName);
	}
	
	// 생성자 - 파일명(fileName), 파일크기(fileSize), 재생시간(duration)을 입력하는 경우
	public MP3(String fileName, long fileSize, int duration) {
		super(fileName);
		this.setFileSize(fileSize);
		this.setDuration(duration);
	}
	
	// 메소드
}
