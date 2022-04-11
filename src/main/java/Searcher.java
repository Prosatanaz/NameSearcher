import java.util.*;

public class Searcher {
    public static void findoffenestName(List<String> names) {
        Map<String, Integer> entryOfNames = new HashMap<>();
        for (String name : names) {

            if (entryOfNames.containsKey(name)) {
                entryOfNames.put(name, entryOfNames.get(name) + 1);
            } else {
                entryOfNames.put(name, 1);
            }

        }
        int maxEntry = 0;


        for (Map.Entry<String, Integer> value : entryOfNames.entrySet()) {

            if (maxEntry < value.getValue()) {
                maxEntry = value.getValue();

            }
        }
        for (Map.Entry<String, Integer> value : entryOfNames.entrySet()) {
            Set<String> frequentNames = entryOfNames.keySet();

            for (String name : frequentNames) {

                if (entryOfNames.get(name) == maxEntry) {

                    System.out.println(name);
                }
            }
        }
    }
}












