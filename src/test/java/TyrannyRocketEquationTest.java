/* Get the Sources from: https://github.com/Gosbow/prog2-ss21-exercise1.git */

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TyrannyRocketEquationTest {
    TyrannyRocketEquation TyREObj;

    @BeforeEach
    public void init() {
        TyREObj = new TyrannyRocketEquation();
    }


    // Übergebe der Methode eine negative Zahl
    @Test
    @Description("Call Method with negative Numbers")
    void fuelCalculatorTest_MinusParameters(){
    Integer actual = TyREObj.fuelCalculator(-2);
    String expected = "ERROR: Mass is under 0";
    //assertEquals(expected,actual);

    }

    // Übergebe der Methode eine Zahlen/Buchstaben Mischung
    @Test
    @Description("Call Method with Numbers/Text Mix")
    void fuelCalculatorTest_Parameters(){


    }
    // Übergebe der Methode einen String
    @Test
    @Description("Call Method a String as Parameter")
    void fuelCalculatorTest_StringParameters(){


    }
    // Übergebe der Methode Null
    @Test
    @Description("Call Method with Null as Parameter")
    void sumofCalcsTest_Sum654PLUS33583(){
        TyREObj.fuelCalculator(1969);
                TyREObj.fuelCalculator(100756);
        Integer actual = TyREObj.getSumofCalcs();
        Integer expected = 34237;
        assertEquals(expected,actual);
    }

    // Überge Wert, der Bufferoverflow erzeugt

    @Test
    @Description("Call Method with Parameter > Range of int")
    void fuelCalculatorTest_intOverflowParameter(){


    }
    // Übergebe mit verschiedenen Werten und Rückgabetypen
    @Test
    @Description("Call Method with Mass of 12")
    void fuelCalculatorTest_TestCaseMass12(){
        Integer actual = TyREObj.fuelCalculator(12);
        Integer expected = 2;
        assertEquals(expected,actual);
    }

}
