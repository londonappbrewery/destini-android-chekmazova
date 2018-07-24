package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryIndex;

    private StoryPlot[] stories = new StoryPlot[]{
            new StoryPlot(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new StoryPlot(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new StoryPlot(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new StoryPlot(R.string.T4_End),
            new StoryPlot(R.string.T5_End),
            new StoryPlot(R.string.T6_End),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        mStoryIndex = 0;
        mTextView.setText(stories[mStoryIndex].getStory());
        mButtonTop.setText(stories[mStoryIndex].getAnswerTop());
        mButtonBottom.setText(stories[mStoryIndex].getAnswerBottom());


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex ==0 || mStoryIndex ==1) {
                    mStoryIndex =2;
                    mTextView.setText(stories[mStoryIndex].getStory());
                    mButtonTop.setText(stories[mStoryIndex].getAnswerTop());
                    mButtonBottom.setText(stories[mStoryIndex].getAnswerBottom());
                } else {
                    mStoryIndex =5;
                    mTextView.setText(stories[mStoryIndex].getStory());
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex ==0){
                    mStoryIndex =1;
                    mTextView.setText(stories[mStoryIndex].getStory());
                    mButtonTop.setText(stories[mStoryIndex].getAnswerTop());
                    mButtonBottom.setText(stories[mStoryIndex].getAnswerBottom());
                } else if (mStoryIndex == 1){
                    mStoryIndex =3;
                    mTextView.setText(stories[mStoryIndex].getStory());
                    mButtonTop.setText(stories[mStoryIndex].getAnswerTop());
                    mButtonBottom.setText(stories[mStoryIndex].getAnswerBottom());
                } else {
                    mStoryIndex =4;
                    mTextView.setText(stories[mStoryIndex].getStory());
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                }

            }
        });


    }
}
