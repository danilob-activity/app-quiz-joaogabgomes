package com.londonappbrewery.quizzler.models;

/**
 * Created by aluno on 23/05/19.
 */

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswerID;

    public TrueFalse(int questionID,boolean answerID) {
        mQuestionID = questionID;
        mAnswerID = answerID;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public boolean isAnswerID() {
        return mAnswerID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public void setAnswerID(boolean answerID) {
        mAnswerID = answerID;
    }
}
