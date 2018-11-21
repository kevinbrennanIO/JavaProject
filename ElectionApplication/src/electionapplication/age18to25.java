package electionapplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author markk
 */
public class age18to25 extends Question {
    private String bracket1q1;
    private String bracket1q2;
    
    public age18to25 (String q1, String bracket1q1, String bracket1q2){
        super (q1);
        this.bracket1q1=bracket1q1;
        this.bracket1q2=bracket1q2;
    }
    
    public age18to25(){
        this("","","");
    }

    public String getBracket1q1() {
        return bracket1q1;
    }

    public void setBracket1q1(String bracket1q1) {
        this.bracket1q1 = bracket1q1;
    }

    public String getBracket1q2() {
        return bracket1q2;
    }

    public void setBracket1q2(String bracket1q2) {
        this.bracket1q2 = bracket1q2;
    }
    
    
}
