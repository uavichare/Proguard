package com.example.librarydemo;

import android.content.Context;
import android.content.Intent;


public class IndoorLibrary {

    public  void s(Context c, String message){
       // Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
       // Parent p = new Parent();
        Parent.s(c,message);

    }


    public  void getNavFragment(Context c)
    {
        Intent intent = null;
        try {
            intent = new Intent(c,Class.forName("com.example.dubaiculturelibrary.TestActivity") );
            c.startActivity(intent);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
