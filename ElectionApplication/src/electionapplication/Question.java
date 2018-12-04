/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electionapplication;

import java.io.Serializable;


/**
 *
 * @author markk
 */
public class Question implements Serializable {
    protected String voterAge;
 
    public Question(String voterAge){
        this.voterAge = voterAge;
    }
    
    public Question(){
        this("");
    }

    public String getVoterAge() {
        return voterAge;
    }

    public void setVoterAge(String voterAge) {
        this.voterAge = voterAge;
    }

   
    public String printDetails(){
        return " Age Group : "+voterAge;
    }
    
    
}
