<html>
<body>
    <header>
      <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top mb-5"  id="navbarone" >
        <div class="container-fluid text-white">
          <a class="navbar-brand" href="#">EhioBank</a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0"></ul>
            <div class="row gx-4">
              <div class="d-flex col">
                <h5><a class="nav-link" href="#">Home</a></h5>
              </div>
              <div class="col d-flex">
                <h5><a class="nav-link" href="Componet/aboutPage.jsp">About</a></h5>
              </div>
              <div class="col d-flex">
                <div class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Tasks
                   
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                      <li><a class="dropdown-item" href="Componet/ExcuteTransaction.jsp">To Use Transaction  </a></li>
                      <li><a class="dropdown-item" href="Componet/UpdateUserInformation.jsp">To Update My Information</a></li>
                      <li><hr class="dropdown-divider"></li>
                      <li><a class="dropdown-item" href="Componet/transactionHistory.jsp">To See My Transaction History</a></li>
                    </ul>
                  </div>
              </div>
              <div class="col d-flex">
                <a href="#"
                  ><svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="26"
                    height="26"
                    fill="white"
                    class="bi bi-envelope"
                    viewBox="0 0 16 16"
                  >
                    <path
                      d="M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4Zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2Zm13 2.383-4.708 2.825L15 11.105V5.383Zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741ZM1 11.105l4.708-2.897L1 5.383v5.722Z"
                    />
                  </svg>
                </a>
              </div>
              <div class="col d-flex">
                <a class="nav-link" href="Componet/logOut.jsp"
                  >
                <svg xmlns="http://www.w3.org/2000/svg" width="26" height="26" fill="currentColor" class="bi bi-box-arrow-right" viewBox="0 0 16 16">
                 <path fill-rule="evenodd" d="M10 12.5a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-9a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v2a.5.5 0 0 0 1 0v-2A1.5 1.5 0 0 0 9.5 2h-8A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-2a.5.5 0 0 0-1 0v2z"/>
                 <path fill-rule="evenodd" d="M15.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 0 0-.708.708L14.293 7.5H5.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708l3-3z"/>
                </svg></a>
              </div>
            </div>
          </div>
        </div>
      </nav>
    </header>
</body>
</html>