/* Get the Sources from: https://github.com/Gosbow/prog2-ss21-exercise1.git */


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TyrannyRocketEquationTest {
   private TyrannyRocketEquation TyREObj;
   private ByteArrayOutputStream bos;

    @BeforeEach
    public void init() {
        TyREObj = new TyrannyRocketEquation("Task1");
        bos = new ByteArrayOutputStream();

    }

    // Übergebe der Methode eine negative Zahl
    @Test
    @DisplayName("Call Method with negative Numbers")
    void fuelCalculatorTest_MinusParameters(){
    TyREObj.fuelCalculator(-2);
    String expected = "ERROR: Mass is under 0";
    assertEquals(expected,bos.toString());

    }

    // Übergebe der Methode eine Zahlen/Buchstaben Mischung
    @Test
    @DisplayName("Call Method with Numbers/Text Mix")
    void fuelCalculatorTest_Parameters(){


    }
    // Übergebe der Methode einen String
    @Test
    @DisplayName("Call Method a String as Parameter")
    void fuelCalculatorTest_StringParameters(){


    }
    // Übergebe der Methode Null
    @Test
    @DisplayName("Call Method with Null as Parameter")
    void sumofCalcsTest_Sum654PLUS33583(){
        TyREObj.fuelCalculator(1969);
                TyREObj.fuelCalculator(100756);
        Integer actual = TyREObj.getSumofCalcs();
        Integer expected = 34237;
        assertEquals(expected,actual);
    }

    // Überge Wert, der Bufferoverflow erzeugt

    @Test
    @DisplayName("Call Method with Parameter > Range of int")
    void fuelCalculatorTest_intOverflowParameter(){
    //Integer TyREObj.fuelCalculator("156156165156545646");

    }
    // Übergebe mit verschiedenen Werten und Rückgabetypen
    @Test
    @DisplayName("Call Method with Mass of 12")
    void fuelCalculatorTest_TestCaseMass12(){
        Integer actual = TyREObj.fuelCalculator(12);
        Integer expected = 2;
        assertEquals(expected,actual);
    }

}
