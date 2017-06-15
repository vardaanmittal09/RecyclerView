package com.example.android.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentArrayList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentArrayList=generateStudent();
        recyclerView= (RecyclerView) findViewById(R.id.rvList);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(studentArrayList,this);
        // Define Layout of recyclerview before setAdapter
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //for reverse list
        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true));
        recyclerView.setAdapter(recyclerViewAdapter);
    }
    static  ArrayList<Student> generateStudent(){
        ArrayList<Student> student=new ArrayList<>();
        student.add(new Student("A","Pandora"));
        student.add(new Student("B","Elixir"));
        student.add(new Student("C","Pandora"));
        student.add(new Student("D","Elixir"));
        student.add(new Student("E","Pandora"));
        student.add(new Student("F","Elixir"));
        student.add(new Student("G","Pandora"));
        student.add(new Student("H","Elixir"));
        student.add(new Student("A","Pandora"));
        student.add(new Student("B","Elixir"));
        student.add(new Student("C","Pandora"));
        student.add(new Student("D","Elixir"));
        student.add(new Student("E","Pandora"));
        student.add(new Student("F","Elixir"));
        student.add(new Student("G","Pandora"));
        student.add(new Student("H","Elixir"));
        student.add(new Student("A","Pandora"));
        student.add(new Student("B","Elixir"));
        student.add(new Student("C","Pandora"));
        student.add(new Student("D","Elixir"));
        student.add(new Student("E","Pandora"));
        student.add(new Student("F","Elixir"));
        student.add(new Student("G","Pandora"));
        student.add(new Student("H","Elixir"));
        student.add(new Student("A","Pandora"));
        student.add(new Student("B","Elixir"));
        student.add(new Student("C","Pandora"));
        student.add(new Student("D","Elixir"));
        student.add(new Student("E","Pandora"));
        student.add(new Student("F","Elixir"));
        student.add(new Student("G","Pandora"));
        student.add(new Student("H","Elixir"));


        return  student;
    }
}
