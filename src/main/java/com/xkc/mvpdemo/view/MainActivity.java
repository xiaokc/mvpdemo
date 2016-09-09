package com.xkc.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.xkc.mvpdemo.R;
import com.xkc.mvpdemo.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, IMainView{
    private EditText id_et;
    private EditText name_et;
    private EditText gender_et;

    private Button save_btn;
    private Button load_btn;

    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        id_et = (EditText) findViewById(R.id.id);
        name_et = (EditText) findViewById(R.id.name);
        gender_et = (EditText) findViewById(R.id.gender);

        save_btn = (Button) findViewById(R.id.save);
        load_btn = (Button) findViewById(R.id.load);

        userPresenter = new UserPresenter(this);


        save_btn.setOnClickListener(this);
        load_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.save:
                userPresenter.save(getId(),getName(),getGender());
                break;
            case R.id.load:
                userPresenter.load(getId());
                break;
        }

    }

    @Override
    public void setName(String name) {
        name_et.setText(name);
    }

    @Override
    public void setGender(String gender) {
        gender_et.setText(gender);
    }

    @Override
    public int getId() {
        return Integer.parseInt(id_et.getText().toString());
    }

    @Override
    public String getName() {
        return name_et.getText().toString();
    }

    @Override
    public String getGender() {
        return gender_et.getText().toString();
    }
}
