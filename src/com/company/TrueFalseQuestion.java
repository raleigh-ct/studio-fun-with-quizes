package com.company;

import java.util.Scanner;

public class TrueFalseQuestion extends Question{
    //Fields

    //Constructor
    TrueFalseQuestion(String aQuestion, String anAnswer) {
        super(aQuestion, anAnswer);
    }

    //Getters Setters


    //Method
    public int askTrueFalseQuestion(){
        Scanner tfScanner = new Scanner(System.in);
        System.out.println(getQuestion() + "\n" + "\nOptions: True or False");
        String userResponse = tfScanner.nextLine().toLowerCase();
        if (userResponse.equals(answer)) {
            System.out.println("That is correct!");
            return 1;
        } else {
            System.out.println("That was wrong  :(  ");
            return 0;
        }
    }

}
