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
			double avgGrade = (double) request.getAttribute("avgGrade");
			out.println("Name of Student :" +cs[0].getValue() + "<br>");
			out.println("Average Score :" +cs[1].getValue() + "<br>");
			out.println("Maximum Score :" +cs[2].getValue() + "<br>");
			out.println("Minimum Score :" +cs[3].getValue() + "<br>"+ "<br>");
			
			if (avgGrade >94 )
				out.println(cs[0].getValue()+" your grade is 'A+' ");
			else if (87<=avgGrade && avgGrade<=93 )
				out.println(cs[0].getValue()+" your grade is 'A' ");
			else if (80<=avgGrade && avgGrade<=86 )
				out.println(cs[0].getValue()+" your grade is 'A-' ");
			else if (77<=avgGrade && avgGrade<=79 )
				out.println(cs[0].getValue()+" your grade is 'B+' ");
			else if (73<=avgGrade && avgGrade<=76 )
				out.println(cs[0].getValue()+" your grade is 'B' ");
			else if (70<=avgGrade && avgGrade<=72 )
				out.println(cs[0].getValue()+" your grade is 'B-' ");
			else if (67<=avgGrade && avgGrade<=69 )
				out.println(cs[0].getValue()+" your grade is 'C+' ");
			else if (73<=avgGrade && avgGrade<=66 )
				out.println(cs[0].getValue()+" your grade is 'C' ");
			else if (60<=avgGrade && avgGrade<=62 )
				out.println(cs[0].getValue()+" your grade is 'C-' ");
			else if (50<=avgGrade && avgGrade<=59 )
				out.println(cs[0].getValue()+" your grade is 'D' ");
			else {out.println(cs[0].getValue()+" you have failed your class"+ "<br><br>");}
			
			
			out.println("<form action='FinalServlet' method='post'>");			
			out.println("<br><input type='submit' value='Go to Last Page'> </form>");			
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
