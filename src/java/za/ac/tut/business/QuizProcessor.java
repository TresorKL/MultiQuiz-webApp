/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package za.ac.tut.business;

import java.util.List;
import java.util.Random;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tresorkl
 */
@Stateless
public class QuizProcessor implements QuizProcessorLocal {

    @Override
    public void updateQuestionsList(HttpSession session,  Question question) {
        
        List<Question>oldQuestionsList = (List<Question>)session.getAttribute("questions");
        
        oldQuestionsList.add(question);
        
        List<Question> newQuestionsList =oldQuestionsList;
        
        session.setAttribute("questions", newQuestionsList);
        
        
    }

    @Override
    public int generateRandomNumber() {
        
        Random rn = new Random();
        int num = rn.nextInt(20-1+1)+1;
        
        return num;
    }

    @Override
    public char generateOperation() {
        
        char[] operations={'+','-','*','/'};
        
        Random rn = new Random();
        int num = rn.nextInt(3-0+0)+0;
        
        
        return operations[num];
    }

    @Override
    public String determineResult(HttpSession session, int answer) {
        
        String result ="WRONG";
        
        List<Question>questions= (List<Question>)session.getAttribute("questions");
        
        Question question = questions.get(questions.size()-1);
        
        if(question.determineCorrectAnswer() ==answer){
            result ="CORRECT";
        }
        
        
        //update outcomelist
        OutCome outcome = new OutCome(question,answer,result);
        List<OutCome>outcomes= (List<OutCome>)session.getAttribute("outcomes");
        
        outcomes.add(outcome);
        
        List<OutCome>newOutcomes= outcomes;
        session.setAttribute("outcomes", newOutcomes);
        
        
        
        return result;
    }
    
    
    
    
    
    
    

     
}
