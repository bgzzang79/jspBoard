package post.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import post.model.PostVo;

public class PostServiceTest {

	@Test
	public void test() {
		/***Given***/
		PostServiceInf postService = new PostService();
		int brd_num = 2;
		/***When***/
		List<PostVo> postList = postService.getNumPost(brd_num);
		/***Then***/
		assertEquals(1, postList.size());
	}

}
