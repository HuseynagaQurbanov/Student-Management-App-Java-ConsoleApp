package bean;

public class Teacher extends Person {
    private String schoolName;
    private int salary;
    private Student students = null;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSalary() {
        return salary;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
