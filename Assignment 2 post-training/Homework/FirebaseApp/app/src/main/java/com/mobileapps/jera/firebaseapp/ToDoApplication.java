package com.mobileapps.jera.firebaseapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by jera on 6/10/16.
 */
public class ToDoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
