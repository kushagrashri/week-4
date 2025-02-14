package org.week4.day3;

import java.io.*;

public class DataStreamsStudent {
    private static final String FILE_NAME = "student_data.bin";

    public static void main(String[] args) {
        // Writing student data to binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            dos.writeInt(101);
            dos.writeUTF("sachin");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("duggu");
            dos.writeDouble(3.5);

            System.out.println("Student data stored successfully.");
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }

        // Reading student data from binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }
}
