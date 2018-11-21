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
public class age25to40 extends Question {
    private String bracket2q1;
    private String bracket2q2;
    
    public age25to40 (String q1, String bracket2q1, String bracket2q2){
        super (q1);
        this.bracket2q1=bracket2q1;
        this.bracket2q2=bracket2q2;
    }
    
    public age25to40(){
        this("","","");
    }

    public String getBracket2q1() {
        return bracket2q1;
    }

    public void setBracket2q1(String bracket2q1) {
        this.bracket2q1 = bracket2q1;
    }

    public String getBracket2q2() {
        return bracket2q2;
    }

    public void setBracket2q2(String bracket2q2) {
        this.bracket2q2 = bracket2q2;
    }
}
