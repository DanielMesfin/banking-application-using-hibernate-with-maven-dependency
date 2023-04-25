package com.daniel.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daniel.model.CreateAccount;
import com.daniel.model.HibernateDB;

/**
 * Servlet implementation class userInformationUpdateHolder
 */
public class userInformationUpdateHolder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userInformationUpdateHolder() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String account = (String) request.getSession().getAttribute("accountNumber");
		String fullName = request.getParameter("fullname");
		String emailAddresss = request.getParameter("emailAddressEdit");
		String passwordUpdate = request.getParameter("accontPassword");
		CreateAccount updateAccount=new CreateAccount();
		updateAccount.setFullName(fullName);
		updateAccount.setEmailAddress(emailAddresss);
		updateAccount.setPassword(passwordUpdate);
		
		HibernateDB HDB=new HibernateDB();
    	boolean update  =	HDB.udateUserInformation(account,updateAccount);
	   PrintWriter out=response.getWriter();
     if(update) {
	out.println("<html lang=\"en\">");
	out.println("<head>");
	out.println("</head>");
	out.println("<body bgcolor=pink>");
	out.println("<center>");
	out.println("<h1> Ethio Bank</h1>");
	out.println("<center>");
	out.println("<h3> Congra , Your information is Updated <h3>");
	out.println(" <p>We are glad for your choose Thank you</p>");
	out.print("<a href='/BankEthiopia/Componet/UpdateUserInformation.jsp'>Back</a>");
	out.println("</body>");
	out.println("</html >");
}else {
	out.println("<html lang=\"en\">");
	out.println("<head>");
	out.println("</head>");
	out.println("<body bgcolor=pink>");
	out.println("<center>");
	out.println("<h1> Ethio Bank</h1>");
	out.println("<center>");
	out.println("<h3>Sorry, Your information is Updated <h3>");
	out.println(" <p>We are glad for your choose Thank you</p>");
	out.print("<a href='/BankEthiopia/Componet/UpdateUserInformation.jsp'>Back</a>");
	out.println("</body>");
	out.println("</html >");
}
}
}
