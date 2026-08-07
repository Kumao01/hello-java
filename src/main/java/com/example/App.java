package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {   
        List<StudyRecord> records = new ArrayList<>();
        Map<String, Integer> studyTimes = new HashMap<>();  

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

        for(StudyRecord record : records){
            String subject = record.getSubject();
            int minutes = record.getStudyMinutes();

            if (! studyTimes.containsKey(subject)) {
                studyTimes.put(subject, minutes);
            } else {
                studyTimes.put(subject, studyTimes.get(subject) + minutes);
            }
        }

        for(String subject : studyTimes.keySet()) {
            System.out.println(subject + " " + studyTimes.get(subject) + "分");
        }

        records.stream()
            .filter(record -> record.getSubject().equals("Java"))
            .forEach(record -> System.out.println(
                record.getSubject() + " : " + record.getStudyMinutes() + "分")
            );

        String inputMinutes = "60";

        try {
            int minutes = Integer.parseInt(inputMinutes);
            System.out.println("学習時間：" + minutes + "分");
        } catch (NumberFormatException e) {
            System.out.println("学習時間は数字で入力してください");
        }
    }
}