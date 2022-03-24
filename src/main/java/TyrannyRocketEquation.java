import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TyrannyRocketEquation {
    //File (Ressource) reinlesen und in Array speichern (über Constructor)
    // Calculator schreiben
    // Calculator in einer Methode in einer Schleife ausführen und Werte übergeben.
    // private Variable zum Addieren speichern.
    List<Integer> loadDatalist = new ArrayList<>();
    Integer sumofCalcs;

    public TyrannyRocketEquation(){
        loadFile();
        sumofCalcs = 0;
    }

    private void loadFile() {
        try {

            File inputFile = new File("src/test/resources/input-task1.txt");

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
        }
            calc = (mass / 3) - 2;
            sumofCalcs += calc;
            return calc;

    }
    public Integer getSumofCalcs(){
        return sumofCalcs;
    }
}
