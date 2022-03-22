import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TyrannyRocketEquationTest {

    @BeforeAll
    static void init(){
        TyrannyRocketEquation TyREObj = new TyrannyRocketEquation();
    }


    // Übergebe der Methode eine negative Zahl
    @Test
    @Description("Call Method with negative Numbers")
    void fuelCalculatorTest_MinusParameters(){


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
    void fuelCalculatorTest_NULLasParameter(){


    }

    // Überge Wert, der Bufferoverflow erzeugt

    @Test
    @Description("Call Method with Parameter > Range of int")
    void fuelCalculatorTest_intOverflowParameter(){


    }
    // Übergebe mit verschiedenen Werten und Rückgabetypen

}
