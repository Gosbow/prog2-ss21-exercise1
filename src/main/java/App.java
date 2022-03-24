public class App {

    public static void main(String[] args){
        TyrannyRocketEquation calc = new TyrannyRocketEquation();

        for(int i = 0; i < calc.getFile().size(); i++){
            calc.fuelCalculator(calc.getFile().get(i));
        }
        System.out.println("Ergebnis: " + calc.getSumofCalcs());

    }
}
