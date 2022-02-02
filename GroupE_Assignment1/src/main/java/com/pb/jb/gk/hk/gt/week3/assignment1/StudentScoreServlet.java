package com.pb.jb.gk.hk.gt.week3.assignment1;
// StudentScoreServlet takes scores of 5 subjects.
/** @ by Gagandeep Kaur
* @ 29-01-2022 
**/

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentScoreServlet
 */
@WebServlet("/StudentScoreServlet")
public class StudentScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentScoreServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String v_user = request.getParameter("userName");
	    out.println("Welcome  " + v_user);
	    
		HttpSession session = request.getSession();
		session.setAttribute("userName",  v_user);
		
		out.print("<link rel='stylesheet' href='style.css'>"
				+"<form method=\'post\' action=\'FindAverage\'>"
          +"<br><label for='studentName'> Student Name </label>"	
		  +"<input type=\'text\' name=\'studentName\'>"
          +"<br><label for='score1'> Subject 1 Score </label>"	
		  +"<input type=\'text\' name=\'score1\'> "
          +"<br><label for='score2'> Subject 2 Score </label>"	
		  +"<input type=\'text\' name=\'score2\' >"
		  +"<br><label for='score3'> Subject 3 Score </label>"	
		  +"<input type=\'text\' name=\'score3\' >"
		  +"<br><label for='score4'> Subject 4 Score </label>"	
		  +"<input type=\'text\' name=\'score4\' >"
		  +"<br><label for='score5'> Subject 5 Score </label>"	
		  +"<input type=\'text\' name=\'score5\' >"
		  +"<br><input type='submit' value='Calculate Average'/>"+
		  "</form>" + "</div>");
		out.close();
	} catch(Exception e)
		{
		System.out.println(e);
		}
	}
}