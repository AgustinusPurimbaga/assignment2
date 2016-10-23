package com.agus.coba.aplikasi3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 10/22/2016.
 */
public class TeacherAdapter extends ArrayAdapter<Teacher> {

    public TeacherAdapter(Context context, ArrayList<Teacher> teachers) { super(context, 0, teachers);}
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Teacher teacher = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.teacher_instance, parent, false);
        }
        TextView tvId = (TextView) convertView.findViewById(R.id.tviddosen);
        TextView tvNama = (TextView) convertView.findViewById(R.id.tvnamadosen);
        TextView tvNip = (TextView) convertView.findViewById(R.id.tvnipdosen);
        TextView tvMail = (TextView) convertView.findViewById(R.id.tvmaildosen);
        TextView tvPhone = (TextView) convertView.findViewById(R.id.tvphonedosen);
        tvId.setText(teacher.getId()+ "");
        tvNama.setText(teacher.getNama());
        tvNip.setText(teacher.getNip());
        tvMail.setText(teacher.getMail());
        tvPhone.setText(teacher.getPhone());
        return convertView;

    }
}