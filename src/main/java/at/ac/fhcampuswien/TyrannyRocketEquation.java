package at.ac.fhcampuswien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TyrannyRocketEquation {
    List<Integer> loadDatalist = new ArrayList<>();
    private Integer sumofCalcs;

    public TyrannyRocketEquation(){};
    public TyrannyRocketEquation(String inputFile){
        if(inputFile.equals("Task1")) {
            try {
                loadFile("src/test/resources/input-task1.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if(inputFile.equals("Task2")){
            try {
                loadFile("src/test/resources/input-task2.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        sumofCalcs = 0;
    }

    protected void loadFile(String Filename) throws FileNotFoundException {

            File inputFile = new File(Filename);

            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                Integer fileData = scanner.nextInt();
                loadDatalist.add(fileData);
            }
            scanner.close();

    }

    public List<Integer> getFile(){
        return loadDatalist;
    }

    public Integer fuelCalculator(Integer mass){
        int calc;
        if(mass == null){
            throw new IllegalArgumentException("Can't calculate Type Null");

        } else if(mass < 0){
            throw new IllegalArgumentException("ERROR: Mass is under 0");
        }
            calc = (mass / 3) - 2;
            sumofCalcs += calc;
            return calc;
    }
    public Integer getSumofCalcs(){
        return sumofCalcs;
    }
}
