<nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="http://localhost:8080/ShopFront/" href="http://localhost:8080/ShopFront/">Home</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
    
      <li class="nav-item">
        <a class="navbar-brand"
			href="${pageContext.request.contextPath}/manageProduct/prodReg">Product</a>
      </li>
      <li class="nav-item">
        <a class="navbar-brand"
			href="${pageContext.request.contextPath}/manageProduct/CatReg">Category</a>
      </li>
      <li class="nav-item">
        <a class="navbar-brand"
			href="${pageContext.request.contextPath}/manageProduct/SupplierReg">Supplier</a>
      </li>    
    </ul>
  </div>  
</nav>