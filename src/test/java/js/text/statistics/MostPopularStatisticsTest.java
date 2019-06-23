package js.text.statistics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostPopularStatisticsTest {

    @Test
    public void test_MostPopularWordsStatistics_interpret(){

        Statistics st = new MostPopularWordsStatistics();
        assertEquals("Najpopularniejsze słowa to: a b c d e f g h i j",
                st.interpret("a, a, b, b, c, c, d, d, e, e, f, f, g, g, h, h, i, i, j, j, l, m, n, o, p "));
    }
}
