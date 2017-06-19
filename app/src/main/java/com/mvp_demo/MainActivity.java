package com.mvp_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements UserView {


    EditText username  ;
    EditText password;
    Button submit;
    TextView showname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= (EditText) findViewById(R.id.user_name);
        password= (EditText) findViewById(R.id.password);
        submit= (Button) findViewById(R.id.submit);
        showname= (TextView) findViewById(R.id.name);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                UserPresenter userPresenter=new UserPresenter(MainActivity.this);
                userPresenter.dologin(username.getText().toString(),password.getText().toString());

            }
        });


    }

    @Override
    public void showError() {
        Toast.makeText(this,"帐号密码错误",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showname(String name) {

        showname.setText(name);

    }
}
