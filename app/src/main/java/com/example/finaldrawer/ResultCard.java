package com.example.finaldrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultCard extends AppCompatActivity {
    TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_card);
        resultView=findViewById(R.id.resultView);

        String s=getIntent().getStringExtra("Result");
        resultView.setText(s);
    }
}