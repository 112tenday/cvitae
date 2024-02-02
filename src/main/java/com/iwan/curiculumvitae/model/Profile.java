package com.iwan.curiculumvitae.model;

import java.util.List;

public class Profile {
    private String fullName;
    private int age;
    private String maritalStatus;
    private String university;
    private double universityGPA;
    private String description;
    private String address;
    private String whatsapp;
    private String email;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getWhatsapp() {
        return whatsapp;
    }
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    private List<Experience> experienceList; // tambahkan List<Experience>
    private List<Education> educationList; // tambahkan List<Education>

    public List<Experience> getExperienceList() {
        return experienceList;
    }
    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }
    public List<Education> getEducationList() {
        return educationList;
    }
    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public double getUniversityGPA() {
        return universityGPA;
    }
    public void setUniversityGPA(double universityGPA) {
        this.universityGPA = universityGPA;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
