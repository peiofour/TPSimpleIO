package com.company;
//Exercice 3

import java.io.File;
import java.util.Scanner;

public class CheckPath {

    static void main(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose a path : ");
        String pathString = scn.nextLine();
        File path = new File(pathString);
        if (path.exists()){
            if (path.isFile()){
                System.out.println("The selected path is a file");
            }
            else{
                System.out.println("The selected path is a folder");
            }
        }
        else {
            System.out.println("The selected path is wrong");
        }

    }
}
