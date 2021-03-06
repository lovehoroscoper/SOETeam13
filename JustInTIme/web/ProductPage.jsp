<%@page import="source.Product"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>

        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <title>Products</title>
        <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7; IE=EmulateIE9">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/heroic-features.css" rel="stylesheet">
        <link href="css/tables.css" rel="stylesheet">


    </head>
    <nav id="navbarnavbar-inversenavbar-fixed-top" class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div id="container" class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div id="navbar-header" class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span id="sr-only" class="sr-only">Toggle navigation</span>
                    <span id="icon-bar" class="icon-bar"></span>
                    <span id="icon-bar" class="icon-bar"></span>
                    <span id="icon-bar" class="icon-bar"></span>
                </button>
                <a class="navbar-brand">Just In Time Inventories</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul id="navnavbar-nav" class="nav navbar-nav">
                    <li>
                        <a id="myaccount" href="#">My account</a>
                    </li>
                    <li>
                        <a id="mysettings" href="#">My Settings</a>
                    </li>
                    <li>
                        <a id="myorder" href="#">My order</a>
                    </li>
                </ul>
                <ul id="navnavbar-navnavbar-right" class="nav navbar-nav navbar-right">
                    <li>
                        <a id="cart" href="CartBufferServlet">Cart</a>
                    </li>
                    <li>
                        <a id="logout" href="LogoutServlet">Logout</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>


    <!-- Products ================================================== -->
    <div align = "center">
        <form action = "SearchServlet" method ="post">
            <input type="text" name="Product">
            <input type ="submit" value="Search">
        </form>
    </div>
    <table border="1" style="width:35%" align = "center" id="table">
        <div>
            <input type="hidden" name="action" value="details" />

        </div
        <tr>
            <th align = "center">Product Name</th>
            <th align = "center">Product Number</th>
            <th align = "center">Product Price</th>
            <th align = "center">Product Availability</th>
            <th align = "center">Product Description</th>
        </tr>

        <c:forEach items="${productList.productArray}" var="product">

            <tr>
                <c:url value="/ProductServlet" var = "productDetails">
                    <c:param name = "productNumber" value = "${product.itemNo}"/>
                    <c:param name = "productName" value = "${product.itemName}"/>
                    <c:param name = "productPrice" value = "${product.itemPrice}"/>
                    <c:param name = "productCount" value = "${product.itemCount}"/>
                    <c:param name = "productDescription" value = "${product.itemDescription}"/>
                    <c:param name = "action" value = "details"/>
                </c:url>
                <td align = "center"><a href="${productDetails}">${product.itemName}</td>
                <td align = "center">#${product.itemNo}</td>
                <td align = "center">$${product.itemPrice}</td>
                <td align = "center">${product.itemCount}</td>
                <td align = "center">${product.itemDescription}</td>
            </tr>
        </c:forEach>

    </table>



</body>
</html>