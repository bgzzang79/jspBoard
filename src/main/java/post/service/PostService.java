package post.service;

import java.util.List;

import post.dao.PostDao;
import post.dao.PostDaoInf;
import post.model.PostVo;

public class PostService implements PostServiceInf {

	@Override
	public List<PostVo> getNumPost(int brd_num) {
		PostDaoInf postDao = new PostDao();
		return postDao.getNumPost(brd_num);
	}

	@Override
	public PostVo getPtNumPost(int pt_num) {
		PostDaoInf postDao = new PostDao();
		return postDao.getPtNumPost(pt_num);
	}

	@Override
	public int addPost(PostVo postVo) {
		PostDaoInf postDao = new PostDao();
		return postDao.addPost(postVo);
	}

	@Override
	public int updatePost(PostVo postVo) {
		PostDaoInf postDao = new PostDao();
		return postDao.updatePost(postVo);
	}
}