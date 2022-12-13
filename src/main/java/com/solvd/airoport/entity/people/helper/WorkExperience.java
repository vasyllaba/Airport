package com.solvd.airoport.entity.people.helper;

import java.util.Date;

public class WorkExperience {
    private String jobTitle;
    private Date employmentDate;
    private Date dismissalDate;
    private String workPlace;
    private String industry;

    public WorkExperience() {
    }

    public WorkExperience(String jobTitle, Date employmentDate, String workPlace, String industry) {
        this.jobTitle = jobTitle;
        this.employmentDate = employmentDate;
        this.workPlace = workPlace;
        this.industry = industry;
    }

    public WorkExperience(String jobTitle, Date employmentDate, Date dismissalDate, String workPlace, String industry) {
        this.jobTitle = jobTitle;
        this.employmentDate = employmentDate;
        this.dismissalDate = dismissalDate;
        this.workPlace = workPlace;
        this.industry = industry;
    }

    public String getJonTitle() {
        return jobTitle;
    }

    public void setJonTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Date getDismissalDate() {
        return dismissalDate;
    }

    public void setDismissalDate(Date dismissalDate) {
        this.dismissalDate = dismissalDate;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
