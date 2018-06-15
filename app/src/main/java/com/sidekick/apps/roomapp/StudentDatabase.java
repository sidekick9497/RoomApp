package com.sidekick.apps.roomapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by HaRRy on 6/10/2018.
 */

@Database(entities = {Students.class},version = 1,exportSchema = false)
public abstract class StudentDatabase extends RoomDatabase{
    public abstract StudentDaoAccess studentDaoAccess();
}
