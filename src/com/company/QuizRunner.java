package com.company;

public class QuizRunner {

    public static void main(String[] args) {
        MultipleChoiceQuestion questionOne = new MultipleChoiceQuestion("Hg is the chemical symbol of which element?", new String[]{"Lead", "Iron", "Mercury"}, "Mercury");
        TrueFalseQuestion questionTwo = new TrueFalseQuestion("Vatican City is the smallest country in the world", "true");
        Checkbox questionThree = new Checkbox("Select all options that are state capitols", new String[]{"Montgomery", "Chesterfield", "Phoenix"}, new String[]{"Montgomery", "Phoenix"});

        questionOne.askMultipleChoice();
        questionTwo.askTrueFalseQuestion();
        questionThree.askCheckboxQuestion();
    }
}
