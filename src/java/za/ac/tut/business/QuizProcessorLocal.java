/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package za.ac.tut.business;

import javax.ejb.Local;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tresorkl
 */
@Local
public interface QuizProcessorLocal {

    void updateQuestionsList(HttpSession session, Question question);

    int generateRandomNumber();

    char generateOperation();

    String determineResult(HttpSession session, int answer);
    
}
