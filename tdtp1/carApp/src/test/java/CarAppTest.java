import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class CarAppTest {

    @Test
    public void testMain() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));
        Application.main(new String[]{});
        System.setOut(originalOut);
        assertThat(output.toString().trim()).contains("fini");
    }
}
