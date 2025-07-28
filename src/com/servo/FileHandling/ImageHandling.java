package com.servo.FileHandling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandling {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\hp\\OneDrive\\Pictures\\Screenshots\\login_page.png"));
            ImageIO.write(image,"jpg",new File("Mussorie.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
