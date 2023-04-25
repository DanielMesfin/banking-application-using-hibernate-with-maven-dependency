package com.daniel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daniel.model.AccountBalance;
import com.daniel.model.CreateAccount;
import com.daniel.model.HibernateDB;

@WebServlet("/createAccountHandler")
public class createAccountHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public createAccountHandler() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fullName = request.getParameter("fristName") + " " + request.getParameter("lastName");
		String accountNumber = request.getParameter("accountNumber");
		String emial = request.getParameter("email");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cPassword");
		PrintWriter out=response.getWriter();
		if (!fullName.isEmpty() && !accountNumber.isEmpty() && !emial.isEmpty() && !password.isEmpty()
				&& !cpassword.isEmpty()) {
			if (password.equals(cpassword)) {
				// 1, Call the constructor of user information to provide user information;
				CreateAccount accoutInformation = new CreateAccount();
				accoutInformation.setFullName(fullName);
				accoutInformation.setAccountNumber(accountNumber);
				accoutInformation.setEmailAddress(emial);
				accoutInformation.setPassword(password);
				AccountBalance accountBalance=new AccountBalance();
				accountBalance.setAccountNumber(accoutInformation);
				accountBalance.setAccountBalance(0.0);
				// 2, Call the constructor of database holder to get database method
				HibernateDB hibernateDB = new HibernateDB();
	             Boolean crated=hibernateDB.createNewAccount(accoutInformation,accountBalance);
				// 3 display some sort of information for the user
	             
	             if(crated) {
	            	 out.println("<html lang=\"en\">");
						out.println("<head>");
						out.println("</head>");
						out.println("<body bgcolor=pink>");
						out.println("<center>");
						out.println("<h1> Ethio Bank</h1>");
						out.println("<center>");
						out.println("<h3> Congar ! Your Account Is Created Succsefull With the Folowing Information<h3>");
						out.println("<table><tr><td><h3>Account User :</td><td></h3><h3>" +accoutInformation.getFullName()+"</h3></td></tr>");
						out.println("<tr><td><h3>Account Number :</td><td></h3><h3>" + accoutInformation.getAccountNumber() + "</h3></td></tr>");
						out.println("<tr><td><h3>Email Address :</td><td></h3><h3>" + accoutInformation.getEmailAddress()+ "</h3></td></tr>");
						out.println(" <tr><td><p>We are glad for your choose Thank you</p></td>");
						out.println("<td><a href='/BankEthiopia/Componet/createAccount.jsp'>Back</a> </td></tr></table>");					
						out.println("</body>");
						out.println("</html >");
	             }else {
	            	// request.getSession().setAttribute("notSaved", "ns");
	            	 out.println("<html lang=\"en\">");
	     			out.println("<head>");
	     			out.println("</head>");
	     			out.println("<body bgcolor=pink>");
	     			out.println("<center>");
	     			out.println("<h1> Ethio Bank</h1>");
	     			out.println("<center>");
	     			out.println("<h3>Sorry Your Account is Not Created Please Try Again!<h3>");
	     			out.println(" <p>We are glad for your choose Thank you</p>");
	     			out.print("<a href='/BankEthiopia/Componet/createAccount.jsp'>Back</a>");
	     			out.println("</body>");
	     			out.println("</html >");
				}
			} else {
				out.println("<html lang=\"en\">");
				out.println("<head>");
				out.println("</head>");
				out.println("<body bgcolor=pink>");
				out.println("<center>");
				out.println("<h1> Ethio Bank</h1>");
				out.println("<center>");
				out.println("<h3> Please Check your password , password Mismatch<h3>");
				out.println(" <p>We are glad for your choose Thank you</p>");
				out.print("<a href='/BankEthiopia/Componet/createAccount.jsp'>Back</a>");
				out.println("</body>");
				out.println("</html >");
			}
		} else {
			out.println("<html lang=\"en\">");
			out.println("<head>");
			out.println("</head>");
			out.println("<body bgcolor=pink>");
			out.println("<center>");
			out.println("<h1> Ethio Bank</h1>");
			out.println("<center>");
			out.println("<h3> Please  Fill The Form All Properly<h3>");
			out.println(" <p>We are glad for your choose Thank you</p>");
			out.print("<a href='/BankEthiopia/Componet/createAccount.jsp'>Back</a>");
			out.println("</body>");
			out.println("</html >");
		}
	}
}
