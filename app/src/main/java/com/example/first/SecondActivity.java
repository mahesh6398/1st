package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();

        String name = i.getStringExtra("name");
        String age = i.getStringExtra("age");

        TextView t1 = findViewById(R.id.t1);
        TextView t2 = findViewById(R.id.t2);

        t1.setText(name);
        t2.setText(age);

    }
}