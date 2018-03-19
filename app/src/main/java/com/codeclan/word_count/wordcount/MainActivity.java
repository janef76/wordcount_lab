package com.codeclan.word_count.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private Button countButton;
    private TextView answerCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = findViewById(R.id.input_text);
        countButton = findViewById(R.id.Count_words);
        answerCount = findViewById(R.id.answer);
    }

//    public void onButtonClick(View clickedView) {
//        String enteredText = inputText.getText().toString();
//        WordCount wordCount = new WordCount();
//        int getCount = wordCount.getWordCount(enteredText);
//        answerCount.setText("The number of words is " + getCount);
//    }

    public void onButtonClick(View clickedView) {
        String enteredText = inputText.getText().toString();
        WordCount wordCount = new WordCount();
        HashMap getCount = wordCount.getHashWordCount(enteredText);
        answerCount.setText("Words and count values: " + getCount);
    }
}
