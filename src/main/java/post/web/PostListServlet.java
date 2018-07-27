package post.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import post.model.PostVo;
import post.service.PostService;
import post.service.PostServiceInf;

@WebServlet("/postList")
public class PostListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int brd_num = Integer.parseInt(request.getParameter("brd_num"));
		String brd_name = request.getParameter("brd_name");
		
		PostServiceInf postService = new PostService();
		List<PostVo> postList = postService.getNumPost(brd_num);
		
		HttpSession session = request.getSession();
		session.setAttribute("postList", postList);
		request.setAttribute("brd_name", brd_name);
		session.setAttribute("brdNum", brd_num);
		
		System.out.println(postList.toString());
		
		RequestDispatcher rd = request.getRequestDispatcher("/post/postList.jsp");
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doGet(request, response);
	}
}