package com.example.subramanyam.mvc_example;

import android.view.View;

/**
 * Created by Subramanyam on 12/1/2017.
 */

public class MainViewPresenter {

    MainView mainView;
    User user;

    MainViewPresenter(MainView view){
        this.mainView=view;
        user=new User();
    }

    public void updateEmail(String email) {
        user.setEmail(email);
    }

    public void updateName(String name) {
        user.setName(name);
    }

    public void updateText(){
        mainView.updateTextView(user.getString());
    }
}
