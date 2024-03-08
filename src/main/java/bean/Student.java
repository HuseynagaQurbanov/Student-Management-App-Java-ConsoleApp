package bean;

import java.io.Serializable;

public class Student extends Person {
    private String schoolName;
    private double scholarship;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }
    
    
}
