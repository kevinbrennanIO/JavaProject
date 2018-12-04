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
    private String q1;
    private String q2;
    private String candidate;
    private String gender;
    
    public age40to65 (String voterAge, String candidate, String gender, String q1, String q2) {
        super(voterAge);
        this.candidate = candidate;
        this.gender = gender;
        this.q1 = q1;
        this.q2 = q2;
    }

    
    public age40to65(){
        this("", "", "", "", "");
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQ1() {
        return q1;
    }

    public String getQ2() {
        return q2;
    }

    public String getCandidate() {
        return candidate;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String printDetails() {
        return super.printDetails()+" -- Gender : "+gender+" -- Children? : "+q1+" -- Car / Fuel type : "+q2+" -- Vote : "+candidate;
    }
}
