/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.business;

/**
 *
 * @author tresorkl
 */
public class Question {
    
    int num1;
    int num2;
    char op;

    public Question(int num1, int num2, char op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }
    
    

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }
    
    
    public int determineCorrectAnswer(){
    
        int result =0;
        
        switch (getOp()) {
            case '+':
                result = getNum1()+getNum2();
                break;
            case '-':
                result = getNum1()-getNum2();
                break;
            case '*':
                result = getNum1()*getNum2();
                break;
            case '/':
                result = getNum1()/getNum2();
                break;
            default:
                result =0;
                break;
        }
        
        return result;
    
    }
    
    
    
}
