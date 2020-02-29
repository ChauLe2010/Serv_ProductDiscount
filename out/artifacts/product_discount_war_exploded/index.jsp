<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/29/2020
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount</title>
  </head>
  <body>
  <form action="/discount" method="post">
    <h1>Product Discount</h1>
    <p>
      Product Description:
      <br>
      <textarea name="description"></textarea>
    </p>
    <p>
      List Price:
      <br>
      <input type="number" name="price" placeholder="Price">
    </p>
    <p>
      Discount Amount:
      <br>
      <input type="number" name="amount">
    </p>
    <p>
      <input type="submit" value="Calculate Discount">
    </p>
  </form>
  </body>
</html>
