package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.openmedDao;
import Dao.payDao;
import Entity.Openmed;
import Entity.Pay;

/**
 * Servlet implementation class payServlet
 */
@WebServlet("/payServlet")
public class payServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int presID = Integer.valueOf(request.getParameter("presID").substring(0, 3));
		int operatorID = Integer.valueOf(request.getParameter("operatorID"));
		
		Pay pay = new Pay(presID, operatorID);
		payDao pd = new payDao();
		
		int result = pd.pay(pay);
		
		if(result > 0) {
			response.sendRedirect("pay.jsp");
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
