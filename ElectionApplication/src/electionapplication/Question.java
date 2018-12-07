/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electionapplication;

import java.io.Serializable;


/**
 *  Date from 13/11/18 to 07/12/18
 * @author mark kelly, Lorcan Murray & Kevin Brennan
 * students numbers 17138311, 16105834 & 16149823
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
