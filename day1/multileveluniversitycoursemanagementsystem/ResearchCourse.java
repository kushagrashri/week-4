package org.week4.day1.multileveluniversitycoursemanagementsystem;

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated based on research work.");
    }
}