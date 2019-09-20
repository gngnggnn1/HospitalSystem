package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.loginDao;
import Entity.Login;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理登录
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("uName");
		String pass = request.getParameter("passWord");
		Login lo = new Login(name, pass);
		loginDao ld = new loginDao();
		int result = ld.login(lo);
		if(result == 1) {//超级管理员
			response.sendRedirect("index.jsp");
		}
		else if(result == 3) {//医生
			response.sendRedirect("indexDr.jsp");
		}
		else if(result == 2) {//挂号收费员
			response.sendRedirect("indexPayRegist.jsp");
		}
		else if(result == 4) {//药房管理员
			response.sendRedirect("indexMed.jsp");
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
