package board.model;


public class BoardVo {
	private int brd_num;		//게시판 번호
	private String brd_name;	//게시판 이름
	private String brd_yn;		//사용여부
	public int getBrd_num() {
		return brd_num;
	}
	public void setBrd_num(int brd_num) {
		this.brd_num = brd_num;
	}
	public String getBrd_name() {
		return brd_name;
	}
	public void setBrd_name(String brd_name) {
		this.brd_name = brd_name;
	}
	public String getBrd_yn() {
		return brd_yn;
	}
	public void setBrd_yn(String brd_yn) {
		this.brd_yn = brd_yn;
	}
	@Override
	public String toString() {
		return "BoardVo [brd_num=" + brd_num + ", brd_name=" + brd_name
				+ ", brd_yn=" + brd_yn + "]";
	}
}