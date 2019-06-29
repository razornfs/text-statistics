package js.text.statistics;

import java.util.Map;
import java.util.stream.Collectors;

public class LettersFrequencyStatistics implements Statistics<Map<Character, Double>> {

    @Override
    public Map<Character, Double> analyse(String text) {
        Map<Character, Long> map = text
                .chars()
                .mapToObj(x -> (char) x)
                .map(c -> c.toString().toLowerCase())
                .filter(c -> c.matches("\\p{L}"))
                .map(x -> x.charAt(0))
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));

        Long total_value = map.values()
                .stream()
                .reduce(Long::sum)
                .orElseThrow(IllegalArgumentException::new);

        return map
                .entrySet()
                .stream()
                .collect(Collectors.toMap(e -> e.getKey(),
                        e -> (e.getValue().doubleValue() / total_value) * 100.0));


}

    @Override
    public String interpret(String text) {
        return null;
    }

}
