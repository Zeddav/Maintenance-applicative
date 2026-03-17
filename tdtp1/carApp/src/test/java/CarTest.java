import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void set_up() {
        car = new Car("Sedan", "Bleu");
    }

    @Test
    public void should_return_10_when_accelerate_from_10() {
        //WHEN
        car.accelerate();
        //THEN
        assertThat(car.getSpeed()).isEqualTo(10);
    }

    @Test
    public void should_return_error_message_when_accelerate_too_much() {
        //GIVEN
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));
        //WHEN
        car.setSpeed(120);
        car.accelerate();

        System.setOut(originalOut);
        //THEN
        assertThat(output.toString().trim()).isEqualTo("Maximal speed already reached.");
    }

    @Test
    public void should_return_0_when_slow_down_from_10() {
        //WHEN
        car.accelerate();
        car.slowDown();
        //THEN
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void should_return_error_message_when_slow_down_too_much() {
        //GIVEN
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));
        //WHEN
        car.setSpeed(0);
        car.slowDown();

        System.setOut(originalOut);
        //THEN
        assertThat(output.toString().trim()).isEqualTo("Car is already stopped.");
    }

    @Test
    public void should_return_message_that_driver_started_the_car_when_driver_is_adult() {
        //GIVEN
        Conductor conductor = new Conductor("John", 20);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));
        //WHEN
        car.startCar(conductor);
        System.setOut(originalOut);
        //THEN
        assertThat(output.toString().trim()).isEqualTo("John start the car.");
    }

    @Test
    public void should_return_message_saying_too_young_to_drive_when_driver_is_9_yo() {
        //GIVEN
        Conductor conductor = new Conductor("John", 9);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));
        //WHEN
        car.startCar(conductor);
        System.setOut(originalOut);
        //THEN
        assertThat(output.toString().trim()).isEqualTo("The driver is not old enough to drive.");
    }

    @Test
    public void should_return_message_that_he_stopped_the_car_when_driver_stopped_the_car() {
        //GIVEN
        Conductor conductor = new Conductor("John", 20);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        //WHEN
        car.stopCar(conductor);
        System.setOut(originalOut);

        //THEN
        assertThat(output.toString().trim()).isEqualTo("John stop the car.");
    }

    @Test
    public void shouldReturn80WhenDriverChangeSpeedAcceleratingTo80() {
        //GIVEN
        Conductor conductor = new Conductor("John", 20);
        //WEHN
        car.changeSpeed(conductor, 80);
        //THEN
        assertThat(car.getSpeed()).isEqualTo(80);
    }

    @Test
    public void shouldReturn10WhenDriverChangeSpeedSlowDownFrom20() {
        //GIVEN
        Conductor conductor = new Conductor("John", 20);
        //WHEN
        car.accelerate();
        car.accelerate();
        car.changeSpeed(conductor, 10);
        //THEN
        assertThat(car.getSpeed()).isEqualTo(10);
    }
}
