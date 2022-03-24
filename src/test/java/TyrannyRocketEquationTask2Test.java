import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TyrannyRocketEquationTask2Test {
    TyrannyRocketEquationTask2 TyREObj2;

    @BeforeEach
    public void init() {
        TyREObj2 = new TyrannyRocketEquationTask2();
    }


    // Übergebe der Methode eine negative Zahl
    @Test
    @Description("Call Method with negative Numbers")
    void fuelCalculatorTest_MinusParameters(){
        Integer actual = TyREObj2.fuelCalculator(-2);
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
        TyREObj2.fuelCalculator(1969);
        TyREObj2.fuelCalculator(100756);
        Integer actual = TyREObj2.getSumofCalcs();
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
        Integer actual = TyREObj2.fuelCalculator(12);
        Integer expected = 2;
        assertEquals(expected,actual);
    }

}
