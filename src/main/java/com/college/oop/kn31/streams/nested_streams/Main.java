package com.college.oop.kn31.streams.nested_streams;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        try(FileWriter wr = new FileWriter("my.file.txt");
            BufferedWriter bos = new BufferedWriter(wr);
            PrintWriter writer = new PrintWriter(bos)
        ) {
            writer.println("Hello world!");
            writer.printf("Group size is %d", 17);
        } catch (IOException e) {
            System.out.println("Error occured -> " + e);
        }

        try(FileOutputStream fos = new FileOutputStream("my.file1.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            BufferedOutputStream bos1 = new BufferedOutputStream(bos)
        ) {
            byte[] array = new byte[] { 35, 49, 101, 127, 21, 0 };
            byte[] array1 = new byte[] { 0, 0, 37, 21, 50, 0 };

            bos.write(array);
            bos.write(array1);

            bos.flush();


        } catch (IOException e) {
            System.out.println("Error occured -> " + e);
        }
    }
}
