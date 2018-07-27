package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import encrypt.kisa.sha256.KISA_SHA256;
import student.model.StudentVo;
import student.service.StudentService;
import student.service.StudentServiceInf;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	* Method : doGet
	* 최초작성일 : 2018. 7. 3.
	* 작성자 : PC09
	* 변경이력 :
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException
	* Method 설명 :
	*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	* Method : doPost
	* 최초작성일 : 2018. 7. 3.
	* 작성자 : PC09
	* 변경이력 :
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException
	* Method 설명 :
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		String std_id = request.getParameter("std_id");
		String pass = request.getParameter("pass");
		
		String encryptPass = KISA_SHA256.encrypt(pass);
		
		System.out.println("id: "+std_id);
		System.out.println("pass : "+encryptPass);
		
		//로그인 프로세스
		StudentServiceInf studentService = new StudentService();
		
		
		List<StudentVo> studentVo = studentService.selectAllStudent();
		HttpSession session = request.getSession();
		
		for (StudentVo vo : studentVo) {
			if(std_id.equals(vo.getStd_id()) && encryptPass.equals(vo.getPass())){
				session.setAttribute("studentVo",vo);
				System.out.println("통과");
				request.getRequestDispatcher("/login/info.jsp").forward(request, response);
				return;
			}
		}
		System.out.println("실패");
		response.sendRedirect("/login/loginTest.jsp");
	}
}
