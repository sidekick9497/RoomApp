package com.sidekick.apps.roomapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by HaRRy on 6/10/2018.
 */

@Dao
public interface StudentDaoAccess {
 @Insert
    void insertOneStudent(Students student);
 @Query("SELECT * FROM Students WHERE studentId = :studentId")
    Students fetchOneStudent(int studentId);
 @Query("SELECT * FROM Students")
    List<Students> fetchAllStudent();

}
