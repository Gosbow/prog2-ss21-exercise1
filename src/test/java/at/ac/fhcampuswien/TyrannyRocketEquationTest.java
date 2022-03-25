package at.ac.fhcampuswien;/* Get the Sources from: https://github.com/Gosbow/prog2-ss21-exercise1.git */


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TyrannyRocketEquationTest {
   private TyrannyRocketEquation TyREObj;


    @BeforeEach
    public void init() {
        TyREObj = new TyrannyRocketEquation("Task1");
    }

    // Übergebe der Methode eine negative Zahl
    @Test
    @DisplayName("Call Method with negative Numbers")
    void fuelCalculatorTest_MinusParameters(){
    assertThrows(IllegalArgumentException.class, () -> {TyREObj.fuelCalculator(-2);}, "ERROR: Mass is under 0");

    }

    @Test
    @DisplayName("Call Method with Null as Parameter")
    void fuelcalculatorTest_NullParam(){

        assertThrows(IllegalArgumentException.class, () -> {
            TyREObj.fuelCalculator(null);
        });
    }

    // Übergebe der Methode Null
    @Test
    @DisplayName("Call Method and Test the global Variable.")
    void sumofCalcsTest_Sum654PLUS33583(){
        TyREObj.fuelCalculator(1969);
                TyREObj.fuelCalculator(100756);
        Integer actual = TyREObj.getSumofCalcs();
        Integer expected = 34237;
        assertEquals(expected,actual);
    }

    // Übergebe mit verschiedenen Werten und Rückgabetypen
    @Test
    @DisplayName("Call Method with Mass of 12")
    void fuelCalculatorTest_TestCaseMass12(){
        Integer actual = TyREObj.fuelCalculator(12);
        Integer expected = 2;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Call Method with Mass of 14")
    void fuelCalculatorTest_TestCaseMass14(){
        Integer actual = TyREObj.fuelCalculator(14);
        Integer expected = 2;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Testing the whole List")
    void fuelCalculatorTest_TestCaseList(){
        List<Integer> TestList = new ArrayList<Integer>();
        for(int i = 0; i < TyREObj.getFile().size(); i++){
            TestList.add(TyREObj.getFile().get(i));
        }
        for(int i = 0; i < TestList.size(); i ++){
            TyREObj.fuelCalculator(TestList.get(i));
        }
        Integer actual = TyREObj.getSumofCalcs();
        Integer expected = 3429947;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing Fileload with File not found")
    void loadFileTestWrongPath(){
        assertThrows(FileNotFoundException.class, () -> {
            TyREObj.loadFile("/home/roman/test.txt");
        });
    }

}
