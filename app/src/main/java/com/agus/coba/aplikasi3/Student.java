package com.agus.coba.aplikasi3;

import java.util.ArrayList;

/**
 * Created by user on 10/7/2016.
 */
public class Student {
    private int id;
    private String Noreg;
    private String Nama;
    private String Mail;
    private String Phone;

    public Student(int id, String Noreg, String Nama, String Mail, String Phone){
        this.id = id;
        this.Noreg = Noreg;
        this.Nama = Nama;
        this.Mail = Mail;
        this.Phone = Phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoreg() {
        return Noreg;
    }

    public void setNoreg(String noreg) {
        Noreg = noreg;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }


    public static ArrayList<Student> getStudents(){
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(new Student(1,"3145136188","TRI FEBRIANA SIAMI","0858xxxxxx","tri@mhs.unj.ac.id"));
        studentArrayList.add(new Student(2,"3145136192","Ummu Kultsum","0813xxxxxx","ummu@mhs.unj.ac.id"));
        return studentArrayList;
    }

}
