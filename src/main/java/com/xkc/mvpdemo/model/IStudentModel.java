package com.xkc.mvpdemo.model;

import com.xkc.mvpdemo.bean.Student;

/**
 * Created by xkc on 9/8/16.
 */
public interface IStudentModel {

    /**
     * 保存学生信息
     * @param id
     * @param name
     * @param gender
     */
    void save(int id, String name, String gender);

    /**
     * 根据学号读取学生
     * @param id
     * @return
     */
    Student load(int id);
}
