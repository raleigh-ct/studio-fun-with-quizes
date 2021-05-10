package com.company;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question{
    //Fields
    String[] answerSet;
    String answer;

    //Constructor
    public MultipleChoiceQuestion(String aQuestion, String[] anAnswerSet, String anAnswer) {
        super(aQuestion);
        answerSet = anAnswerSet;
        answer = anAnswer;
    }

    // Getters/Setters
    public String[] getAnswerSet() {

        return answerSet;
    }
    public void setAnswerSet(String[] answerSet) { this.answerSet = answerSet; }
    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }

    //Methods
    public int askMultipleChoice(){
        Scanner mcScanner = new Scanner(System.in);
        System.out.println(getQuestion() + "\n" + "\nOptions: " + getAnswerSet());
        String userResponse = mcScanner.nextLine();
        if (userResponse == this.answer) {
            System.out.println("That is correct!");
            return 1;
        } else {
            System.out.println("That was wrong  :(  ");
            return 0;
        }
    }

}
