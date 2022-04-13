<%-- 
    Document   : quiz
    Created on : 13 Apr 2022, 16:11:54
    Author     : tresorkl
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.business.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        List<Question>oldQuestionsList = (List<Question>)session.getAttribute("questions");
        String name = (String)session.getAttribute("name");
        Question question = (Question)session.getAttribute("latestQuestion");
        %>
        
        
        <h1>QUIZ</h1>
        <p>Hi <%=name%></p>
        <p>Question <%=oldQuestionsList.size()%>  what is: </p>
        <h3><%=question.getNum1()%> <%=question.getOp()%> <%=question.getNum2()%></h3><br/>
        <form action="OutcomeServlet.do" method="post">
        <input type="number" placeholder="ENTER THE ANSWER" name="answer"/><br/>
        <input type="submit"  value="SUBMIT"/>
        </form>
    </body>
</html>
