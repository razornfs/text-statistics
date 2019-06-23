package js.text.statistics;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StatisticsTest {

    @Test
    public void testGetWordsMap(){
        String text = "Ala ala ma kota.";
        Map<String, Long> wordCounts = new HashMap<>();
        wordCounts.put("ala",2L);
        wordCounts.put("ma",1L);
        wordCounts.put("kota",1L);
        assertEquals(wordCounts, Statistics.getWordsMap(text));
    }
}
