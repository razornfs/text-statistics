package js.text.statistics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostPopularStatisticsTest {

    @Test
    public void test_MostPopularWordsStatistics_interpret(){

        Statistics st = new MostPopularWordsStatistics();
        assertEquals("Najpopularniejsze słowa to ala, ma, kota",
                st.interpret("Ala, ala, ala, ala, ala, ma, ma, ma, ma, kota, kota, kota, ja, ty on"));
    }
}
