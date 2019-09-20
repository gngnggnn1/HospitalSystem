package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.openmedDao;
import Entity.Openmed;

/**
 * Servlet implementation class openmedServlet
 */
@WebServlet("/openmedServlet")
public class openmedServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		int presID = Integer.valueOf(request.getParameter("presID").substring(0, 3));
		int medID = Integer.valueOf(request.getParameter("medID").substring(0, 1));
		String medUsage = request.getParameter("medUsage");
		String medDosage = request.getParameter("medDosage");
		String medFrequency = request.getParameter("medFrequency");
		int medAmount = Integer.valueOf(request.getParameter("medAmount"));
		
		Openmed om = new Openmed(presID, medID, medUsage, medDosage, medFrequency, medAmount);
		openmedDao od = new openmedDao();
		
		int result = od.openMed(om);
		
		if(result > 0) {
			response.sendRedirect("openMed.jsp");
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
