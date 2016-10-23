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

public class Edit_Teacher extends AppCompatActivity {

    EditText text1, text2, text3, text4, text5;
    ArrayList<Teacher> TeacherList;
    Button Save, cancel;
    private int position;
    Teacher teacherid;
    ListView listView;
    private static Edit_Teacher instance = new Edit_Teacher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__teacher);
        TeacherList = TeacherActivity.TeacherList;
        text1 = (EditText) findViewById(R.id.editId2dosen);
        text2 = (EditText) findViewById(R.id.editNip2dosen);
        text3 = (EditText) findViewById(R.id.editNama2dosen);
        text4 = (EditText) findViewById(R.id.editEmail2dosen);
        text5 = (EditText) findViewById(R.id.editPhone2dosen);
        Save = (Button)findViewById(R.id.btnUpdate2dosen);
        cancel = (Button)findViewById(R.id.btnDelete2dosen);

        Teacher teacherIsi = (Teacher) getIntent().getSerializableExtra("TeacherListItem");
        text1.setText(String.valueOf(teacherIsi.getId()));
        text2.setText(teacherIsi.getNip());
        text3.setText(teacherIsi.getNama());
        text4.setText(teacherIsi.getMail());
        text5.setText(teacherIsi.getPhone());
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
        Teacher teacher = new Teacher(getInput1, getInput2, getInput3, getInput4, getInput5);
        TeacherList.set(position, teacher);
        finish();

        Toast.makeText(getApplicationContext(), "Berhasil Diedit", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(), TeacherActivity.class);

        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_deletedosen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.delete_teacher:
                for(int l = position+1; l < TeacherList.size(); l++){
                    TeacherList.get(position+l).setId(l);
                }
                position = getIntent().getIntExtra("position", 0);
                TeacherList.remove(position);
                Toast.makeText(getApplicationContext(), "Berhasil Dihapus", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),StudentActivity.class);

                startActivity(i);

            default:
                return super.onOptionsItemSelected(item);
        }
    }





}
