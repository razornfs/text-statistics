package jo.language_detectors;

import jo.language_detectors.APIDetector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class APIDetectorTest {

    private static String APIKey = "c474abcdad5b712f0875307d1f7e7d3f";

    @Test
    public void test_polish() {
        String text = "Litwo, Ojczyzno moja! ty jesteś jak zdrowie;\n" +
                      "Ile cię trzeba cenić, ten tylko się dowie,\n" +
                      "Kto cię stracił. Dziś piękność twą w całej ozdobie\n" +
                      "Widzę i opisuję, bo tęsknię po tobie.";
        APIDetector apiDetector = new APIDetector(APIKey);
        String detect = apiDetector.detect(text);
        assertEquals(detect, "pl");
    }
}
