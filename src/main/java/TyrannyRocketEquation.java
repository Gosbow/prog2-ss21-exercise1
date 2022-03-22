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
    private Integer fileData;
    List<Integer> loadDatalist = new ArrayList<>();

    public TyrannyRocketEquation(){
        loadFile();
    }

    private void loadFile() {
        try {

            File inputFile = new File("src/test/resources/input.txt");

            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                fileData = scanner.nextInt();
                loadDatalist.add(fileData);
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.err.println("An Error has occured");
            e.printStackTrace();
        }
    }

}
