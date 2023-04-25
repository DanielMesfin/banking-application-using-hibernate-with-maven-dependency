<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.daniel.model.AccountBalance"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update User Information is Loading </title>
 <meta name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <!-- Bootstrap CSS v5.2.1 -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
      crossorigin="anonymous"
    />
</head>
<body>
<%@ include file="header.jsp" %>
<%AccountBalance userinfo=(AccountBalance) request.getSession().getAttribute("his");%>
 <main class="my-5 py-5 mx-3 px-3">
        <!--This is  for updating user information-->
        <form action="<%=request.getContextPath()%>/userInformationUpdateHolder" class="form-control" method="post"> 
            <div class="col-sm-12 shadow-lg">
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
          </div>
          <div class="row justify-content-center bg-opacity-100 bg-white shadow m-1">
            <h3 class="text-center mb-3">Update Your Information</h3>
            <div class=" col-sm-12 mt-2">
              <label for="fullNameEdit" class="form-label "><h5 class="text-center">Full Name </h5></label>
              <input type="text" class="form-control" id="fullNameEdit" name="fullname" placeholder="Enter the amount of money "  value="<%=userinfo.getAccountNumber().getFullName()%>">
            </div>
            <div class="col-sm-12 mt-2">
              <label for="emailAddress" class="form-label "><h5 class="text-center">Email Address </h5></label>
              <input type="email" class="form-control" id="emailAddress" name="emailAddressEdit" value="<%=userinfo.getAccountNumber().getEmailAddress() %>"  placeholder="Don't Enter Account unless you use Transfer" >
            </div>
            <div class=" col-sm-12 mt-2">
              <label for="accontNumberEdit" class="form-label "><h5 class="text-center">Account Number</h5></label>
                <input type="number" class="form-control" name="accontNumberEdit" id="accontNumberEdit" placeholder="Don't Enter Account unless you use Transfer" value="<%=userinfo.getAccountNumber().getAccountNumber() %>" disabled>
            </div>
                <div class=" col-sm-12 mt-2">
              <label for="accontPassword" class="form-label "><h5 class="text-center">Account Password</h5></label>
                <input type="number" class="form-control" name="accontPassword" id="accontPassword"   placeholder="Don't Enter Account unless you use Transfer" value="<%=userinfo.getAccountNumber().getPassword() %>" >
            </div>
            <div class="col-6  mt-2 ">
              <button type="submit" class="btn btn-primary btn-lg">Save change</button>
            </div>
          </div>
          </form>
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