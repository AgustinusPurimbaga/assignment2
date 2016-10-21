package com.agus.coba.aplikasi3;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
public class DaftarNama extends AppCompatActivity{
    private TextView emptyView;
    ListView listView1;
    StudentList studentList;
    StudentAdapter studentadapter;

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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        emptyView = (TextView)findViewById(R.id.empty);
        listView1 = (ListView)findViewById(R.id.Listview1);



    }

    private void ClearList() {
        emptyView = (TextView)findViewById(R.id.empty);
        emptyView.setVisibility(View.VISIBLE);
        listView1 = (ListView) findViewById(R.id.Listview1);
        listView1.setVisibility(View.INVISIBLE);

    }


    private void populateUsersList() {
        ArrayList<Student> arrayOfUsers = Student.getStudents();
        StudentAdapter adapter = new StudentAdapter(this, arrayOfUsers);
        listView1.setAdapter(adapter);
        emptyView = (TextView)findViewById(R.id.empty);
        listView1 = (ListView)findViewById(R.id.Listview1);
        emptyView.setVisibility(View.INVISIBLE);
        listView1.setVisibility(View.VISIBLE);
    }

}
