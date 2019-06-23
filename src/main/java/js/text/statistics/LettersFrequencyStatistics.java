package js.text.statistics;

import java.util.HashMap;
import java.util.Map;

public class LettersFrequencyStatistics implements Statistics<Map<Character, Integer>> {



    @Override
    public Map<Character, Integer> analyse(String text) {

        text = text.toLowerCase().replaceAll("[^a-z]", "");

        Map<Character, Integer> lettersMap = new HashMap<>();

        for(int j = 97; j <= 122; j++){
            lettersMap.put((char) j, 0);
        }

        for(int i = 0; i < text.length(); i++){
            lettersMap.replace(text.charAt(i), lettersMap.get(text.charAt(i)), lettersMap.get(text.charAt(i)) + 1 );
        }


        return lettersMap;
    }

    @Override
    public String interpret(String text) {
        return null;
    }
}
