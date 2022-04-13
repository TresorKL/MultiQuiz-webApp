<%-- 
    Document   : summary
    Created on : 13 Apr 2022, 19:34:53
    Author     : tresorkl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        int num =1;
        %>
        
        <c:forEach items='${sessionScope["outcomes"]}' var='outcome'>
           
            <u>
                <li>Question <%=num++%>  </li>
                <li>Question: ${outcome.getQuestion().getNum1()}  ${outcome.getQuestion().getOp()} ${outcome.getQuestion().getNum2()} ?</li>
                <li>Your answer: ${outcome.getUserAnswer()}<li>
                <li>Correct answer: ${outcome.getQuestion().determineCorrectAnswer()}</li>
                <li>Outcome: ${outcome.getResult()}</li>
            </u><br/><br/>
            
        </c:forEach>
        
    </body>
</html>
