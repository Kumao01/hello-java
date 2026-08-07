package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {   
        List<StudyRecord> records = new ArrayList<>();
        StudyRecord record1 = new StudyRecord(
            LocalDate.of(2026, 8, 7), 
            "Java", 
            60, 
            "Listを復習"
        );
        StudyRecord record2 = new StudyRecord(
            LocalDate.of(2026, 8, 7),
            "Git",
            30,
            "Gitを復習"
        );
        records.add(record1);
        records.add(record2);

        for(int i = 0; i < records.size(); i++){
            System.out.println(records.get(i).getSubject() + " " + records.get(i).getStudyMinutes() + "分");
        }
    }
}