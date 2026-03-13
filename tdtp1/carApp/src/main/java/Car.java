public class Car {
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeed(final int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (speed + 10 <= 120) {
            speed += 10;
            // afficher détails
            System.out.println("Model : " + model);
            System.out.println("Color : " + color);
            System.out.println("Current speed : " + speed);
        } else {
            System.out.println("Maximal speed already reached");
        }
    }

    public void slowDown() {
        if (speed - 10 >= 0) {
            speed -= 10;
            // show details
            System.out.println("Model : " + model);
            System.out.println("Color : " + color);
            System.out.println("Current speed : " + speed);
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    public void startCar(Conductor conductor) {
        if (conductor.isAdult()) {
            System.out.println(conductor.name + " start the car.");
        } else {
            System.out.println("The driver is not old enough to drive.");
        }
    }

    public void stopCar(Conductor conductor) {
        System.out.println(conductor.name + " stop the car.");
    }

    public void changeSpeed(Conductor conductor, int newSpeed) {
        System.out.println(conductor.name + " change car speed to " + newSpeed);
        int curentSpeed;
        if (getSpeed() >= newSpeed) {
            while (getSpeed() > newSpeed) {
                slowDown();
            }
        } else  {
            while (getSpeed() < newSpeed) {
                accelerate();
            }
        }
    }
}

