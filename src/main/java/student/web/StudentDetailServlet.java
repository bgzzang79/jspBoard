package student.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.model.StudentVo;
import student.service.StudentService;
import student.service.StudentServiceInf;


@WebServlet("/studentDetail")
public class StudentDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//학생 id를 파라미터 확인
		int id = Integer.parseInt(request.getParameter("id"));
		
		//service 학생 정보를 조회
		StudentServiceInf studentService = new StudentService();
		StudentVo studentVo = studentService.getStudent2(id);
		
		//request 객체에 저장
		request.setAttribute("studentVo", studentVo);
		
		//student/studentDetail.jsp로 위임
		RequestDispatcher rd = request.getRequestDispatcher("/student/studentDetail.jsp");
		rd.forward(request, response);
	}
}
