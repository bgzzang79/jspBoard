package post.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import post.model.PostVo;
import post.service.PostService;
import post.service.PostServiceInf;
import student.model.StudentVo;

@WebServlet("/createPost")
@MultipartConfig(maxFileSize=5*1024*1000, maxRequestSize=16*1024*1000)
public class CreatePostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		PostServiceInf postService = new PostService();

		HttpSession session = request.getSession();
		StudentVo stdVo = (StudentVo) session.getAttribute("studentVo");

		int brd_num = (int) session.getAttribute("brdNum");
		
		int id = stdVo.getId();
		String pt_title = request.getParameter("title");
		String pt_content = request.getParameter("smarteditor"); 
		String pt_writer = stdVo.getName();

		PostVo postVo = new PostVo();

		postVo.setId(id);
		postVo.setBrd_num(brd_num);
		postVo.setPt_title(pt_title);
		postVo.setPt_content(pt_content);
		postVo.setPt_writer(pt_writer);

		postService.addPost(postVo);
//		response.sendRedirect("/post/postList.jsp");
		
		RequestDispatcher rd = request.getRequestDispatcher("/post/postList.jsp");
		rd.forward(request, response);
	}
}