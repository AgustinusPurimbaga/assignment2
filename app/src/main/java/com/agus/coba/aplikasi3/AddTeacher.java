package com.agus.coba.aplikasi3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AddTeacher extends AppCompatActivity {
    EditText text1, text2, text3, text4, text5;
    ArrayList<Teacher> TeacherList;
    Button Save, cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_teacher);
        TeacherList = TeacherActivity.TeacherList;
        text1 = (EditText) findViewById(R.id.editIddosen);
        text2 = (EditText) findViewById(R.id.editNipdosen);
        text3 = (EditText) findViewById(R.id.editNamadosen);
        text4 = (EditText) findViewById(R.id.editEmaildosen);
        text5 = (EditText) findViewById(R.id.editPhonedosen);
        Save = (Button)findViewById(R.id.btnUpdatedosen);
        cancel = (Button)findViewById(R.id.btnDeletedosen);
        Intent i = getIntent();
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Save();

            }
        });
        cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void Save(){

        int getInput1 = Integer.parseInt(text1.getText().toString());
        String getInput2 = text2.getText().toString();
        String getInput3 = text3.getText().toString();
        String getInput4 = text4.getText().toString();
        String getInput5 = text5.getText().toString();
        Teacher teacher = new Teacher(getInput1, getInput2, getInput3, getInput4, getInput5);
        TeacherList.add(teacher);
        finish();

        Toast.makeText(getApplicationContext(), "Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(), TeacherActivity.class);

        startActivity(i);
    }
}
