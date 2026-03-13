import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConductorTest {

    private Conductor conductor;

    @BeforeEach
    public void setUp() {
        conductor = new Conductor("John", 20);
    }

    @Test
    public void testIsAdult() {
        assertThat(conductor.isAdult()).isTrue();
    }

    @Test
    public void testStartCar() {
        Car car = new Car("Sedan", "Bleu");
        conductor.startCar(car);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testStopCar() {
        Car car = new Car("Sedan", "Bleu");
        conductor.stopCar(car);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangeSpeed() {
        Car car = new Car("Sedan", "Bleu");

        conductor.changeSpeed(car, 80);
        assertThat(car.getSpeed()).isEqualTo(80);
    }
}
