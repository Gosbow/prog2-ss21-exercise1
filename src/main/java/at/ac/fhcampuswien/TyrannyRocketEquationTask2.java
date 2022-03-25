package at.ac.fhcampuswien;

import at.ac.fhcampuswien.TyrannyRocketEquation;

public class TyrannyRocketEquationTask2 extends TyrannyRocketEquation {

    private Integer totalResult = 0;
    public TyrannyRocketEquationTask2(){super("Task2");}

    public Integer fuelCalculatorIncrement(Integer mass){
        if(mass == null){
            throw new IllegalArgumentException("Can't calculate Type Null");
        } else if(mass < 0){
            throw new IllegalArgumentException("ERROR: Mass is under 0");
        }
        int temp = mass, result=0;
        while(true) {
            if(temp <= 0){
                break;
            }else {
                temp = super.fuelCalculator(temp);
                if(temp <= 0){
                    break;
                }
            }
            result += temp;
        }
        totalResult += result;
        return result;
    }

    public Integer getTotalResult(){
        return totalResult;
    }
}
