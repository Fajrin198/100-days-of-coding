package day7;

public class main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.speedUp(10);
        mobil1.speedUp(15);
        mobil1.applyBrakes(5);
        mobil1.printStates();
        System.out.println("");
        
        SepedaMotor motor1 = new SepedaMotor();
        motor1.speedUp(10);
        motor1.speedUp(15);
        motor1.applyBrakes(5);
        motor1.printStates();
    }
}
