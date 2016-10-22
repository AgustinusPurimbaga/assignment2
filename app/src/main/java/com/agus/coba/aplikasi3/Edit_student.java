package com.agus.coba.aplikasi3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class Edit_student extends AppCompatActivity {

    EditText text1, text2, text3, text4, text5;
    ArrayList<Student> StudentList;
    Button Save, cancel;
    private int position;
    Student studentid;
    ListView listView;
    private static Edit_student instance = new Edit_student();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);
        StudentList = StudentActivity.StudentList;
        text1 = (EditText) findViewById(R.id.editId2);
        text2 = (EditText) findViewById(R.id.editNim2);
        text3 = (EditText) findViewById(R.id.editNama2);
        text4 = (EditText) findViewById(R.id.editEmail2);
        text5 = (EditText) findViewById(R.id.editPhone2);
        Save = (Button)findViewById(R.id.btnUpdate2);
        listView = (ListView) findViewById(R.id.Listview1);
        cancel = (Button)findViewById(R.id.btnDelete2);

        Student studentIsi = (Student) getIntent().getSerializableExtra("StudentListItem");
        text1.setText(String.valueOf(studentIsi.getId()));
        text2.setText(studentIsi.getNoreg());
        text3.setText(studentIsi.getNama());
        text4.setText(studentIsi.getMail());
        text5.setText(studentIsi.getPhone());
        position = getIntent().getIntExtra("position", 0);
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void edit(){

        int getInput1 = Integer.parseInt(text1.getText().toString());
        String getInput2 = text2.getText().toString();
        String getInput3 = text3.getText().toString();
        String getInput4 = text4.getText().toString();
        String getInput5 = text5.getText().toString();
        Student student = new Student(getInput1, getInput2, getInput3, getInput4, getInput5);
        StudentList.set(position, student);
        finish();

        Toast.makeText(getApplicationContext(), "Berhasil Diedit", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(), StudentActivity.class);

        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_delete, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.delete_student:
        }
        return super.onOptionsItemSelected(item);
    }



}
