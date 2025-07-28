package com.servo.FileHandling;

import java.io.*;

public class FileReaders {

    public static void main(String[] args) throws IOException {

        //Create New File

        try {
            File file = new File("new-txt.txt");
            file.createNewFile();
        } catch (Exception ex) {

        }


        try (FileReader fs = new FileReader("note.txt")) {
            int letter;
            while (fs.ready()) {
                letter = fs.read();
                System.out.print((char) letter);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        //Byte to char Stream and then reading that Stream
        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
            System.out.println(br.readLine());
        } catch (Exception ex) {
        }

        try (FileWriter fw = new FileWriter("note.txt", true)) {
            fw.write("Hello Shubham");
        } catch (Exception ex) {
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))) {
            bw.write("Hello Shubh");
        }

    }

}
