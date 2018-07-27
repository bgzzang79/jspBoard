package reply.model;

import java.util.Date;

public class ReplyVo {
	private int reply_num;	//댓글번호
	private int id;			//학생번호
	private String com;		//내용
	private Date dt;		//작성일시
	private int pt_num;		//게시글 번호
	
	public int getReply_num() {
		return reply_num;
	}
	public void setReply_num(int reply_num) {
		this.reply_num = reply_num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	public int getPt_num() {
		return pt_num;
	}
	public void setPt_num(int pt_num) {
		this.pt_num = pt_num;
	}
	@Override
	public String toString() {
		return "ReplyVo [reply_num=" + reply_num + ", id=" + id + ", com="
				+ com + ", dt=" + dt + ", pt_num=" + pt_num + "]";
	}
}