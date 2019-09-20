package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.handOutMedDao;
import Dao.payDao;
import Entity.HandOutMed;

/**
 * Servlet implementation class handOutMedServlet
 */
@WebServlet("/handOutMedServlet")
public class handOutMedServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int registID = Integer.valueOf(request.getParameter("registID").substring(0, 4));
		
		HandOutMed hom = new HandOutMed(registID);
		handOutMedDao hod = new handOutMedDao();
		
		int result = hod.handOutMed(hom);
		
		if(result > 0) {
			response.sendRedirect("handoutMed.jsp");
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
