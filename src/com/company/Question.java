package com.company;

public abstract class Question {
    private String question;
    String answer;

    public Question(String aQuestion, String anAnswer) {
        question = aQuestion;
        answer = anAnswer;
    }

    public Question(String aQuestion) {
        question = aQuestion;
    }

    public String getQuestion() { return question; }

    public void setQuestion(String question) { this.question = question; }

    public String getAnswer() { return answer; }

    public void setAnswer(String answer) { this.answer = answer; }
}
