package Servlet;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.addpresDao;
import Entity.Prescription;

/**
 * Servlet implementation class addPres
 */
@WebServlet("/addpresServlet")
public class addpresServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		int registID = Integer.valueOf(request.getParameter("registID").substring(0, 4));
		String presName = URLDecoder.decode(request.getParameter("presName"), "UTF-8") ;
		
		Prescription pc = new Prescription(registID, presName);
		addpresDao ad = new addpresDao();
		int result = ad.addPres(pc);
		
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
