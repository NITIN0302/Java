package com.servo.FileHandling;

import java.io.*;

public class FileCopying {

    public static void main(String[] args) throws IOException {
        File in = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Nitin_Srivastva.pdf");
        File out = new File("newPdf.pdf");

        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream(in);
            fout = new FileOutputStream(out);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        int i = 0;
        try {
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fin != null) {
                fin.close();
            }
            if (fout != null) {
                fout.close();
            }
        }

    }

}
