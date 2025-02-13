package org.week4.day1.multileveluniversitycoursemanagementsystem;

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated based on assignments.");
    }
}