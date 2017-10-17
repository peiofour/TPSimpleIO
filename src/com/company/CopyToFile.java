package com.company;
//Exercice 6

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

class CopyToFile {
    static void main(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Select file to copy : ");
        Path fileToCopy = Paths.get(scn.nextLine());
        System.out.println("Select file to paste : ");
        Path fileToPaste = Paths.get(scn.nextLine());

        try {
            List<String> fileToCopyContent = Files.readAllLines(fileToCopy);
            Files.write(fileToPaste, fileToCopyContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
