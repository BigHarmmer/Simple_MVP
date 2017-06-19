package com.mvp_demo;

/**
 * Created by z on 2017/6/19.
 */

public class MyModel implements UserModel {

    Userbean myuserbean;

    public MyModel(Userbean userbean)
    {
        myuserbean=userbean;
    }

    @Override
    public boolean check() {


        if(myuserbean.getUsername().equals("admin")&&myuserbean.getPassword().equals("123456"))
        {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String back_name() {
        return "David";
    }
}
