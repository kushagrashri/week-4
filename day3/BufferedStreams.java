package org.week4.day3;

import java.io.*;

public class BufferedStreams {
    public static void main(String[] args) {
        String sourceFile = "largefile.txt";
        String destinationFileBuffered = "copy_buffered.txt";
        String destinationFileUnbuffered = "copy_unbuffered.txt";

        long bufferedTime = copyWithBufferedStreams(sourceFile, destinationFileBuffered);
        long unbufferedTime = copyWithUnbufferedStreams(sourceFile, destinationFileUnbuffered);

        System.out.println("Buffered Streams Time: " + bufferedTime + " nanoseconds");
        System.out.println("Unbuffered Streams Time: " + unbufferedTime + " nanoseconds");
    }

    private static long copyWithBufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error copying file with buffered streams: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }

    private static long copyWithUnbufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            System.out.println("Error copying file with unbuffered streams: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}

