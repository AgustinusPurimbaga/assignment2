package com.agus.coba.aplikasi3;

import java.util.ArrayList;

/**
 * Created by user on 10/20/2016.
 */
public class StudentList {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static StudentList instance = new StudentList();

    //set singleton class
    private StudentList(){

    }

    public static StudentList getInstance(){
        return instance;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }


    public Student removeLast(){
        Student student = studentList.remove(studentList.size()-1);
        return student;
    }

    public Student get(int index){
        Student student = studentList.get(index);
        return student;
    }

    public void set(int index, Student student){
        studentList.set(index, student);
    }

    public Student remove(int index){
        Student student = studentList.remove(index);
        resetCounterId(index);
        return student;
    }

    public Student getLast(){
        Student student = studentList.get(studentList.size()-1);
        return student;
    }

    public void AddStudents(ArrayList<Student> students){
        studentList.addAll(students);
        resetCounterId(0);
    }

    public ArrayList<Student> getList(){
        return studentList;
    }

    public int count(){
        return studentList.size();
    }

    private void resetCounterId(int i){
        for (int j = i; j < studentList.size(); j++) {
            studentList.get(j).setId(j);
        }
    }

    public void clearList(){
        studentList.clear();
    }
}
