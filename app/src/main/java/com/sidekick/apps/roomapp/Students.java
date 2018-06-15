package com.sidekick.apps.roomapp;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by HaRRy on 6/10/2018.
 */
@Entity
public class Students {
    @NonNull
    @PrimaryKey
    private int studentId;
    private String studentName;
    public Students()
    {

    }
    public int getStudentId()
    {
        return this.studentId;
    }
    public String getStudentName()
    {
        return this.studentName;
    }
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

}
