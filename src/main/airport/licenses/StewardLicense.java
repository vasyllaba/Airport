package main.airport.licenses;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StewardLicense extends License {

    private List<String> courseNames;

    public StewardLicense() {
    }

    public StewardLicense(String passportCode, LocalDateTime issueDate, LocalDateTime endDate, List<String> courseNames) {
        super(passportCode, issueDate, endDate);
        this.courseNames = courseNames;
    }

    public List<String> getCourseNames() {
        return courseNames;
    }

    public void setCourseNames(List<String> courseNames) {
        this.courseNames = courseNames;
    }

    public void addCourse(String courseName) {
        try {
            this.courseNames.add(courseName);
        }
        catch (NullPointerException e){
            this.courseNames = new ArrayList();
            this.courseNames.add(courseName);
        }
    }

    @Override
    public String toString() {
        return "StewardLicense{" +
                "courseNames=" + courseNames + ' ' +
                super.toString() +
                '}';
    }
}
