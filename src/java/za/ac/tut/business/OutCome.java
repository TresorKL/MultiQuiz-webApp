 
package za.ac.tut.business;

 
public class OutCome {
   
    Question question;
    int userAnswer;
    String result;

    public OutCome(Question question, int userAnswer, String result) {
        this.question = question;
        this.userAnswer = userAnswer;
        this.result = result;
    }

    
    
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    
}
