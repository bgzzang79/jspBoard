package board.service;

import java.util.List;

import board.dao.BoardDao;
import board.dao.BoardDaoInf;
import board.model.BoardVo;

public class BoardService implements BoardServiceInf {

	@Override
	public List<BoardVo> selectAllBoard() {
		BoardDaoInf boardDao= new BoardDao();
		return boardDao.selectAllBoard();
	}

	@Override
	public List<BoardVo> selectYBoard() {
		BoardDaoInf boardDao = new BoardDao();
		return boardDao.selectYBoard();
	}

	@Override
	public int updateYN(BoardVo boardVo) {
		BoardDaoInf boardDao = new BoardDao();
		return boardDao.updateYN(boardVo);
	}

	@Override
	public BoardVo getBoard(int brd_num) {
		BoardDaoInf boardDao = new BoardDao();
		return boardDao.getBoard(brd_num);
	}

	@Override
	public int addBoard(BoardVo boardVo) {
		BoardDaoInf boardDao = new BoardDao();
		return boardDao.addBoard(boardVo);
	}
}
