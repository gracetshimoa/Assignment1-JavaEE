package com.pb.jb.gk.hk.gt.week3.assignment1;
// FindAverageServlet take the data anad find the average, minimum and maximum scores given by user.
// In this we use the session approach. Data is then sent to the FinalServlet.
/**
 * @ Harpreet Kaur
 *  @ 29-01-2022 
**/
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FindAverage
 */
@WebServlet("/FindAverage")
public class FindAverage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindAverage() {
	
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		double score1, score2, score3,score4,score5, total, avg;
		String name = request.getParameter("studentName");
		score1 = Double.parseDouble(request.getParameter("score1"));
		score2 = Double.parseDouble(request.getParameter("score2"));
		score3 = Double.parseDouble(request.getParameter("score3"));
		score4 = Double.parseDouble(request.getParameter("score4"));
		score5 = Double.parseDouble(request.getParameter("score5"));
		total = score1+score2+score3+score4+score5;
		avg = (total/5.0) ;
		String avgScore =(String.valueOf(avg));
		
		double[] scores ={score1,score2,score3,score4,score5};
		Arrays.sort(scores);
		double min = scores[0];
		double max = scores[scores.length-1];
	
		
		Cookie c1 = new Cookie("studetName", name);
		Cookie c2 = new Cookie("avg", avgScore);
		Cookie c3 = new Cookie("max", String.valueOf(max));
		Cookie c4 = new Cookie("min", String.valueOf(min));
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		response.addCookie(c4);
		
		RequestDispatcher r1 = request.getRequestDispatcher("DisplayResult");
		r1.forward(request,  response);
	}

} 
