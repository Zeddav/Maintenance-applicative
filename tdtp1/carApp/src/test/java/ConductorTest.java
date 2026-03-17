import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConductorTest {


    @Test
    public void should_return_true_when_isAdult_wIth_a_20_years_old() {
        //GIVEN
        Conductor conductor = new Conductor("John", 20);
        //THEN
        assertThat(conductor.isAdult()).isTrue();
    }

    @Test
    public void should_return_false_when_isAdult_with_a_9_years_old() {
        //GIVEN
        Conductor conductor = new Conductor("John", 9);
        //THEN
        assertThat(conductor.isAdult()).isFalse();
    }

}
