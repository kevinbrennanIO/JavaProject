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
    private String q1;
    private String q2;
    private String candidate;
    private String gender;
    
    public ageOver65 (String voterAge, String candidate, String gender, String q1, String q2) {
        super(voterAge);
        this.candidate = candidate;
        this.gender = gender;
        this.q1 = q1;
        this.q2 = q2;
    }
    
    public ageOver65(){
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
        return super.printDetails()+"\nGender : "+gender+"\nVote in previous election : "+q1+"\nSmart phone : "+q2+"\n\nVote : "+candidate;
    }
    
}
