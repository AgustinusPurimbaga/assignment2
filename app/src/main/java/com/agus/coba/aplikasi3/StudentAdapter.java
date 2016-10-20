package com.agus.coba.aplikasi3;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


/**
 * Created by user on 10/7/2016.
 */
public class StudentAdapter extends ArrayAdapter<Student> {

    public StudentAdapter(Context context, ArrayList<Student> students) { super(context, 0, students);}
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Student student = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_instance, parent, false);
        }
        TextView tvId = (TextView) convertView.findViewById(R.id.tvid);
        TextView tvNama = (TextView) convertView.findViewById(R.id.tvnama);
        TextView tvNoreg = (TextView) convertView.findViewById(R.id.tvnoreg);
        TextView tvMail = (TextView) convertView.findViewById(R.id.tvmail);
        TextView tvPhone = (TextView) convertView.findViewById(R.id.tvphone);
        tvId.setText(student.getId()+ "");
        tvNama.setText(student.getNama());
        tvNoreg.setText(student.getNoreg());
        tvMail.setText(student.getMail());
        tvPhone.setText(student.getPhone());
        return convertView;

    }
}

