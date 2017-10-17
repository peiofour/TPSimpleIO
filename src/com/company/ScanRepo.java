package com.company;
//Exercice 1
import java.io.File;
import java.util.Scanner;

class ScanRepo {

    static void main(){

        File[] filesList = getListFiles();
        for (File aListFile : filesList) {
            if (aListFile.isFile()) {
                System.out.println("File : " + aListFile.getName());
            }
        }
    }

    private static File[] getListFiles(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose a repository : ");
        String folderName = scn.nextLine();
        File folder = new File(folderName);
        File[] filesList = folder.listFiles();
        assert filesList != null;

        return filesList;
    };
}
