public class TyrannyRocketEquationTask2 extends TyrannyRocketEquation{

    private Integer totalResult = 0;
    public TyrannyRocketEquationTask2(){super("Task2");}

    public Integer fuelCalculatorIncrement(Integer mass){
        int temp = mass, result=0;
        if(mass == null){
            System.err.println("Can't calculate Type Null");
        } else if(mass < 0){
            System.err.println("ERROR: Mass is under 0");
        } else if(mass > Integer.MAX_VALUE)
        {
            System.err.println("Over Integer maximum");
        }
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
