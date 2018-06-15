package com.sidekick.apps.roomapp

import android.arch.persistence.room.Room
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_student_choice.*

/**
 * Created by HaRRy on 6/10/2018.
 */
public class StudentChoiceFragment:Fragment()
{
     companion object {
         var db:StudentDatabase?=null

         fun getinstance():StudentChoiceFragment?
         {
             return StudentChoiceFragment();
         }
     }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        db = Room.databaseBuilder(activity.applicationContext,StudentDatabase::class.java,"student_db").fallbackToDestructiveMigration()
                .allowMainThreadQueries().build()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view:View? = inflater?.inflate(R.layout.fragment_student_choice,container,false)
        val submitButton:Button? = view?.findViewById(R.id.student_choice_button_submit)
        submitButton?.setOnClickListener(View.OnClickListener {
            Toast.makeText(activity,"submit Button clicked",Toast.LENGTH_LONG).show()
            var students:Students = Students();
             val studentid =  view?.findViewById<EditText>(R.id.student_id_textView)
           val   studentName = view?.findViewById<EditText>(R.id.student_name_textView)
            val id = studentid?.getText().toString().toInt()
            val name = studentName?.getText().toString()
            students.studentId = id
            students.studentName = name
            db?.studentDaoAccess()?.insertOneStudent(students)
            studentid?.setText("")
            studentName?.setText("")
        })


        return view
    }


}