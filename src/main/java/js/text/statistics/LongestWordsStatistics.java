package js.text.statistics;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestWordsStatistics implements Statistics<List<String>> {

    @Override
    public List<String> analyse(String text) {
        return Statistics.getWordsMap(text)
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .sorted((x,y) -> x.getKey().length() - y.getKey().length())
                .limit(10)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    @Override
    public String interpret(String text) {
        return null;
    }
}
