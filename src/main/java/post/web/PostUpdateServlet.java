package post.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import post.service.PostService;
import post.service.PostServiceInf;
import student.model.StudentVo;

@WebServlet("/postUpdate")
public class PostUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		StudentVo studentVo = (StudentVo) session.getAttribute("studentVo");
		
		
		PostServiceInf postService = new PostService();
		String pt_title = request.getParameter("pt_title");
		String pt_content = request.getParameter("pt_content");
		
		
//		postService.getPtNumPost(pt_num);
//		
//		postService.updatePost(postVo);
		response.sendRedirect("/post/postUUpdate.jsp?pt_title="+pt_title+"&pt_content="+pt_content);
		
//		RequestDispatcher rd = request.getRequestDispatcher("/post/postUUpdate.jsp");
//		rd.forward(request, response);
	}

}
