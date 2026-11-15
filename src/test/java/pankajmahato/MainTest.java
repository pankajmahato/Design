package pankajmahato;

import com.pankajmahato.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private static final String EXPECTED_OUTPUT = String.join(System.lineSeparator(),
            "Hello and welcome!i = 1",
            "i = 2",
            "i = 3",
            "i = 4",
            "i = 5",
            "");

    @Test
    void printsGreetingAndNumbersOneThroughFive() {
        assertEquals(EXPECTED_OUTPUT, captureOutput(new String[0]));
    }

    @Test
    void commandLineArgumentsDoNotChangeOutput() {
        assertEquals(EXPECTED_OUTPUT, captureOutput(new String[]{"hello", "42"}));
    }

    private String captureOutput(String[] args) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try (PrintStream capturedOut = new PrintStream(output, true, StandardCharsets.UTF_8)) {
            System.setOut(capturedOut);
            Main.main(args);
        } finally {
            System.setOut(originalOut);
        }
        return output.toString(StandardCharsets.UTF_8);
    }
}
