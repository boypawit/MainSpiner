package com.example.boyvi.mainspiner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainSpinner2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_spinner2);

        Intent intent = getIntent();
        String getEditT = intent.getStringExtra("editText");
        TextView textName = (TextView) findViewById(R.id.textView4); //รับค่าจาก id
        textName.setText(getEditT);
    }
}
