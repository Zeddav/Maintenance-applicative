public class Application {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Conductor me = new Conductor("John", 20);

        myCar.startCar(me);
        myCar.accelerate();
        myCar.changeSpeed(me, 80);
        myCar.slowDown();
        myCar.changeSpeed(me,30);
        myCar.stopCar(me);
        System.out.println("fini");
    }
}
