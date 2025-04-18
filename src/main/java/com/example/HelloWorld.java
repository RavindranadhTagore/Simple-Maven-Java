
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldTest {

    @Test
    public void testMainMethodRuns() {
        // Just a dummy test to verify HelloWorld runs
        HelloWorld.main(new String[]{});
        assertTrue(true); // if no exception is thrown, we consider it passed
    }
}
