package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.treatDao;
import Entity.Treat;

/**
 * Servlet implementation class treatServlet
 */
@WebServlet("/treatServlet")
public class treatServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");
		
		int registID = Integer.valueOf(request.getParameter("registID").substring(0, 4));
		String actionInChief = request.getParameter("actionInChief");
		String presentSickHistory = request.getParameter("presentSickHistory");
		String presentSickTreatment = request.getParameter("presentSickTreatment");
		String previousHistory = request.getParameter("previousHistory");
		String allergicHistory = request.getParameter("allergicHistory");
		String physicalExam = request.getParameter("physicalExam");
		String advice = request.getParameter("advice");
		String notice = request.getParameter("notice");
		String sickResult = request.getParameter("sickResult");
		
		Treat tr = new Treat(registID, actionInChief, presentSickHistory, presentSickTreatment, previousHistory, 
				allergicHistory, physicalExam, advice , notice, sickResult); 
		treatDao td = new treatDao();
		int result = td.treat(tr);
		
		if(result > 0) {
			response.sendRedirect("doctor-category.jsp");
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
