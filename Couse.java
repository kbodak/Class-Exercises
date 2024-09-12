package edu.cs.haverford.co6.inclass;

public class Course {

    private static semester = "Spring 2026";
    private String professor;
    private int courseNum;
    private int courseTime;
    private int courseSize;

    public Course(String professor, int courseNum, int courseTime, int courseSize) {
        this.professor = professor;
        this.courseNum = courseNum;
        this.courseTime = courseTime;
        this.courseSize = courseSize;

    }

    public String getProfessor() {
        this.professor = professor;
    }

}


@Override
public String toString() {
    String str = CSCourse.department +
                    "course";
    return str;
}
