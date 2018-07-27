package reply.service;

import java.util.List;

import reply.dao.ReplyDao;
import reply.dao.ReplyDaoInf;
import reply.model.ReplyVo;

public class ReplyService implements ReplyServiceInf {

	@Override
	public List<ReplyVo> selectNumReply(int pt_num) {
		ReplyDaoInf replyDao = new ReplyDao();
		return replyDao.selectNumReply(pt_num);
	}

	@Override
	public int insertReply(ReplyVo replyVo) {
		ReplyDaoInf replyDao = new ReplyDao();
		return replyDao.insertReply(replyVo);
	}

}
