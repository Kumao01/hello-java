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
    public LocalDate getStudyDate() {
        return studyDate;
    }
    public String getSubject() {
        return subject;
    }
    public int getStudyMinutes() {
        return studyMinutes;
    }
    public String getMemo() {
        return memo;
    }
    public void setStudyDate(LocalDate studyDate) {
        this.studyDate = studyDate;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setStudyMinutes(int studyMinutes) {
        this.studyMinutes = studyMinutes;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
}
