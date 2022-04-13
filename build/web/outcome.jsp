<%-- 
    Document   : outcome
    Created on : 13 Apr 2022, 18:29:18
    Author     : tresorkl
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.business.OutCome"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String name = (String)session.getAttribute("name");
        List<OutCome>outcomes =(List<OutCome>)session.getAttribute("outcomes");
        OutCome outcome= outcomes.get(outcomes.size()-1);
        
        %>
        <h1>OUT COME</h1>
        <p>Hi <%=name%> here is the outcome:</p><br/>
        <h4>Question: <%=outcome.getQuestion().getNum1()%>  <%=outcome.getQuestion().getOp()%> <%=outcome.getQuestion().getNum2()%> ?</h4>
        <h4>Your answer: <%=outcome.getUserAnswer()%></h4>
        <h4>Correct answer: <%=outcome.getQuestion().determineCorrectAnswer()%></h4>
        <h4>Outcome: <%=outcome.getResult()%></h4><br/>
        
       
        <form action="QuizServlet.do" method="post">
            Please click <button  type="submit" value="1" name="next">here</button>   to continue or <button  type="submit" value="2" name="next">here</button> to end
        </form>
        
    </body>
</html>
