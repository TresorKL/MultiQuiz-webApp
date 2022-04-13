/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.OutCome;
import za.ac.tut.business.Question;
import za.ac.tut.business.QuizProcessorLocal;

/**
 *
 * @author tresorkl
 */
public class StartSession extends HttpServlet {

    @EJB
    private QuizProcessorLocal quizProcessor;

     

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        
        String name =  request.getParameter("name");
        
        
        List<Question> questions = new ArrayList<>();
        
        List<OutCome>outcomes= new ArrayList<>();
        session.setAttribute("outcomes",outcomes);
        session.setAttribute("name",name);
        session.setAttribute("questions",questions);
        
        // generate question
        
        int num1 =quizProcessor.generateRandomNumber();
        int num2 =quizProcessor.generateRandomNumber();
        char operation = quizProcessor.generateOperation();
        
        Question question = new Question(num1,num2,operation);
        
        // add question to the session
        quizProcessor.updateQuestionsList(session, question);
         
        
        session.setAttribute("latestQuestion", question);
        
        
        
       RequestDispatcher disp = request.getRequestDispatcher("quiz.jsp");
       disp.forward(request, response);
    }

    
 
   

}
