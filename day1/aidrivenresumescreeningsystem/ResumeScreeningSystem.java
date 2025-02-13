package org.week4.day1.aidrivenresumescreeningsystem;
import java.util.ArrayList;
import java.util.List;
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        List<JobRole> applicants = new ArrayList<>();
        applicants.add(new SoftwareEngineer("Nirupam", 3));
        applicants.add(new DataScientist("pandit", 2));
        applicants.add(new ProductManager("Duggu", 6));

        ScreeningPipeline.processResumes(applicants);
    }
}
