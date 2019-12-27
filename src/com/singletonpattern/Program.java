package com.singletonpattern;

import com.singletonpattern.model.ScoreBoard;


/**
 * @author Sayantan
 */

public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreBoard scoreBoard1 = ScoreBoard.getInstance();
        scoreBoard1.setScore(10);
        System.out.println("scoreBoard1: Score is - " + scoreBoard1.getScore());
        
        ScoreBoard scoreBoard2 = ScoreBoard.getInstance();
        scoreBoard2.setScore(50);
        System.out.println("scoreBoard1: Score is - " + scoreBoard1.getScore());
        System.out.println("scoreBoard2: Score is - " + scoreBoard2.getScore());
    }
    
}
