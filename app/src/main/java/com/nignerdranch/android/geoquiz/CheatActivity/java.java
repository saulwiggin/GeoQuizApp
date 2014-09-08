package com.nignerdranch.android.geoquiz.CheatActivity;

import android.os.Bundle;

/**
 * Created by Icarus on 9/8/2014.
 */
public class java {

    private boolean mAnswerIsTrue;

    @Override
    protected void onCreate(Bundle savedInstanceState){
           super.onCreate(savedInstanceState);
            setContentView(R.layout.actuivity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        mAnswerTextView = (TextView)findViewById(R.id.answerTextView);

        mShowAnswer = (Button)FundViewById(R.id.showAnswerButton);
        mShowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mAnswerTextView.setText(R.string.true_button););
            } else {
                mAnswerTextView.setText(R.string.false_button);
            }
        })
    }
}
