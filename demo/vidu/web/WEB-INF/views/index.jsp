<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/15/2019
  Time: 4:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h3>Sandwitch Condiments</h3>
<form:form action="/save" method="POST" >
  <table>
    <tr>
      <td><label>
        <input type="checkbox" name="condiments" value="Lettuce">
      </label>Lettuce</td>
      <td><label>
        <input type="checkbox" name="condiments" value="Tomato">
      </label>Tomato</td>
      <td><label>
        <input type="checkbox" name="condiments" value="Mustard">
      </label>Mustard</td>
      <td><label>
        <input type="checkbox" name="condiments" value="Sprouts">
      </label>Sprouts</td>
    </tr>
    <tr><td><input type="submit" value="save"></td></tr>
  </table>
</form:form>
</body>
</html>