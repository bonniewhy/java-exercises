package org.launchcode.java.exercises.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters

    public void setName(String aName) {
        name = aName;
    }

    public void setNumberOfCredits(int nextNumberofCredits) {
        numberOfCredits = nextNumberofCredits;
    }

    public void setGpa(double nextGpa) {
        gpa = nextGpa;
    }

    // Instances

    public void addGrade(int courseCredits, double grade) {

        double existingQualityScore = gpa * numberOfCredits;
        int newNumberOfCredits = numberOfCredits + courseCredits;
        double newQualityScore = courseCredits * grade;
        gpa = (existingQualityScore + newQualityScore) / newNumberOfCredits;
        numberOfCredits = newNumberOfCredits;

    }

    public String getGradeLevel() {

        if (numberOfCredits <= 29) {
            return "Freshman";
        } else if (numberOfCredits <= 59) {
            return "Sohphomore";
        } else if (numberOfCredits <= 89) {
            return "Junior";
        } else if (numberOfCredits <= 90) {
            return "Senior";
        }

    }

    // Special Methods
    @Override
    public String toString() {
        return name + " (" + getGradeLevel() + ", GPA: " + gpa + ")";
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

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
}
