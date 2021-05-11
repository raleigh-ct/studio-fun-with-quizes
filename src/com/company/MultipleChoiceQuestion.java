package com.company;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question{
    //Fields
    String[] answerSet;

    //Constructor
    public MultipleChoiceQuestion(String aQuestion, String[] anAnswerSet, String anAnswer) {
        super(aQuestion, anAnswer);
        answerSet = anAnswerSet;
    }

    // Getters/Setters
    public String getAnswerSet() {
        String answerSetString = "";
        for (String option : answerSet) {
            answerSetString += option + "   ";
        }
        return answerSetString;
    }
    public void setAnswerSet(String[] answerSet) { this.answerSet = answerSet; }

    //Methods
    public int askMultipleChoice(){
        Scanner mcScanner = new Scanner(System.in);
        System.out.println(getQuestion() + "\n" + "\nOptions: " + getAnswerSet());
        String userResponse = mcScanner.nextLine();
        if (userResponse.equals(answer)) {
            System.out.println("That is correct!");
            return 1;
        } else {
            System.out.println("That was wrong  :(  ");
            return 0;
        }
    }

}
