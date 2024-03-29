package cphbusiness.ufo.letterfrequencies;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.toMap;

/**
 * Frequency analysis Inspired by
 * https://en.wikipedia.org/wiki/Frequency_analysis
 *
 * @author kasper
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //String fileName = "C:\\Users\\Meow\\Desktop\\School\\UFO\\letterfrequencies-master\\src\\main\\java\\cphbusiness\\ufo\\letterfrequencies\\test.txt";
        String fileName = "C:\\Users\\Meow\\Desktop\\School\\UFO\\week2\\letterfrequencies-master\\src\\main\\resources\\FoundationSeries.txt";
        Reader reader = new FileReader(fileName);
        Map<Integer, Integer> freq = new HashMap<>();
        tallyChars(reader, freq);
        print_tally(freq);
    }

    private static void tallyChars(Reader reader, Map<Integer, Integer> freq) throws IOException {
        int b;
        while ((b = reader.read()) != -1) {
            try {
                freq.put(b, freq.get(b) + 1);
            } catch (NullPointerException np) {
                freq.put(b, 1);
            };
        }
    }

    private static void print_tally(Map<Integer, Integer> freq) {
        int dist = 'a' - 'A';
        Map<Character, Integer> upperAndlower = new LinkedHashMap();
        for (Character c = 'A'; c <= 'Z'; c++) {
            upperAndlower.put(c, freq.getOrDefault(c, 0) + freq.getOrDefault(c + dist, 0));
        }
        Map<Character, Integer> sorted = upperAndlower
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));
        for (Character c : sorted.keySet()) {
            System.out.println("" + c + ": " + sorted.get(c));;
        }
    }
}
