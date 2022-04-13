/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.QuizProcessorLocal;

/**
 *
 * @author tresorkl
 */
public class OutcomeServlet extends HttpServlet {

    @EJB
    private QuizProcessorLocal quizProcessor;

     

     

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        int answer = Integer.parseInt(request.getParameter("answer"));
        
        String result= quizProcessor.determineResult( session, answer);
        
        session.setAttribute("result", result);
        
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
         
    }

   

}
