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
        studentArrayList.add(new Student(1,"1111111","Alfredo","0812323211","alfr@gmail.com"));
        studentArrayList.add(new Student(2,"2222222","Bena Yonki","08567712890","bena@gmail.com"));
        studentArrayList.add(new Student(3,"3333333","Cerry","08567712890","cerry@gmail.com"));
        studentArrayList.add(new Student(4,"4444444","Dondot","08567712890","Dondot@gmail.com"));
        studentArrayList.add(new Student(5,"5555555","Enau","08567712890","Enau@gmail.com"));

        return studentArrayList;
    }

}
