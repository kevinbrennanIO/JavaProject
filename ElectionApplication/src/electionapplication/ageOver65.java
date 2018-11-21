/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electionapplication;

/**
 *
 * @author markk
 */
public class ageOver65 extends Question {
    private String bracket4q1;
    private String bracket4q2;
    
    public ageOver65 (String q1, String bracket4q1, String bracket4q2){
        super (q1);
        this.bracket4q1=bracket4q1;
        this.bracket4q2=bracket4q2;
    }
    
    public ageOver65(){
        this("","","");
    }

    public String getBracket4q1() {
        return bracket4q1;
    }

    public void setBracket4q1(String bracket4q1) {
        this.bracket4q1 = bracket4q1;
    }

    public String getBracket4q2() {
        return bracket4q2;
    }

    public void setBracket4q2(String bracket4q2) {
        this.bracket4q2 = bracket4q2;
    }
    
}
