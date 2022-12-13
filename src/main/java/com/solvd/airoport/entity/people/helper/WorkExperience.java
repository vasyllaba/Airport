package com.solvd.airoport.entity.people.helper;

import org.apache.log4j.Logger;

import java.util.Date;

public class WorkExperience {
    private String jobTitle;
    private Date employmentDate;
    private Date dismissalDate;
    private String workPlace;
    private String industry;

    private static final Logger LOGGER = Logger.getLogger(WorkExperience.class);

    public WorkExperience() {
        LOGGER.debug("create new WorkExperience");
    }

    public WorkExperience(String jobTitle, Date employmentDate, String workPlace, String industry) {
        LOGGER.debug("create new WorkExperience with params: jobTitle " + jobTitle + ", employmentDate " +
                employmentDate + ", workPlace " + workPlace + ", industry " + industry);
        this.jobTitle = jobTitle;
        this.employmentDate = employmentDate;
        this.workPlace = workPlace;
        this.industry = industry;
    }

    public WorkExperience(String jobTitle, Date employmentDate, Date dismissalDate, String workPlace, String industry) {
        LOGGER.debug("create new WorkExperience with params: jobTitle " + jobTitle + ", employmentDate " +
                employmentDate + ", dismissalDate " + dismissalDate + ", workPlace " + workPlace + ", industry " +
                industry);
        this.jobTitle = jobTitle;
        this.employmentDate = employmentDate;
        this.dismissalDate = dismissalDate;
        this.workPlace = workPlace;
        this.industry = industry;
    }

    public String getJobTitle() {
        LOGGER.info("call getJobTitle()");
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        LOGGER.info("call setJobTitle()");
        this.jobTitle = jobTitle;
    }

    public Date getEmploymentDate() {
        LOGGER.info("call getEmploymentDate()");
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        LOGGER.info("call setEmploymentDate()");
        this.employmentDate = employmentDate;
    }

    public Date getDismissalDate() {
        LOGGER.info("call getDismissalDate()");
        return dismissalDate;
    }

    public void setDismissalDate(Date dismissalDate) {
        LOGGER.info("call setDismissalDate()");
        this.dismissalDate = dismissalDate;
    }

    public String getWorkPlace() {
        LOGGER.info("call getWorkPlace()");
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        LOGGER.info("call setWorkPlace()");
        this.workPlace = workPlace;
    }

    public String getIndustry() {
        LOGGER.info("call getIndustry()");
        return industry;
    }

    public void setIndustry(String industry) {
        LOGGER.info("call setIndustry()");
        this.industry = industry;
    }

    @Override
    public String toString() {
        LOGGER.info("call toString()");
        return "WorkExperience{" +
                "jobTitle='" + jobTitle + '\'' +
                ", employmentDate=" + employmentDate +
                ", dismissalDate=" + dismissalDate +
                ", workPlace='" + workPlace + '\'' +
                ", industry='" + industry + '\'' +
                '}';
    }
}
