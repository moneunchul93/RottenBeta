package com.example.moneunchul93.rottenbeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText NameText = (EditText) findViewById(R.id.NameText);
        EditText YearText = (EditText) findViewById(R.id.YearText);
        EditText monthText = (EditText) findViewById(R.id.monthText);
        EditText dayText = (EditText) findViewById(R.id.dayText);
        EditText livingText = (EditText) findViewById(R.id.livingText);

        Button registerbutton = (Button) findViewById(R.id.registerbutton);
    }
}
