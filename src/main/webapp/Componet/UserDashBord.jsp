<%@page import="com.daniel.model.CreateAccount"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ page import="com.daniel.model.AccountBalance"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User DashBord Is Loading </title>
 <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
      integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"
      integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD"
      crossorigin="anonymous"
    ></script>
</head>
<body>
<%@ include file="header.jsp" %>
<%AccountBalance userinformation=(AccountBalance) request.getSession().getAttribute("his");%>
<!-- below is the form of dash boerd  -->
    <main class="m-5">
      <div class="row justify-content-center shadow">
        <div class="col-lg-5 col-sm-12 shadow mx-2 px-3">
          <div class="align-items-centet text-center">
            <svg
            xmlns="http://www.w3.org/2000/svg"
            width="80"
            height="80"
            fill="#6b09eb"
            class="bi bi-cash-coin"
            viewBox="0 0 16 16"
          >
            <path
              fill-rule="evenodd"
              d="M11 15a4 4 0 1 0 0-8 4 4 0 0 0 0 8zm5-4a5 5 0 1 1-10 0 5 5 0 0 1 10 0z"
            />
            <path
              d="M9.438 11.944c.047.596.518 1.06 1.363 1.116v.44h.375v-.443c.875-.061 1.386-.529 1.386-1.207 0-.618-.39-.936-1.09-1.1l-.296-.07v-1.2c.376.043.614.248.671.532h.658c-.047-.575-.54-1.024-1.329-1.073V8.5h-.375v.45c-.747.073-1.255.522-1.255 1.158 0 .562.378.92 1.007 1.066l.248.061v1.272c-.384-.058-.639-.27-.696-.563h-.668zm1.36-1.354c-.369-.085-.569-.26-.569-.522 0-.294.216-.514.572-.578v1.1h-.003zm.432.746c.449.104.655.272.655.569 0 .339-.257.571-.709.614v-1.195l.054.012z"
            />
            <path
              d="M1 0a1 1 0 0 0-1 1v8a1 1 0 0 0 1 1h4.083c.058-.344.145-.678.258-1H3a2 2 0 0 0-2-2V3a2 2 0 0 0 2-2h10a2 2 0 0 0 2 2v3.528c.38.34.717.728 1 1.154V1a1 1 0 0 0-1-1H1z"
            />
            <path
              d="M9.998 5.083 10 5a2 2 0 1 0-3.132 1.65 5.982 5.982 0 0 1 3.13-1.567z"
            />
          </svg>
          <h3 class=" ">EthioBank Is Your Bank </h3>
          </div>
         
            <div class="justify-content-start ">
              <ul class="align-content-end">
                <li class="">The people’s bank.</li>
                <li class="">Your kind of people… your kind of bank.</li>
                <li class="">Worth Our Weight In Gold.</li>
                <li class="">Working Hard For Your Money.</li>
                <li class="">A Company You Can Bank On.</li>
                <li class="">Working for a better tomorrow.</li>
                <li class="">Smart way to Bank.</li>
              </ul>
            </div>
        </div>
        <div class=" col-lg-5 col-sm-12 shadow mx-2 px-3">
           <h2 class="text-center">You Information</h2>
           <div class="justify-content-center px-5 mx-5">
            <img class="rounded-circle" width="65" alt="avatar1" src="https://mdbcdn.b-cdn.net/img/new/avatars/9.webp" />
           </div>
           <label for="b"><h3 class="text-center">Owner Name:</h3></label>
          <input type="text" name="balance" id="b" disabled value="<%=userinformation.getAccountNumber().getFullName()%>">
          <label for="b0"><h3 class="text-center">Your Account: </h3></label>
          <input type="text" name="balance" id="b0" disabled value="<%=userinformation.getAccountNumber().getAccountNumber()%>">
          <label for="b1"><h3 class="text-center">Your Balance : </h3></label>
            <input type="text" name="balance" id="b1" disabled value="<%=userinformation.getAccountBalance()%>">
            <div class="row gy-2">
             <button type="button" class="btn btn-primary  text-decoration-none">
             <a href="<%=request.getContextPath()%>/Componet/UpdateUserInformation.jsp" class="  link text-white text-decoration-none">Update Your Information</a>
              </button>
              <button type="button" class="btn btn-primary">
              <a href="<%=request.getContextPath()%>/Componet/ExcuteTransaction.jsp" class="link text-white text-decoration-none">Execute  Your Transaction</a>
           </button>
           <button type="button" class="btn btn-primary">
              <a href="<%=request.getContextPath()%>/Componet/transactionHistory.jsp" class="link text-white text-decoration-none">See Transaction History</a>
           </button>
            </div>
         </div>
         </div>
    
        </div>
    </main>
<%@ include file="footer.jsp" %>
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