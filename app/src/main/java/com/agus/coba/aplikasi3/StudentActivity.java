package com.agus.coba.aplikasi3;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
public class StudentActivity extends AppCompatActivity  implements Serializable{
    private TextView emptyView;
    ListView listView1;
    static ArrayList<Student> StudentList;
    StudentAdapter studentAdapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_student, menu);
        return true;
    }

    public void keForm(View v){
        Intent i =new Intent(getApplicationContext(),AddStudent.class);
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.satu:
                populateUsersList();

                return true;
            case R.id.dua:
                ClearList();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }





    @Override

    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        emptyView = (TextView)findViewById(R.id.empty);
        listView1 = (ListView)findViewById(R.id.Listview1);

        if (StudentList == null) StudentList = new ArrayList<Student>();
        studentAdapter = new StudentAdapter(this, StudentList);
        listView1 = (ListView) findViewById(R.id.Listview1);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student StudentListItem = StudentList.get(position);
                Intent i = new Intent(StudentActivity.this, Edit_student.class);
                i.putExtra("StudentListItem", StudentListItem);
                i.putExtra("position",position);
                startActivity(i);
            }
        });

    }
    @Override
    protected void onResume() {
        super.onResume();
        TextView empty_view = (TextView) findViewById(R.id.empty);
        if(StudentList.size() == 0) {
            studentAdapter = new StudentAdapter(this, new ArrayList<Student>());
            listView1.setEmptyView(empty_view);
            empty_view.setText("Student Not Found");
        } else {
            studentAdapter = new StudentAdapter(this, StudentList);
            empty_view.setText("");
        }
        listView1.setAdapter(studentAdapter);
    }


    private void ClearList() {
        StudentList.clear();
        studentAdapter = new StudentAdapter(this, StudentList);
        listView1.setAdapter(studentAdapter);

    }


    private void populateUsersList() {
        int i = StudentList.size();
        StudentList.add(new Student(1,"1111111","Alfredo","0812323211","alfr@gmail.com"));
        StudentList.add(new Student(2,"2222222","Bena Yonki","08567712890","bena@gmail.com"));
        StudentList.add(new Student(3,"3333333","Cerry","08567712890","cerry@gmail.com"));
        StudentList.add(new Student(4,"4444444","Dondot","08567712890","Dondot@gmail.com"));
        StudentList.add(new Student(5,"5555555","Enau","08567712890","Enau@gmail.com"));
        studentAdapter = new StudentAdapter(this, StudentList);
        listView1.setAdapter(studentAdapter);
    }

}
