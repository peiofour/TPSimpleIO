package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WriteFile {

    static void main(){
        Scanner scn = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        String line = "";
        while (!Objects.equals(line.toLowerCase(), "quit")){
            System.out.println("Write a line (write 'quit' to end) : ");
            line = scn.nextLine();
            lines.add(line);
        }
        lines.remove(lines.size()-1);
        System.out.println("Path of the file : ");
        Path file = Paths.get(scn.nextLine());
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
