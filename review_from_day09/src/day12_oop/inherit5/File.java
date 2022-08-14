package day12_oop.inherit5;

// 슈퍼 클래스
public class File {

	// 멤버 필드
	protected String fileName;		// 상속관계인 클래스에서만 호출할 수 있도록 protected로 설정
	protected long fileSize;
	
	// getter & setter
	public String getFileName() {
		return this.fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public long getFileSize() {
		return this.fileSize;
	}
	
	public void setFileSize(long fileSize) {
		if(fileSize < 0) {	// 파일 크기는 0보다 작을 수 없다
			return;
		}
		this.fileSize = fileSize;
	}
	
	// 생성자 - 파일명(fileName)은 무조건 입력하도록
	public File(String fileName){
		this.setFileName(fileName);
	}
	
	// 메소드
	public void execute() {
		System.out.println(this.fileName + " 실행");
	}
}
