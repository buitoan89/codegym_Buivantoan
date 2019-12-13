<%@ page import="model.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 12/10/2019
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Tao Danh Sach Khach Hang$</title>
</head>
<body>

<%--<form action="/abc" method="get">--%>

    <%
        List<Customer> list = Customer.getList();
        request.setAttribute("bientam",list);
    %>

    <table border="1">
        <tr>
            <th colspan="3">Tao Danh Sach Khach Hang</th>
        </tr>
        <tr>
            <td>ten</td>
            <td>ngay sinh</td>
            <td>dia chi</td>
            <td>hinh anh</td>
        </tr>
                <c:forEach items="${bientam}" var="cus">
        <tr>
                    <td>    <c:out value="${cus.getName()}"/> </td>
                    <td>    <c:out value="${cus.getNgaysinh()}"/> </td>
                    <td>    <c:out value="${cus.getDiachi()}"/> </td>
                    <td>    <c:out value="${cus.getHinhanh()}"/> </td>
        </tr>
                </c:forEach>
    </table>
<%--</form>--%>
</body>
</html>
