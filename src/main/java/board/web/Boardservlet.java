package board.web;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class Boardservlet
 */
@WebServlet("/boardServlet")
public class Boardservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BoardServiceInf boardService = new BoardService();
		List<BoardVo> boardList = boardService.selectAllBoard();
		List<BoardVo> boardYList = boardService.selectYBoard();
		
		HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		session.setAttribute("boardYList", boardYList);
		
		RequestDispatcher rd = request.getRequestDispatcher("/board/createBoard.jsp");
		rd.forward(request, response);

	}
}