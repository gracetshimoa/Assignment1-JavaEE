package com.pb.jb.gk.hk.gt.week3.assignment1;
/**
 * @ Grace Tshimoa
 *  @ 31-01-2022 
**/
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class DisplayResult
 */
@WebServlet("/DisplayResult")
public class DisplayResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayResult() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			try {
			HttpSession session = request.getSession(false);
			String n_user =(String) session.getAttribute("userName");
			PrintWriter out= response.getWriter();
			Cookie cs[] = request.getCookies();
			out.println("Name of Student :" +cs[0].getValue() + "<br>");
			out.println("Average Score :" +cs[1].getValue() + "<br>");
			out.println("Maximum Score :" +cs[2].getValue() + "<br>");
			out.println("Minimum Score :" +cs[3].getValue() + "<br>");
			
			out.println("<form action='FinalServlet' method='post'>");			
			out.println("<input type='submit' value='Go to Last Page'> </form>");			
			out.close();
			}
			catch (Exception e)
			{
				System.out.println(e);		
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

} 
