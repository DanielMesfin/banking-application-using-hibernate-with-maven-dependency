package com.daniel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daniel.model.Account2Account;

import com.daniel.model.HibernateDB;

@WebServlet("/Account2AccountHandler")
public class Account2AccountHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;   
    public Account2AccountHandler() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String account = (String) request.getSession().getAttribute("accountNumber");
		String accountReciver=request.getParameter("reciverAccount");
		String tType = request.getParameter("tType");
		Double amount = Double.parseDouble(request.getParameter("amountOfMoney"));
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now(); 
		String dateCurrent = date.format(now);
		
		Account2Account transacton = new Account2Account();
		transacton.setSender(account);
		transacton.setReciver(accountReciver);
		transacton.settType(tType);
		transacton.setAmountPassed(amount);
		transacton.setDate(dateCurrent);
		HibernateDB ethioBankDataBase = new HibernateDB();
		if (!tType.isEmpty() && !amount.isNaN()) {
			boolean returnValue=ethioBankDataBase.udateAccountBalance(transacton);
				response.setContentType("text/html");
				if (returnValue) {
					out.println("<html lang=\"en\">");
					out.println("<head>");
					out.println("</head>");
					out.println("<body bgcolor=pink>");
					out.println("<center>");
					out.println("<h1> Ethio Bank</h1>");
					out.println("<center>");
					out.println("<h3> Your Transaction is Cometid By The Following Inforamtion<h3>");
					out.println("<table><tr><td><h3>Account User :</td><td></h3><h3>" + transacton.getOneAccountToManyTransaction().getFullName()+"</h3></td></tr>");
					out.println("<tr><td><h3>Account Number :</td><td></h3><h3>" + account + "</h3></td></tr>");
					out.println("<tr><td><h3>Transaction Type :</td><td></h3><h3>" + tType + "</h3></td></tr>");
					out.println("<tr><td><h3> Amount Credited:</td><td></h3><h3>" + amount + " ETB</h3></td></tr>");
					out.println("<tr><td><h3> Balance :</td><td></h3><h3>"+ ethioBankDataBase.balance(account)+"ETB</h3></td></tr>");
					out.println(" <tr><td><p>We are glad for your choose Thank you</p></td>");
					out.println("<td><a href='/BankEthiopia/Componet/ExcuteTransaction.jsp'>Back</a> </td></tr></table>");					
					out.println("</body>");
					out.println("</html >");
				} else {
					out.println("<html lang=\"en\">");
					out.println("<head>");
					out.println("</head>");
					out.println("<body bgcolor=pink>");
					out.println("<center>");
					out.println("<h1> Ethio Bank</h1>");
					out.println("<center>");
					out.println("<h3> Your Transaction is Not Cometid By The Following Inforamtion<h3>");
					out.println(" <tr><td><p>We are glad for your choose Thank you</p></td>");
					out.println("<td><a href='/BankEthiopia/Componet/ExcuteTransaction.jsp'>Back</a> </td></tr></table>");					
					out.println("</body>");
					out.println("</html >");	
				}
			
			}
		}
	}

