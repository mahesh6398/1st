package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.click);
        EditText name = findViewById(R.id.personname);
        EditText age = findViewById(R.id.personage);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String Dname = name.getText().toString();
                    String Dage = age.getText().toString();

                    Intent i = new Intent(MainActivity.this,SecondActivity.class);

                    i.putExtra("name",Dname);
                    i.putExtra("age",Dage);

                    startActivity(i);
            }
        });
    }
}