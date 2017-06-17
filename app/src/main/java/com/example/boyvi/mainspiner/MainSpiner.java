package com.example.boyvi.mainspiner;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainSpiner extends AppCompatActivity {
    Spinner spinnerCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_spiner);

        spinnerCountry = (Spinner) findViewById(R.id.spinner_country);


        final String[] country = getResources().getStringArray(R.array.country_arrays);
        ArrayAdapter<String> adapterCountry = new ArrayAdapter<String>(this,
                  android.R.layout.simple_dropdown_item_1line,country);
        spinnerCountry.setAdapter(adapterCountry);

        //ข้างล่าง สร้างไว้เวลาเราเลือกมันจะเปลี่ยนเป็น select ข้อมูลที่เลือกอยู่
        spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override//ใช้เวล่คลิกเลือก
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                /*String countryName = country[position];//ค่า position คือค่าที่เราเลือก
                TextView textViewsp = (TextView) findViewById(R.id.textView2);
                textViewsp.setText(countryName);//โชว์ใน textview

                Toast.makeText(MainSpiner.this,countryName ,Toast.LENGTH_LONG).show();
                //Toast เป็นคล้ายๆการ aleat ค่าขึ้น
                */

            }

            @Override //เวลาคลิกข้างนอก
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

           Button buttonCountry = (Button) findViewById(R.id.button);
        //ข้างล่างเป็นการสร้าง onclick ใน java ไม่ต้องเข้าไปใน xml

           buttonCountry.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   String countName = spinnerCountry.getSelectedItem().toString();

                   /*
                   //Toast.makeText(MainSpiner.this,countName ,Toast.LENGTH_LONG).show();

                   //ข้างล่างเป็นการสร้างการคลิกแล้วก็โชว์ dialog ขึ้นมา
                   AlertDialog.Builder builderDialog = new AlertDialog.Builder(MainSpiner.this);
                   builderDialog.setTitle("Country");
                   builderDialog.setMessage(countName);
                   builderDialog.show();
                   */
                   Intent intent = new Intent(MainSpiner.this,MainSpinner2.class);
                   intent.putExtra("editText",countName);
                   startActivity(intent);

               }
           });

    }
}
