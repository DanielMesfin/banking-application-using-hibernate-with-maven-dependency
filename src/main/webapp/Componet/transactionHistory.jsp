<%@page import="com.daniel.model.HibernateDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.daniel.model.Account2Account"%>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Transaction History Is Loading</title>
  <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
      crossorigin="anonymous"
    />
</head>
<body>
<main>
 <div class="row justify-content-center align-items-center m-5 shadow">
      <div class="table-responsive">
       <h5> <caption class="justify-content-center">
          PAYMENT HISTORY
        </caption></h5>
        <table class="table table-striped table-hover">
          <thead class="table-dark">
            <tr>
              <th>Transaction ID</th>
              <th>Date</th>
              <th>Sender Account</th>
              <th>Reciver Account</th>
              <th>Amount</th>
              <th>Transaction Type</th>
            </tr>
          </thead>
          <tbody class="table-group-divider">
          <%
          String accountHistroy = (String) request.getSession().getAttribute("accountNumber");
          HibernateDB hdb=new HibernateDB();
          List<Account2Account> his = hdb.getAllHistorys(accountHistroy);
    		  int number=0;
    		  for(Account2Account tran : his){
    			  number+=1;
             %>
            <tr>
              <td scope="row">#0<%=number %></td>
              <td><%=tran.getDate()%></td>
              <td><%=tran.getSender()%></td>
              <td><%=tran.getReciver()%></td>
              <td><%=tran.getAmountPassed()%></td>
              <td><%=tran.gettType()%></td>
           
            </tr>
            <%} %>
          </tbody>
          <tfoot></tfoot>
        </table>
      </div>
    </div>

</main>




 <!-- Bootstrap JavaScript Libraries -->
    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
      integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
      integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
      crossorigin="anonymous"
    ></script>
</body>
</html>