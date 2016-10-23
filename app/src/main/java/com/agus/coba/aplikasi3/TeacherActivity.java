package com.agus.coba.aplikasi3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by user on 10/22/2016.
 */
public class TeacherActivity extends AppCompatActivity implements Serializable {
    ListView listView1;
    static ArrayList<Teacher> TeacherList;
    TeacherAdapter teacherAdapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_teacher, menu);
        return true;
    }

    public void keForm(View v){
        Intent i =new Intent(getApplicationContext(),AddTeacher.class);
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
        setContentView(R.layout.list_view2);
        listView1 = (ListView)findViewById(R.id.ListviewDOSEN);

        if (TeacherList == null) TeacherList = new ArrayList<Teacher>();
        teacherAdapter = new TeacherAdapter(this, TeacherList);
        listView1 = (ListView) findViewById(R.id.ListviewDOSEN);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Teacher TeacherListItem = TeacherList.get(position);
                Intent i = new Intent(TeacherActivity.this, Edit_Teacher.class);
                i.putExtra("TeacherListItem", TeacherListItem);
                i.putExtra("position",position);
                startActivity(i);
            }
        });

    }
    @Override
    protected void onResume() {
        super.onResume();
        TextView empty_view = (TextView) findViewById(R.id.empty);
        if(TeacherList.size() == 0) {
            teacherAdapter = new TeacherAdapter(this, new ArrayList<Teacher>());
            listView1.setEmptyView(empty_view);
            empty_view.setText("Teacher Not Found");
        } else {
            teacherAdapter = new TeacherAdapter(this, TeacherList);
            empty_view.setText("");
        }
        listView1.setAdapter(teacherAdapter);
    }


    private void ClearList() {
        TeacherList.clear();
        teacherAdapter = new TeacherAdapter(this, TeacherList);
        listView1.setAdapter(teacherAdapter);

    }


    private void populateUsersList() {
        int i = TeacherList.size();
        TeacherList.add(new Teacher(1,"1111111","Alfredo","0812323211","alfr@gmail.com"));
        TeacherList.add(new Teacher(2,"2222222","Bena Yonki","08567712890","bena@gmail.com"));
        TeacherList.add(new Teacher(3,"3333333","Cerry","08567712890","cerry@gmail.com"));
        TeacherList.add(new Teacher(4,"4444444","Dondot","08567712890","Dondot@gmail.com"));
        TeacherList.add(new Teacher(5,"5555555","Enau","08567712890","Enau@gmail.com"));
        teacherAdapter = new TeacherAdapter(this, TeacherList);
        listView1.setAdapter(teacherAdapter);
    }

}
