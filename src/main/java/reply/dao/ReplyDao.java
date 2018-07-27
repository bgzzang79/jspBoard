package reply.dao;

import java.util.List;

import mybatis.SqlMapSessionFactory;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import reply.model.ReplyVo;

public class ReplyDao implements ReplyDaoInf {
	private SqlSessionFactory sqlSessionFactory = SqlMapSessionFactory.getSqlSessionFactory();
	
	@Override
	public List<ReplyVo> selectNumReply(int pt_num) {
		SqlSession session = sqlSessionFactory.openSession();
		List<ReplyVo> replyList = session.selectList("reply.selectNumReply",pt_num);
		session.close();
		
		return replyList;
	}

	@Override
	public int insertReply(ReplyVo replyVo) {
		SqlSession session = sqlSessionFactory.openSession();
		int insertCnt = session.insert("reply.insertReply", replyVo);
		session.commit();
		session.close();
		
		return insertCnt;
	}

}
