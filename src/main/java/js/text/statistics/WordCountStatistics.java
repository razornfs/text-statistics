package js.text.statistics;

public class WordCountStatistics implements Statistics<Long>{

    @Override
    public Long analyse(String text) {
        return Statistics.getWordsMap(text)
                .values()
                .stream()
                .reduce(Long::sum)
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public String interpret(String text) {
        return String.format("Tekst zawiera %d słów", analyse(text));
    }
}



