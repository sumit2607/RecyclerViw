package com.sumit.recyclerviw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Student> StudentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();;
        buildStudentList();
        setRecyclerVIewAdaptar();
    }

    private void setRecyclerVIewAdaptar() {
        StudentAdapter studentAdapter = new StudentAdapter(StudentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void buildStudentList() {
        Student student1 = new Student("sumit", 21, "epm1");
        StudentList.add(student1);
        for(int i =0; i<14 ; i++){
            Student student = new Student("xyz" + i,25 , "emp2");
            StudentList.add(student);
        }
    }

    private  void initView(){
     recyclerView = findViewById(R.id.recyclerView);
 }
}