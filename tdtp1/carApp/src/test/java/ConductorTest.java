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

}
