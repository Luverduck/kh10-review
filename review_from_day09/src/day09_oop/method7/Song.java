package day09_oop.method7;

public class Song {

	// 멤버 필드
		String name;
		String singer;
		String album;
		int play;
		int like;
		
		// 세팅 메소드
		void setting(String name, String singer, String album, int play, int like) {
			this.name = name;
			this.singer = singer;
			this.album = album;
			this.play = play;
			this.like = like;
		}
		
		// 출력 메소드
		void print() {
			System.out.print("제목 : " + this.name);
			if(this.play >= 100000) {
				System.out.print("(베스트)");
			}
			if(this.like >= 100000) {
				System.out.print("(인기곡)");
			}
			System.out.println();
			System.out.println("가수 : " + this.singer);
			System.out.println("앨범 : " + this.album);
			System.out.println("재생수 : " + this.play);
			System.out.println("좋아요수 : " + this.like);
			int rankScore = (this.play * 2) + (this.like / 2);
			System.out.println("랭킹점수 : " + rankScore);
			System.out.println();
		}
}
