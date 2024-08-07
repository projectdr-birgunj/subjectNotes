package com.project75.ioeallsubjectnotes.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import com.project75.ioeallsubjectnotes.R;
import com.project75.ioeallsubjectnotes.adater.CustomAdapter;
import com.project75.ioeallsubjectnotes.model.Chapter;
import com.project75.ioeallsubjectnotes.model.Topics;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ExpandableListView expandableListView;
CustomAdapter customAdapter;
List<Chapter>chapterList;
List<Topics>topicsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        expandableListView =(ExpandableListView)findViewById(R.id.expandableListview);

        addData();
        //sendData();
    }
    void addData()
    {

        chapterList=new ArrayList<>();
        topicsList=new ArrayList<>();

        // Sem 1
        topicsList.add(new Topics("Engineering Mathematics 1",""));
        topicsList.add(new Topics("Computer Programming",""));
        topicsList.add(new Topics("Engineering Drawing 1",""));
        topicsList.add(new Topics("Engineering Physics",""));
        topicsList.add(new Topics("Applied Mechanics",""));
        topicsList.add(new Topics("Basic Electrical Engineering",""));
        chapterList.add(new Chapter("Semester 1",topicsList));

        // Sem 2
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Engineering Mathematics 2",""));
        topicsList.add(new Topics("Engineering Drawing 2",""));
        topicsList.add(new Topics("Basic Electronics Engineering",""));
        topicsList.add(new Topics("Engineering Chemistry",""));
        topicsList.add(new Topics("F.Thermodynamics & Heat Transfer",""));
        topicsList.add(new Topics("Workshop Technology",""));
        chapterList.add(new Chapter("Semester 2",topicsList));


        // Sem 3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Engineering Mathematics 3","math3sem"));
        topicsList.add(new Topics("Object Oriented Programming","oop3sem"));
        topicsList.add(new Topics("Electric Circuit Theory","edc3sem"));
        topicsList.add(new Topics("Electrical Engineering Material",""));
        topicsList.add(new Topics(" Electronic Device & Circuit"," "));
        topicsList.add(new Topics(" Digital Logic",""));
        topicsList.add(new Topics(" Electromagnetics"," "));
        chapterList.add(new Chapter("Semester 3",topicsList));

        // Sem 4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Applied Mathematics","math4sem"));
        topicsList.add(new Topics("Numerical Method"," "));
        topicsList.add(new Topics("Electrical Machines 1"," "));
        topicsList.add(new Topics("Instrumentation 1"," "));
        topicsList.add(new Topics("Power System Analysis 1"," "));
        topicsList.add(new Topics("Microprocessor"," "));
        chapterList.add(new Chapter("Semester 4",topicsList));

        // Sem 5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Communication English"," "));
        topicsList.add(new Topics("Probability & Statics"," "));
        topicsList.add(new Topics("Electric Machines 2"," "));
        topicsList.add(new Topics("Control System"," "));
        topicsList.add(new Topics("Electric Machine Design"," "));
        topicsList.add(new Topics("Power System Analysis 2"," "));
        topicsList.add(new Topics("Instrumentation 2"," "));
        chapterList.add(new Chapter("Semester 5",topicsList));

        // Sem 6
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Engineering Economics"," "));
        topicsList.add(new Topics("Hydropower"," "));
        topicsList.add(new Topics("Switchgear & Protection"," "));
        topicsList.add(new Topics("Digital Control System"," "));
        topicsList.add(new Topics("Industrial power Distribution"," "));
        topicsList.add(new Topics("Signal Analysis"," "));
        chapterList.add(new Chapter("Semester 6",topicsList));

        // Sem 7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Project Engineering"," "));
        topicsList.add(new Topics("Tech. Environment & Society"," "));
        topicsList.add(new Topics("Organization & Management"," "));
        topicsList.add(new Topics("Power Electronics"," "));
        topicsList.add(new Topics("Utilization of Electrical Energy"," "));
        topicsList.add(new Topics("Power Plant Equipment"," "));
        topicsList.add(new Topics("Project 1"," "));
        topicsList.add(new Topics("Elective 1"," "));
        chapterList.add(new Chapter("Semester 7",topicsList));

        // Sem 8
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Engineering Professional Practice"," "));
        topicsList.add(new Topics("High Voltage Engineering"," "));
        topicsList.add(new Topics("Power Plant Design"," "));
        topicsList.add(new Topics("Transmission & Distribution Design"," "));
        topicsList.add(new Topics("Project 2"," "));
        topicsList.add(new Topics("Elective 2"," "));
        topicsList.add(new Topics("Elective 3"," "));
        chapterList.add(new Chapter("Semester 8",topicsList));
        sendData();






    }
    void sendData()
    {
        customAdapter=new CustomAdapter(chapterList,MainActivity.this);
        expandableListView.setAdapter(customAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

    switch (item.getItemId())
    {
        case R.id.privacy:
        startActivity(new Intent(MainActivity.this,Privacy.class));
        break;
        case R.id.about:
        startActivity(new Intent(MainActivity.this,About.class));
        break;
    }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
        finishAndRemoveTask();
    }
}