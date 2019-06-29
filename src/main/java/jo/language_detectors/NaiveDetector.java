package jo.language_detectors;

import js.text.statistics.LettersFrequencyStatistics;

import java.util.Map;

public class NaiveDetector implements LanguageDetector {
    @Override
    public String detect(String text) {
        text = text.toLowerCase();

        LettersFrequencyStatistics statistics = new LettersFrequencyStatistics();
        Map<Character, Double> map = statistics.analyse(text);
        double minDeviation = standardDeviation(map, LanguagesData.englishMap);
        String language = "";

        for (Map.Entry<String, Map<Character, LetterStat>> entry : LanguagesData.languageMaps.entrySet()) {
            double deviation = standardDeviation(map, entry.getValue());
            if (deviation < minDeviation) {
                minDeviation = deviation;
                language = entry.getKey();
            }
        }
        return language;
    }

    private double standardDeviation(Map<Character, Double> textMap, Map<Character, LetterStat> languageMap) {
        double deviation = 0;
        for (Map.Entry<Character, Double> entry : textMap.entrySet()) {
            double textValue = entry.getValue();
            LetterStat languageValue = languageMap.get(entry.getKey());
            if (languageValue == null) {
                return Double.POSITIVE_INFINITY;
            }
            deviation += Math.pow(textValue - languageValue.getPercent(), 2);
        }
        return deviation;
    }
}
