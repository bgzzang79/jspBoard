package reply.service;

import java.util.List;

import reply.model.ReplyVo;

public interface ReplyServiceInf {
	/**
	* Method : selectNumReply
	* 최초작성일 : 2018. 7. 24.
	* 작성자 : PC09
	* 변경이력 :
	* @param pt_num
	* @return
	* Method 설명 : 게시글 번호에 맞는 댓글 조회
	*/
	List<ReplyVo> selectNumReply(int pt_num);
	
	/**
	* Method : insertReply
	* 최초작성일 : 2018. 7. 24.
	* 작성자 : PC09
	* 변경이력 :
	* @param replyVo
	* @return
	* Method 설명 : 댓글 추가
	*/
	int insertReply(ReplyVo replyVo);
}
