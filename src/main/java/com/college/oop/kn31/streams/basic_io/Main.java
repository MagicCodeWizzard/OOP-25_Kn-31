package com.college.oop.kn31.streams.basic_io;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        InputStream stream = new BufferedInputStream(System.in);
//
//        int bytes_read = 0;
//
//        while (bytes_read < 30) {
//            byte[] read_data = new byte[100];
//
//            bytes_read += stream.read(read_data);
//
//            System.out.println("Bytes read: " + bytes_read + " -> " + Arrays.toString(read_data));
//        }
//        stream.close();

        OutputStream os = new BufferedOutputStream(System.out);
        os.write(67);

        byte[] output = new byte[]{34, 67, 49, 50, 51};
        os.write(output);

        String myString = "\nHello world!!!!";
        System.out.println("In bytes -> " + Arrays.toString(myString.getBytes()));
        os.write(myString.getBytes());

        os.close();
    }
}
