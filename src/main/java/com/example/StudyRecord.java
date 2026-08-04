package com.example;

import java.time.LocalDate;

public class StudyRecord {
    private LocalDate studyDate;
    private String subject;
    private int studyMinutes;
    private String memo;
    public StudyRecord(LocalDate studyDate, String subject, int studyMinutes, String memo) {
        this.studyDate = studyDate;
        this.subject = subject;
        this.studyMinutes = studyMinutes;
        this.memo = memo;
    }

}
