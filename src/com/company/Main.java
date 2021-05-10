package com.company;

public class Main {

    public static void main(String[] args) {
        MultipleChoiceQuestion questionOne = new MultipleChoiceQuestion("Hg is the chemical symbol of which element?", new String[]{"Lead", "Iron", "Mercury"}, "Mercury");

        questionOne.askMultipleChoice();
    }
}
