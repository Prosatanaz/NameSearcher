import java.util.*;

public class Searcher {
    public static void findFriquentName(List<String> names) {
        Map<String, Integer> entryOfNames = new HashMap<>();
        for (String name : names) {

            if (entryOfNames.containsKey(name)) {
                entryOfNames.put(name, entryOfNames.get(name) + 1);
            } else {
                entryOfNames.put(name, 1);
            }
        }
        int maxEntriesCount = 0;

        for (Integer entriesCount : entryOfNames.values()) {

            if (maxEntriesCount < entriesCount) {
                maxEntriesCount = entriesCount;
            }
        }
        Set<String> frequentNames = entryOfNames.keySet();

        for (String name : frequentNames) {

            if (entryOfNames.get(name) == maxEntriesCount) {

                System.out.println(name);
            }
        }
    }
}












