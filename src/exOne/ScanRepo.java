package exOne;

import java.io.File;

public class ScanRepo {
    private File folder = new File("pathExample");
    private File[] listFile = folder.listFiles();

    public void main(String[] args){
        for (File aListFile : listFile) {
            if (aListFile.isFile()) {
                System.out.println("File : " + aListFile.getName());
            }
        }
    }
}
