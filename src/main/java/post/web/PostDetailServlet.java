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
import reply.model.ReplyVo;
import reply.service.ReplyService;
import reply.service.ReplyServiceInf;
import student.model.StudentVo;
import student.service.StudentService;
import student.service.StudentServiceInf;

/**
 * Servlet implementation class PostDetailServlet
 */
@WebServlet("/postDetail")
public class PostDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		StudentVo studentVo = (StudentVo) session.getAttribute("studentVo");

		int pt_num = Integer.parseInt(request.getParameter("id"));

		ReplyServiceInf replyService = new ReplyService();

		List<ReplyVo> replyList = replyService.selectNumReply(pt_num);

		request.setAttribute("replyList", replyList);

		PostServiceInf postService = new PostService();
		PostVo postVo = postService.getPtNumPost(pt_num);

		request.setAttribute("postVo", postVo);

		if(studentVo.getId() == postVo.getId()){
			RequestDispatcher rd = request.getRequestDispatcher("/post/postUpdateDetail.jsp");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("/post/postDetail.jsp");
			rd.forward(request, response);
		}

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}