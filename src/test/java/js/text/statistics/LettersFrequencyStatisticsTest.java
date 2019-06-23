package js.text.statistics;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LettersFrequencyStatisticsTest {

    @Test
    public void testLettersFrequencyStatistics(){
        LettersFrequencyStatistics lfs = new LettersFrequencyStatistics();


        Map<Character, Integer> lettersFrequency = new HashMap<>();

        for(int j = 97; j <= 122; j++){
            lettersFrequency.put((char) j, 0);
        }

        lettersFrequency.replace('a', 0, 3);
        lettersFrequency.replace('b', 0, 2);
        lettersFrequency.replace('c', 0, 1);

        assertEquals(lettersFrequency, lfs.analyse("aaa bb c") );
    }
}
