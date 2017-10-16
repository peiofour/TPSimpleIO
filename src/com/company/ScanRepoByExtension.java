package com.company;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.Scanner;

//Exercice 2
public class ScanRepoByExtension{

    public static void main(String[] args){

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
        System.out.println("Choose an extension : ");
        String extension = scn.nextLine();

        File folder = new File(folderName);
        FilenameFilter filenameFilter = (dir, name) -> {
            if(name.lastIndexOf('.')>0) {
                int lastIndex = name.lastIndexOf('.');
                String str = name.substring(lastIndex);
                if(str.equals("." + extension)) {
                    return true;
                }
            }
            return false;
        };
        File[] filesList = folder.listFiles(filenameFilter);
        assert filesList != null;
        return filesList;
    }
}
