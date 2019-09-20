package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.treatDao;
import Dao.unregistDao;
import Entity.Treat;
import Entity.Unregist;

/**
 * Servlet implementation class unregistServlet
 */
@WebServlet("/unregistServlet")
public class unregistServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int medRecordID = Integer.valueOf(request.getParameter("medRecordID").substring(0, 6));
		
		Unregist ur = new Unregist(medRecordID);
		unregistDao ud = new unregistDao();
		int result = ud.unregist(ur);
		
		if(result > 0) {
			response.sendRedirect("unregist.jsp");
		}
		else {
			response.sendRedirect("fail.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
