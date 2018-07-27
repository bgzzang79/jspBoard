package post.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PostVo {
	private int pt_num; 		//게시글 번호
	private int id;				//학생번호
	private int brd_num;		//게시판 번호
	private int pt_gno; 		//게시글 그룹번호
	private String pt_title;	//제목
	private String pt_content;	//글내용
	private String pt_writer;	//작성자
	private Date pt_date;		//작성일시
	private String pt_delyn;	//삭제여부
	private int pt_pnum;		//부모게시글 번호
	
	public int getPt_num() {
		return pt_num;
	}
	public void setPt_num(int pt_num) {
		this.pt_num = pt_num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBrd_num() {
		return brd_num;
	}
	public void setBrd_num(int brd_num) {
		this.brd_num = brd_num;
	}
	public int getPt_gno() {
		return pt_gno;
	}
	public void setPt_gno(int pt_gno) {
		this.pt_gno = pt_gno;
	}
	public String getPt_title() {
		return pt_title;
	}
	public void setPt_title(String pt_title) {
		this.pt_title = pt_title;
	}
	public String getPt_content() {
		return pt_content;
	}
	public void setPt_content(String pt_content) {
		this.pt_content = pt_content;
	}
	public String getPt_writer() {
		return pt_writer;
	}
	public void setPt_writer(String pt_writer) {
		this.pt_writer = pt_writer;
	}
	public Date getPt_date() {
		return pt_date;
	}
	public void setPt_date(Date pt_date) {
		this.pt_date = pt_date;
	}
	public String getPt_delyn() {
		return pt_delyn;
	}
	public void setPt_delyn(String pt_delyn) {
		this.pt_delyn = pt_delyn;
	}
	public int getPt_pnum() {
		return pt_pnum;
	}
	public void setPt_pnum(int pt_pnum) {
		this.pt_pnum = pt_pnum;
	}
	@Override
	public String toString() {
		return "PostVo [pt_num=" + pt_num + ", id=" + id + ", brd_num="
				+ brd_num + ", pt_gno=" + pt_gno + ", pt_title=" + pt_title
				+ ", pt_content=" + pt_content + ", pt_writer=" + pt_writer
				+ ", pt_date=" + pt_date + ", pt_delyn=" + pt_delyn
				+ ", pt_pnum=" + pt_pnum + "]";
	}
}