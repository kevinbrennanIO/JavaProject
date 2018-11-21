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
public class age40to65 extends Question {
    private String bracket3q1;
    private String bracket3q2;
    
    public age40to65 (String q1, String bracket3q1, String bracket3q2){
        super (q1);
        this.bracket3q1=bracket3q1;
        this.bracket3q2=bracket3q2;
    }
    
    public age40to65(){
        this("","","");
    }

    public String getBracket3q1() {
        return bracket3q1;
    }

    public void setBracket3q1(String bracket3q1) {
        this.bracket3q1 = bracket3q1;
    }

    public String getBracket3q2() {
        return bracket3q2;
    }

    public void setBracket3q2(String bracket3q2) {
        this.bracket3q2 = bracket3q2;
    }
}
