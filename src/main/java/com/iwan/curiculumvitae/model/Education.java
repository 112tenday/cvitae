package com.iwan.curiculumvitae.model;

import java.time.LocalDate;

public class Education {
    private String degree;
    private String school;
    private LocalDate startDate;
    private LocalDate endDate;
    private double gpa;

    public Education(String degree, String school, LocalDate startDate, LocalDate endDate, double gpa) {
        this.degree = degree;
        this.school = school;
        this.startDate = startDate;
        this.endDate = endDate;
        this.gpa = gpa;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
