package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

class WriteImageInFile {
    static void main(){
        Scanner scn = new Scanner(System.in);
        BufferedImage image = null;
        System.out.println("URL of your image : ");
        URL url = null;
        try {
            url = new URL(scn.nextLine());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            assert url != null;
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Path of your image : ");
        String imagePathStr = scn.nextLine();
        String imagePathExtension = imagePathStr.substring(imagePathStr.lastIndexOf('.')+1, imagePathStr.length());
        try {
            assert image != null;
            ImageIO.write(image, imagePathExtension, new File(imagePathStr));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
