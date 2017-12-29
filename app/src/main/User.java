package com.example.subramanyam.mvc_example;

/**
 * Created by Subramanyam on 12/1/2017.
 */

public class User {

   private String email;
   private String name;

    public void setEmail(String email) {
        this.email = email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getString(){
        return  "Name : "+name+" Email :"+email;
    }
}
