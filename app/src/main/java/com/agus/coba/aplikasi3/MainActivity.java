package com.agus.coba.aplikasi3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_student, menu);
        return true;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);


        Button button1=(Button)findViewById(R.id.mahasiswa);

        Button button2=(Button)findViewById(R.id.dosen);


        button1.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {

                Intent i =new Intent(getApplicationContext(),StudentActivity.class);

                startActivity(i);



            }

        });

        button2.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {


                Intent i =new Intent(getApplicationContext(),TeacherActivity.class);

                startActivity(i);



            }

        });


    }
}