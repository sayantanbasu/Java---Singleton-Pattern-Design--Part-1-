package com.singletonpattern.model;

/**
 *
 * @author Sayantan
 */
public class ScoreBoard {
    // creating an instance of ScoreBoard class
    private static ScoreBoard SINGLE_INSTANCE = null;
    
    // variables
    private int score;
    
    // make constructor as private and restrict it's access from outside of this class 
    private ScoreBoard(){
        this.score = 0;
    }
    
    // create a getter method to get instance references
    public static ScoreBoard getInstance(){
        if(SINGLE_INSTANCE == null){
           SINGLE_INSTANCE = new ScoreBoard();
        }
        return SINGLE_INSTANCE;
    }
    
    // setter method for score
    public void setScore(int score){
        this.score  = score;
    }

    // getter method for score
    public int getScore(){
        return this.score;
    }
}
