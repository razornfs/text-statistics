package js.text.statistics;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StatisticsTest {

    @Test
    public void getWordsMap_test(){
        String text = "Ala ala ma kota.";
        Map<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("ala",2);
        wordCounts.put("ma",1);
        wordCounts.put("kota",1);
        assertEquals(wordCounts, Statistics.getWordsMap(text));
    }
}
