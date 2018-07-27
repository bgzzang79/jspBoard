package board.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardVo;
import board.service.BoardService;
import board.service.BoardServiceInf;

@WebServlet("/updateBoard")
public class UpdateBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardServiceInf boardService = new BoardService();
		
		int brd_num = Integer.parseInt(request.getParameter("brd_num"));
		String yn = request.getParameter("sel");
		
		BoardVo boardVo = boardService.getBoard(brd_num);

		boardVo.setBrd_yn(yn);
		
		boardService.updateYN(boardVo);
		
		response.sendRedirect("/boardServlet");
	}
}
