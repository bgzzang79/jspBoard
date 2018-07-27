package attachfile.model;

public class AttachFileVo {
	private int af_num;			//첨부파일번호
	private String af_upload;	//업로드파일명
	private String af_path; 	//파일경로
	private String af_name;		//파일명
	private int pt_num;			//게시글 번호
	public int getAf_num() {
		return af_num;
	}
	public void setAf_num(int af_num) {
		this.af_num = af_num;
	}
	public String getAf_upload() {
		return af_upload;
	}
	public void setAf_upload(String af_upload) {
		this.af_upload = af_upload;
	}
	public String getAf_path() {
		return af_path;
	}
	public void setAf_path(String af_path) {
		this.af_path = af_path;
	}
	public String getAf_name() {
		return af_name;
	}
	public void setAf_name(String af_name) {
		this.af_name = af_name;
	}
	public int getPt_num() {
		return pt_num;
	}
	public void setPt_num(int pt_num) {
		this.pt_num = pt_num;
	}
	@Override
	public String toString() {
		return "AttachFileVo [af_num=" + af_num + ", af_upload=" + af_upload
				+ ", af_path=" + af_path + ", af_name=" + af_name + ", pt_num="
				+ pt_num + "]";
	}
}