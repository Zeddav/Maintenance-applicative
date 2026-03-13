import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Sedan", "Bleu");
    }

    @Test
    public void testAccelerate() {
        car.accelerate();
        assertThat(car.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testSlowDown() {
        car.accelerate();
        car.slowDown();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testStartCar() {
        Conductor conductor = new Conductor("John", 20);
        car.startCar(conductor);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testStopCar() {
        Conductor conductor = new Conductor("John", 20);
        car.stopCar(conductor);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangeSpeed() {
        Conductor conductor = new Conductor("John", 20);

        car.changeSpeed(conductor, 80);
        assertThat(car.getSpeed()).isEqualTo(80);
    }
}
