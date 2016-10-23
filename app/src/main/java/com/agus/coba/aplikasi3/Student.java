package com.agus.coba.aplikasi3;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by user on 10/7/2016.
 */
public class Student implements Serializable {
    static ArrayList<Student> StudentList;
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

    public int getId() {return id;

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


}
