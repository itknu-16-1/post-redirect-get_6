package redirect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S
 */
@WebServlet("/S")
public class S extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get parameter and add it to storage
		ItemRepository.add(request.getParameter("item"));
				
		// add list to args and redirect to JSP
		request.setAttribute("list", ItemRepository.getAll());
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/t.jsp");
		dispatcher.forward(request, response); 
	}

}
