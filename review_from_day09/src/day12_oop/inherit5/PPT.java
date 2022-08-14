package day12_oop.inherit5;

public class PPT extends File {
	
	// 멤버 필드
	private long pageSize;
	
	// getter & setter
	public long getPageSize() {
		return this.pageSize;
	}
	
	public void setPageSize(long pageSize) {
		if(pageSize < 0) {	// 페이지 수는 0보다 작을 수 없다
			return;
		}
		this.pageSize = pageSize;
	}
	
	// 생성자 - 페이지 수(pageSize)를 입력하지 않으면 자동으로 1이 되도록
	public PPT(String fileName, long fileSize) {
		this(fileName, fileSize, 1);
	}
	
	// 생성자 - 페이지 수(pageSize)를 입력하는 경우
	public PPT(String fileName, long fileSize, long pageSize) {
		super(fileName);
		this.setFileSize(fileSize);
		this.setPageSize(pageSize);
	}
	
	// 메소드
	public void information() {
		System.out.println("<파일 정보>");
		System.out.println("파일명 : " + super.fileName);
		System.out.println("파일 크기 : " + super.fileSize + " bytes");
		System.out.println("페이지 수 : " + this.pageSize);
	}
}
