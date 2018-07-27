package board.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.BoardVo;
import board.service.BoardService;
import board.service.BoardServiceInf;

/**
 * Servlet implementation class InsertBoardServlet
 */
@WebServlet("/insertBoard")
public class InsertBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String boardName = request.getParameter("boardName");
		String yn = request.getParameter("createSel");
		System.out.println(boardName);
		System.out.println(yn);
		HttpSession session = request.getSession();
		session.setAttribute("boardName", boardName);
		
		BoardServiceInf boardService = new BoardService();
		
		BoardVo boardVo = new BoardVo();
		boardVo.setBrd_name(boardName);
		boardVo.setBrd_yn(yn);
		
		boardService.addBoard(boardVo);
		
		RequestDispatcher rd = request.getRequestDispatcher("/boardServlet");
		rd.forward(request, response);
	}
}
