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
            loadFile("src/test/resources/input-task1.txt");
        } else if(inputFile.equals("Task2")){
            loadFile("src/test/resources/input-task2.txt");
        }
        sumofCalcs = 0;
    }

    private void loadFile(String Filename) {
        try {

            File inputFile = new File(Filename);

            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                Integer fileData = scanner.nextInt();
                loadDatalist.add(fileData);
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.err.println("An Error has occured");
            e.printStackTrace();
        }
    }

    public List<Integer> getFile(){
        return loadDatalist;
    }

    public Integer fuelCalculator(Integer mass){
        int calc;
        if(mass == null){
            System.err.println("Can't calculate Type Null");
        } else if(mass < 0){
            System.err.println("ERROR: Mass is under 0");
            //System.err.println("ERROR: Mass is under 0");
        } else if(mass > Integer.MAX_VALUE)
        {
            System.err.println("Over Integer maximum");
        }
            calc = (mass / 3) - 2;
            sumofCalcs += calc;
            return calc;

    }
    public Integer getSumofCalcs(){
        return sumofCalcs;
    }
}
