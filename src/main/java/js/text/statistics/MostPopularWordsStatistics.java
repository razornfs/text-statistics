package js.text.statistics;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostPopularWordsStatistics implements Statistics<List<String>> {

    @Override
    public List<String> analyse(String text) {
        return Statistics.getWordsMap(text).entrySet().stream()
        .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
        .limit(10)
         .map(e -> e.getKey())
        .collect(Collectors.toList());

    }

    @Override
    public String interpret(String text) {

        StringBuilder sb = new StringBuilder();
        sb.append("Najpopularniejsze słowa to: ");

        for(String i : analyse(text)){
            sb.append(i);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
