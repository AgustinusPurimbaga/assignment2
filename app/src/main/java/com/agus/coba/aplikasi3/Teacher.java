package com.agus.coba.aplikasi3;

import java.io.Serializable;

/**
 * Created by user on 10/22/2016.
 */
public class Teacher implements Serializable {
    private int id;
    private String Nip;
    private String Nama;
    private String Mail;
    private String Phone;

    public Teacher(int id, String Nip, String Nama, String Mail, String Phone){
        this.id = id;
        this.Nip = Nip;
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

    public String getNip() {
        return Nip;
    }

    public void setNip(String noreg) {
        Nip = noreg;
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
