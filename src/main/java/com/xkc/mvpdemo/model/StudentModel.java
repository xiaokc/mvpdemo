package com.xkc.mvpdemo.model;

import android.util.SparseArray;

import com.xkc.mvpdemo.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xkc on 9/8/16.
 */
public class StudentModel implements IStudentModel {
    private String id;
    private String name;
    private String gender;


    private SparseArray<Student> array = new SparseArray<>();

    @Override
    public void save(int id, String name, String gender) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setGender(gender);

        array.append(id, student);

    }

    @Override
    public Student load(int id) {
        Student notFound = new Student();
        notFound.setName("Not Found");
        notFound.setGender("Not Found");

        Student student = array.get(id,notFound);

        return student;
    }
}
