<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>

<html>
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type ="text/css" href="css/style.css">
</head>
<body>
    <h2>Product Discount Calculator</h2>
    <form action="${pageContext.request.contextPath}/calculate" method="post">
      <input type="text" name="description" placeholder="Product Description"/><br/>
      <input type="text" name="price" placeholder="List Price"/><br/>
      <input type="text" name="percent" placeholder="Discount Percent"/><br/>
      <input type="submit" id="submit" value="Calculate Discount"/>
    </form>
</body>
</html>