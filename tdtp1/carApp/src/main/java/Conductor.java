public class Conductor {
    private String name;
    private int age;

    public Conductor(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return age >= 10;
    }

    public void startCar(Car car) {
        if (isAdult()) {
            System.out.println(name + " start the car.");
        } else {
            System.out.println("The driver is not old enough to drive.");
        }
    }

    public void stopCar(Car car) {
        System.out.println(name + " stop the car.");
    }

    public void changeSpeed(Car car, int newSpeed) {
        System.out.println(name + " change car speed to " + newSpeed);
        int curentSpeed;
        if (car.getSpeed() >= newSpeed) {
            while (car.getSpeed() > newSpeed) {
                car.slowDown();
            }
        } else  {
            while (car.getSpeed() < newSpeed) {
                car.accelerate();
            }
        }
    }
}
