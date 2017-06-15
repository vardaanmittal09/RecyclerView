package com.example.android.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentArrayList;
    RecyclerView recyclerView;
    EditText et_Name,et_Course;
    Button btn_Add;
    studentRecyclerAdapter studentRecyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_layout_student);
        studentArrayList=generateStudent();
        et_Name= (EditText) findViewById(R.id.et_name);
        et_Course=(EditText)findViewById(R.id.et_course);
        btn_Add=(Button)findViewById(R.id.btn_add);
        recyclerView= (RecyclerView) findViewById(R.id.rvList);
        studentRecyclerAdapter =new studentRecyclerAdapter(studentArrayList,this);
        // Define Layout of recyclerview before setAdapter
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //for reverse list
        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true));
        recyclerView.setAdapter(studentRecyclerAdapter);
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addStudent();
            }
        });
    }
    public void addStudent(){
        String name=et_Name.getText().toString().trim();
        String course=et_Course.getText().toString().trim();
        studentArrayList.add(new Student(name,course));
        studentRecyclerAdapter.notifyDataSetChanged();
        et_Name.setText("");
        et_Course.setText("");

    }
    static  ArrayList<Student> generateStudent(){
        ArrayList<Student> student=new ArrayList<>();
        return  student;
    }
}
