<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <c:if test="false">
      我真牛！
    </c:if>

    <%
      List list = new ArrayList();
      list.add("aaa");
      list.add("bbb");
      list.add("ccc");
      request.setAttribute("list",list);
      request.setAttribute("number",3);
    %>

    <c:if test="${not empty list}">
      hhhhhhh
    </c:if>

    <c:choose>
        <c:when test="${number == 1}">星期1</c:when>
        <c:when test="${number == 2}">星期2</c:when>
        <c:when test="${number == 3}">星期3</c:when>
        <c:when test="${number == 4}">星期4</c:when>
        <c:when test="${number == 5}">星期5</c:when>
        <c:when test="${number == 6}">星期6</c:when>
        <c:when test="${number == 7}">星期7</c:when>
        <c:otherwise>gun</c:otherwise>
    </c:choose>
    <br>

    <c:forEach var="i" begin="0" end="5" step="1" varStatus="s">
      ${i}<br>
    </c:forEach>

    <c:forEach items="${list}" var="str" varStatus="s">
      ${s.index} ${s.count} ${str} <br>
    </c:forEach>





  </body>
</html>
