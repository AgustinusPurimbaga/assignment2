package com.agus.coba.aplikasi3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
    }

    public void klikMahasiswa(View v){
        Intent i = new Intent(getApplicationContext(),StudentActivity.class);
        startActivity(i);
    }

    public void klikDosen(View v){
        Intent j = new Intent(getApplicationContext(),TeacherActivity.class);
        startActivity(j);
    }
}