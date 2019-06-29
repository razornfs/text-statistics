package jo.language_detectors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NaiveDetectorTest {

    private
    NaiveDetector naiveDetector = new NaiveDetector();

    @Test
    public void test_polish() {
        String text = "Litwo, Ojczyzno moja! ty jesteś jak zdrowie;\n" +
                      "Ile cię trzeba cenić, ten tylko się dowie,\n" +
                      "Kto cię stracił. Dziś piękność twą w całej ozdobie\n" +
                      "Widzę i opisuję, bo tęsknię po tobie.";
        String detect = naiveDetector.detect(text);
        assertEquals(detect, "polish");
    }

    @Test
    public void test_english() {
        String text =
                "Concerns greatest margaret him absolute entrance nay. Door neat week do find past he." +
                " Be no surprise he honoured indulged. Unpacked endeavor six steepest had husbands her." +
                " Painted no or affixed it so civilly. Exposed neither pressed so cottage as proceed at offices." +
                " Nay they gone sir game four. Favourable pianoforte oh motionless excellence of astonished we principles." +
                " Warrant present garrets limited cordial in inquiry to. Supported me sweetness behaviour shameless excellent so arranging. ";
        String detect = naiveDetector.detect(text);
        assertEquals(detect, "english");
    }
}
