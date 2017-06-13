package com.codingblocks.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Student> studentArrayList = null;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentArrayList  = generateStudents();
        listView = (ListView) findViewById(R.id.lvStudent);

        listView.setAdapter(new StudentAdapter(studentArrayList,this));



    }


    public static ArrayList<Student> generateStudents(){
        ArrayList<Student> newStudents = new ArrayList<>();

        newStudents.add(new Student("A","Pandora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Pandora"));
        newStudents.add(new Student("F","Launchpad"));
        newStudents.add(new Student("G","Elixir"));
        newStudents.add(new Student("H","Pandora"));
        newStudents.add(new Student("I","Pandora"));
        newStudents.add(new Student("A","Pandora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Pandora"));
        newStudents.add(new Student("F","Launchpad"));
        newStudents.add(new Student("G","Elixir"));
        newStudents.add(new Student("H","Pandora"));
        newStudents.add(new Student("I","Pandora"));
        newStudents.add(new Student("A","Pandora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Pandora"));
        newStudents.add(new Student("F","Launchpad"));
        newStudents.add(new Student("G","Elixir"));
        newStudents.add(new Student("H","Pandora"));
        newStudents.add(new Student("I","Pandora"));
        newStudents.add(new Student("A","Pandora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Pandora"));
        newStudents.add(new Student("F","Launchpad"));
        newStudents.add(new Student("G","Elixir"));
        newStudents.add(new Student("H","Pandora"));
        newStudents.add(new Student("I","Pandora"));
        newStudents.add(new Student("A","Pandora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Pandora"));
        newStudents.add(new Student("F","Launchpad"));
        newStudents.add(new Student("G","Elixir"));
        newStudents.add(new Student("H","Pandora"));
        newStudents.add(new Student("I","Pandora"));
        newStudents.add(new Student("A","Pandora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Pandora"));
        newStudents.add(new Student("F","Launchpad"));
        newStudents.add(new Student("G","Elixir"));
        newStudents.add(new Student("H","Pandora"));
        newStudents.add(new Student("I","Pandora"));
        newStudents.add(new Student("A","Pandora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Pandora"));
        newStudents.add(new Student("F","Launchpad"));
        newStudents.add(new Student("G","Elixir"));
        newStudents.add(new Student("H","Pandora"));
        newStudents.add(new Student("I","Pandora"));


        return newStudents;

    }

}
