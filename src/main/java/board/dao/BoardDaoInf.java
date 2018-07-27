package board.dao;

import java.util.List;

import board.model.BoardVo;

public interface BoardDaoInf {
	/**
	* Method : selectAllBoard
	* 최초작성일 : 2018. 7. 19.
	* 작성자 : PC09
	* 변경이력 :
	* @return
	* Method 설명 : 모든 게시판 조회
	*/
	List<BoardVo> selectAllBoard();
	
	/**
	* Method : selectYBoard
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC09
	* 변경이력 :
	* @return
	* Method 설명 : Y로 체크된것만 조회
	*/
	List<BoardVo> selectYBoard();
	
	/**
	* Method : updateYN
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC09
	* 변경이력 :
	* @return
	* Method 설명 : 사용여부 수정
	*/
	int updateYN(BoardVo boardVo);
	
	/**
	* Method : getBoard
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC09
	* 변경이력 :
	* @param brd_num
	* @return
	* Method 설명 : 해당번호에 맞는 게시판 조회
	*/
	BoardVo getBoard(int brd_num);

	/**
	* Method : addBoard
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC09
	* 변경이력 :
	* @param boardVo
	* @return
	* Method 설명 : 게시판추가작업 성공하면 1이상의 값, 실패하면 0
	*/
	int addBoard(BoardVo boardVo);
}
