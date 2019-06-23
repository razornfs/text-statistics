package js.text.statistics;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostPopularWordsStatistics implements Statistics<List<Map.Entry<String, Long>>> {

    @Override
    public List<Map.Entry<String, Long>> analyse(String text) {
        return Statistics.getWordsMap(text).entrySet().stream()
        .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
        .limit(3)
        .collect(Collectors.toList());

    }

    @Override
    public String interpret(String text) {

        return String.format("Najpopularniejsze słowa to %s, %s, %s",
                analyse(text).get(0).getKey(),
                analyse(text).get(1).getKey(),
                analyse(text).get(2).getKey()
                );

    }
}
