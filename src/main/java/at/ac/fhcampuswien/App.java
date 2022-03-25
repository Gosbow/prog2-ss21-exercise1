package at.ac.fhcampuswien;

public class App {

    public static void main(String[] args){
        TyrannyRocketEquation Task1 = new TyrannyRocketEquation("Task1");

        for(int i = 0; i < Task1.getFile().size(); i++){
            Task1.fuelCalculator(Task1.getFile().get(i));
        }
        System.out.println("Result for Task1: " + Task1.getSumofCalcs());


        // TASK 2
        TyrannyRocketEquationTask2 Task2 = new TyrannyRocketEquationTask2();

        for(int i = 0; i < Task2.getFile().size(); i++) {
            Task2.fuelCalculatorIncrement(Task2.getFile().get(i));
        }
        System.out.println("Result for Task2: " + Task2.getTotalResult());

    }
}
