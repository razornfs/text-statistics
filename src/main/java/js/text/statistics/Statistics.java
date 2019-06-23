package js.text.statistics;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

public interface Statistics<T> {

    T analyse(String text);
    String interpret(String text);

    static Map<String, Integer> getWordsMap(String input){
        input = input.toLowerCase().replaceAll("[^a-z\\s]+","");
        return Arrays.stream(
                input.split(" "))
                .filter(e -> e.length() >= 1)
                .collect(Collectors.groupingBy(
                        Function.identity(), summingInt(e -> 1)));


    }
}
