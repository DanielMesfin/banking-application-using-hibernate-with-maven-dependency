package com.daniel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daniel.model.AccountBalance;
import com.daniel.model.CreateAccount;
import com.daniel.model.HibernateDB;
import com.daniel.model.LogInToAccount;

@WebServlet("/loginAccountHandler")
public class loginAccountHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginAccountHandler() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String accountNumber = request.getParameter("accountNumber");
		String password = request.getParameter("password");
		LogInToAccount login = new LogInToAccount(accountNumber, password);
		HibernateDB hibernateDB=new HibernateDB();
	    boolean loginValue = hibernateDB.logIn(login);
	
	    AccountBalance unserProfile=hibernateDB.unserInfomation(accountNumber);
		if (loginValue) {
			request.getSession().setAttribute("accountNumber", login.getAccountNumber());
        	request.getSession().setAttribute("his", unserProfile);
            request.getRequestDispatcher("/Componet/UserDashBord.jsp").forward(request, response);

		} else {
			// to display the login is denied is by implimantation .
			PrintWriter out=response.getWriter();
			out.println("<html lang=\"en\">");
 			out.println("<head>");
 			out.println("</head>");
 			out.println("<body bgcolor=pink>");
 			out.println("<center>");
 			out.println("<h1> Ethio Bank</h1>");
 			out.println("<center>");
 			out.println("<h3>Sorry Your Account or Password Is Incorrect, Try Again!<h3>");
 			out.println(" <p>We are glad for your choose Thank you</p>");
 			out.print("<a href='index.jsp'>Back</a>");
 			out.println("</body>");
 			out.println("</html >");		
		}

	}
}
