package post.service;

import java.util.List;

import post.model.PostVo;

public interface PostServiceInf {
	/**
	* Method : getNumPost
	* 최초작성일 : 2018. 7. 23.
	* 작성자 : PC09
	* 변경이력 :
	* @param brd_num
	* @return
	* Method 설명 : 게시판 번호에 맞는 게시글 조회
	*/
	List<PostVo> getNumPost(int brd_num);
	
	/**
	* Method : getPtNumPost
	* 최초작성일 : 2018. 7. 23.
	* 작성자 : PC09
	* 변경이력 :
	* @param pt_num
	* @return
	* Method 설명 : 게시글 번호에 맞는 내용 조회
	*/
	PostVo getPtNumPost(int pt_num);
	
	/**
	* Method : addPost
	* 최초작성일 : 2018. 7. 24.
	* 작성자 : PC09
	* 변경이력 :
	* @param postVo
	* @return
	* Method 설명 : 게시글 추가
	*/
	int addPost(PostVo postVo);
	
	/**
	* Method : updatePost
	* 최초작성일 : 2018. 7. 25.
	* 작성자 : PC09
	* 변경이력 :
	* @param postVo
	* @return
	* Method 설명 : 게시글 수정
	*/
	int updatePost(PostVo postVo);
}
