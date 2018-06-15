package com.sidekick.apps.roomapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by HaRRy on 6/10/2018.
 */

public class StudentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        FragmentManager fm = getSupportFragmentManager();
        Fragment studentChoiceFragment = fm.findFragmentById(R.id.student_activity_fragment_container);
        if(studentChoiceFragment == null)
        {
            studentChoiceFragment = StudentChoiceFragment.Companion.getinstance();
            fm.beginTransaction().add(R.id.student_activity_fragment_container,studentChoiceFragment).commit();
        }

    }
}
