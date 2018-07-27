package reply.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reply.model.ReplyVo;
import reply.service.ReplyService;
import reply.service.ReplyServiceInf;
import student.model.StudentVo;

@WebServlet("/saveReply")
public class SaveReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		StudentVo stdVo = (StudentVo) session.getAttribute("studentVo");
		
		
		int pt_num = Integer.parseInt(request.getParameter("id"));
		int id = stdVo.getId();
		String com = request.getParameter("reply");
		
		ReplyServiceInf replyService = new ReplyService();
		
		ReplyVo replyVo = new ReplyVo();
		
		replyVo.setPt_num(pt_num);
		replyVo.setId(id);
		replyVo.setCom(com);
		
		replyService.insertReply(replyVo);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/postDetail");
		rd.forward(request, response);
	}


}
