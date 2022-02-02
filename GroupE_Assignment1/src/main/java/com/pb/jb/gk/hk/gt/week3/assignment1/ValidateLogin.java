package com.pb.jb.gk.hk.gt.week3.assignment1;
/** ValidateLogin validates the data coming from Index.html file. 
If the password is correct the data is transfered to the Next servlet.

 * Servlet implementation class FinalServlet
 * @ by - Jaspal Kaur Bhuller
 * @ 28-01-2022 
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 * Servlet implementation class ValidateLogin
 */
@WebServlet("/ValidateLogin")
public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
     */
    public ValidateLogin() {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter(); 
		
	    String user=request.getParameter("userName");  
	    String pswd=request.getParameter("pswd");
	    if(pswd.equals("12345")) // 12345 is the password required to login!
	  	{  
	        RequestDispatcher rd1=request.getRequestDispatcher("StudentScoreServlet");  
	        rd1.forward(request, response);  
	    }  
	    else{  
	        out.print("you have entered wrong Password..Please try again..");  
	        RequestDispatcher rd1=request.getRequestDispatcher("/login.html");  
	        rd1.include(request, response);   
	}
}

}
