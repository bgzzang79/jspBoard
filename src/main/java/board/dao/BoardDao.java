package board.dao;

import java.util.List;

import mybatis.SqlMapSessionFactory;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.model.BoardVo;

public class BoardDao implements BoardDaoInf {
	private SqlSessionFactory sqlSessionFactory = SqlMapSessionFactory.getSqlSessionFactory();
	
	@Override
	public List<BoardVo> selectAllBoard() {
		SqlSession session = sqlSessionFactory.openSession();
		List<BoardVo> boardList = session.selectList("board.selectAllBoard");
		session.close();
		
		return boardList;
	}

	@Override
	public List<BoardVo> selectYBoard() {
		SqlSession session = sqlSessionFactory.openSession();
		List<BoardVo> boardYList = session.selectList("board.selectYBoard");
		session.close();
		
		return boardYList;
	}

	@Override
	public int updateYN(BoardVo boardVo) {
		SqlSession session = sqlSessionFactory.openSession();
		int updateCnt = session.update("board.updateYN", boardVo);
		session.commit();
		session.close();
		
		return updateCnt;
	}

	@Override
	public BoardVo getBoard(int brd_num) {
		SqlSession session = sqlSessionFactory.openSession();
		BoardVo boardVo = session.selectOne("board.getBoard",brd_num);
		session.close();
		
		return boardVo;
	}

	@Override
	public int addBoard(BoardVo boardVo) {
		SqlSession session = sqlSessionFactory.openSession();
		int insertCnt = session.insert("board.addBoard", boardVo);
		session.commit();
		session.close();
		
		return insertCnt;
	}

}
