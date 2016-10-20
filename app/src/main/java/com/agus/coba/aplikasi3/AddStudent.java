package com.agus.coba.aplikasi3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddStudent extends AppCompatActivity {
    EditText text1, text2, text3, text4, text5;
    ListView show;
    Button Save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        text1 = (EditText) findViewById(R.id.editId);
        text2 = (EditText) findViewById(R.id.editNim);
        text3 = (EditText) findViewById(R.id.editNama);
        text4 = (EditText) findViewById(R.id.editEmail);
        text5 = (EditText) findViewById(R.id.editPhone);
        Save = (Button)findViewById(R.id.btnUpdate);
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Save();

            }
        });
    }

    public void Save(){

        int getInput1 = Integer.parseInt(text1.getText().toString());
        String getInput2 = text2.getText().toString();
        String getInput3 = text3.getText().toString();
        String getInput4 = text4.getText().toString();
        String getInput5 = text5.getText().toString();
        Student student = new Student(getInput1, getInput2, getInput3, getInput4, getInput5);
        StudentList studentList = StudentList.getInstance();
        studentList.addStudent(student);

        Toast.makeText(getApplicationContext(), "Student successfully added", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(), DaftarNama.class);

        startActivity(i);
    }
}
