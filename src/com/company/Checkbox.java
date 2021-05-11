package com.company;

import java.util.Scanner;

public class Checkbox extends Question{
    //Fields
    String[] answerOptions;
    String[] answers;

    //Constructor
    public Checkbox(String aQuestion, String[] theAnswerOptions, String[] theAnswers) {
        super(aQuestion);
        answerOptions = theAnswerOptions;
        answers = theAnswers;

    }

    //Getters Setters

    public String getAnswerOptions() {
        String answerOptionsString = "";
        for (String option : answerOptions) {
            answerOptionsString += option + "   ";
        }
        return answerOptionsString; }

    public void setAnswerOptions(String[] answerOptions) { this.answerOptions = answerOptions; }

    public String getAnswers() {
        String answersString = "";
        for (String option : answers) {
            answersString += option + "   ";
        }
        return answersString; }


    //Methods

    public int askCheckboxQuestion(){
        Scanner cbScanner = new Scanner(System.in);
        System.out.println("\n" + getQuestion() + "\n" + "\nOptions: " + getAnswerOptions());
        String[] userResponse = cbScanner.nextLine().split(" ");
        int numberRight = 0;
        for (int i=0;i<userResponse.length;i++) {
            for (int j=0;j<answers.length;j++) {
                if (userResponse[i].equals(answers[j])) {
                    numberRight += 1;
                }
            }
        }
        if (numberRight == 0) {
            System.out.println("No correct answers :( ");
        }
        System.out.println(numberRight + " correct responses out of " + answers.length);
        return numberRight;
    }
}
