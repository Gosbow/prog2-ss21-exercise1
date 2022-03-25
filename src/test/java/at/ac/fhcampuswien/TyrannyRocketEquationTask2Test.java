/* Get the Sources from: https://github.com/Gosbow/prog2-ss21-exercise1.git */
package at.ac.fhcampuswien;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TyrannyRocketEquationTask2Test {
    TyrannyRocketEquationTask2 TyREObj2;

    @BeforeEach
    public void init() {
        TyREObj2 = new TyrannyRocketEquationTask2();
    }


    // Übergebe der Methode eine negative Zahl
    @Test
    @DisplayName("Call Method with negative Numbers")
    void fuelCalculatorIncrementTest_MinusParameters(){

        assertThrows(IllegalArgumentException.class, () -> {TyREObj2.fuelCalculatorIncrement(-1);}, "ERROR: Mass is under 0");
    }

    @Test
    @DisplayName("Call Method with Null as Parameter")
    void fuelcalculatorIncrementTest_NullParam(){
        assertThrows(IllegalArgumentException.class, () -> {
            TyREObj2.fuelCalculatorIncrement(null);
        });
    }

    @Test
    @DisplayName("Call Method with Sum of 100756+1969")
    void getTotalResultTest_Sum100756PLUS1969(){
        TyREObj2.fuelCalculatorIncrement(100756);
        TyREObj2.fuelCalculatorIncrement(1969);
        Integer actual = TyREObj2.getTotalResult();
        Integer expected = 51312;
        assertEquals(expected,actual);
    }


    // Übergebe mit verschiedenen Werten und Rückgabetypen
    @Test
    @DisplayName("Call Method with Mass of 1969")
    void fuelCalculatorIncrementTest_TestCaseMass1969(){
        Integer actual = TyREObj2.fuelCalculatorIncrement(1969);
        Integer expected = 966;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Call Method with Mass of 100756")
    void fuelCalculatorIncrementTest_TestCalc100756(){
        Integer actual = TyREObj2.fuelCalculatorIncrement(100756);
        Integer expected = 50346;
        assertEquals(expected, actual);
    }

}
