package com.mvp_demo;

/**
 * Created by z on 2017/6/19.
 */

public class UserPresenter implements Presenter{

    private UserView myUserView;
    private MyModel myModel;
    Userbean userbean;

    public  UserPresenter(UserView userview){

        myUserView=userview;
    }


    @Override
    public void dologin(String username, String password) {

        userbean=new Userbean(username,password);
        myModel=new MyModel(userbean);
        if(myModel.check())
        {
            String name= myModel.back_name();
            myUserView.showname(name);

        }
        else {
            myUserView.showError();
        }
    }
}
