package org.launchcode.java.exercises.school;

public class Course {
    private static int nextCourseId = 1;
    private String courseTitle;
    private final int courseId;
    private String courseDescription;
    private HashMap<String, int> studentsEnrolled;

    public Course(String courseTitle, int CourseId, String courseDescription, int courseId, HashMap<String, int> studentsEnrolled) {
        this.courseTitle = courseTitle;
        this.courseId = courseId;
        this.courseDescription = courseDescription;
        this.studentsEnrolled = studentsEnrolled;
    }

    public Course(String courseTitle) {
        this(courseTitle, nextCourseId);
        nextCourseId++;
    }

    // Default Constructor
    public Course() {

    }

    // Getters
    public String getCourseTitle() {
        return courseTitle;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public HashMap<String, int> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    // Setters
    public void setCourseTitle(String aCourseTitle) {
        courseTitle = aCourseTitle;
    }

    public void setCourseDescription(String aCourseDescription) {
        courseDescription = aCourseDescription;
    }

    public void setStudentsEnrolled(HashMap<> newStudentsEnrolled) {
        studentsEnrolled = newStudentsEnrolled;
    }

    // Special Methods
    @Override
    public String toString() {
        return "Course Name: " + courseTitle + ", Course Description: " + courseDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) o;
        return theCourse.getCourseId() == getCourseId();
    }


}
