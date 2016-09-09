package com.xkc.mvpdemo.presenter;

import com.xkc.mvpdemo.bean.Student;
import com.xkc.mvpdemo.model.IStudentModel;
import com.xkc.mvpdemo.model.StudentModel;
import com.xkc.mvpdemo.view.IMainView;

/**
 * Created by xkc on 9/8/16.
 */
public class UserPresenter {
    private IStudentModel iStudentModel;
    private IMainView iMainView;

    public UserPresenter(IMainView iMainView){
        this.iMainView = iMainView;
        this.iStudentModel = new StudentModel();
    }

    public void save(int id, String name, String gender){
        iStudentModel.save(id,name,gender);
    }

    public void load(int id){
        Student student = iStudentModel.load(id);
        iMainView.setName(student.getName());
        iMainView.setGender(student.getGender());
    }
}
