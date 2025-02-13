package org.week4.day1.multileveluniversitycoursemanagementsystem;
import java.util.List;
class University {
    public static void manageCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.evaluate();
        }
    }
}