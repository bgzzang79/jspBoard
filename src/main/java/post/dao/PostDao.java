package post.dao;

import java.util.List;

import mybatis.SqlMapSessionFactory;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import post.model.PostVo;

public class PostDao implements PostDaoInf {
	private SqlSessionFactory sqlSessionFactory = SqlMapSessionFactory.getSqlSessionFactory();
	
	@Override
	public List<PostVo> getNumPost(int brd_num) {
		SqlSession session = sqlSessionFactory.openSession();
		List<PostVo> postList = session.selectList("post.getNumPost",brd_num);
		session.close();
		
		return postList;
	}

	@Override
	public PostVo getPtNumPost(int pt_num) {
		SqlSession session = sqlSessionFactory.openSession();
		PostVo postVo = session.selectOne("post.getPtNumPost",pt_num);
		session.close();
		
		return postVo;
	}

	@Override
	public int addPost(PostVo postVo) {
		SqlSession session = sqlSessionFactory.openSession();
		int insertCnt = session.insert("post.addPost", postVo);
		session.commit();
		session.close();
		
		return insertCnt;
	}

	@Override
	public int updatePost(PostVo postVo) {
		SqlSession session = sqlSessionFactory.openSession();
		int updateCnt = session.update("post.updatePost",postVo);
		session.commit();
		session.close();
		
		return updateCnt;
	}

}
