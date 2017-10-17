package lastex;

import lastex.domain.*;
import lastex.service.Personnel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVfileMethod {
    private static final int JOB = 0;
    private static final int FIRSTNAME = 1;
    private static final int LASTNAME = 2;
    private static final int AGE = 3;
    private static final int ENTRYYEAR = 4;
    private static final int UNITY = 5;

    public static void readCSV(String path){
        BufferedReader fileReader = null;
        List employees = new ArrayList();
        String line = "";
        try {
            fileReader = new BufferedReader(new FileReader(path));
            fileReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert fileReader != null;
            while ((line = fileReader.readLine()) != null){
                String[] attributs = line.split(",");
                Employee employe = null;
                if (attributs.length > 0){
                    switch (attributs[JOB]){
                        case "Vendeur":
                            employe = new Vendeur(attributs[FIRSTNAME], attributs[LASTNAME], Integer.parseInt(attributs[AGE]), attributs[ENTRYYEAR], Double.parseDouble(attributs[UNITY]));
                            break;
                        case "Representant":
                            employe = new Representant(attributs[FIRSTNAME], attributs[LASTNAME], Integer.parseInt(attributs[AGE]), attributs[ENTRYYEAR], Double.parseDouble(attributs[UNITY]));
                            break;
                        case "Technicien":
                            employe = new Technicien(attributs[FIRSTNAME], attributs[LASTNAME], Integer.parseInt(attributs[AGE]), attributs[ENTRYYEAR], Double.parseDouble(attributs[UNITY]));
                            break;
                        case "Manutentionnaire":
                            employe = new Manutentionnaire(attributs[FIRSTNAME], attributs[LASTNAME], Integer.parseInt(attributs[AGE]), attributs[ENTRYYEAR], Double.parseDouble(attributs[UNITY]));
                            break;
                        case "TechnARisque":
                            employe = new TechnARisque(attributs[FIRSTNAME], attributs[LASTNAME], Integer.parseInt(attributs[AGE]), attributs[ENTRYYEAR], Double.parseDouble(attributs[UNITY]));
                            break;
                        case "ManutARisque":
                            employe = new ManutARisque(attributs[FIRSTNAME], attributs[LASTNAME], Integer.parseInt(attributs[AGE]), attributs[ENTRYYEAR], Double.parseDouble(attributs[UNITY]));
                            break;
                    }
                    employees.add(employe);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
