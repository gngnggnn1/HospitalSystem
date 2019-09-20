package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.registDao;
import Entity.Regist;

/**
 * Servlet implementation class registServlet
 */
@WebServlet("/registServlet")
public class registServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("patientName");
		String sex = request.getParameter("patientSex");
		int age = Integer.valueOf(request.getParameter("patientAge"));
		String birthday = request.getParameter("patientBirthday");
		int idNumber = Integer.valueOf(request.getParameter("idNumber"));
		int deptID = Integer.valueOf(request.getParameter("deptChosen").substring(0, 1));
		int userID = Integer.valueOf(request.getParameter("drChosen").substring(0, 1));
		String regisTime = request.getParameter("regisTime");//午别 
		int needNotebook = Integer.valueOf(request.getParameter("needNotebook").substring(0, 1));
		
		Regist re = new Regist(idNumber, name, sex, birthday, age, regisTime, deptID, userID, needNotebook);
		registDao rd = new registDao();
		int result = rd.regist(re);
		
		if(result > 0) {
			response.sendRedirect("member-add.jsp");
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
