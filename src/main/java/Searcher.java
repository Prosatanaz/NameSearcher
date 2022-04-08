import java.util.*;

public class Searcher {
    public static void findoffenestName(ArrayList<String> names) {
        Map<String, Integer> entryOfNames = new HashMap<>();
        for (String name : names) {

            if (entryOfNames.containsKey(name)) {
                entryOfNames.put(name, entryOfNames.get(name) + 1);
            } else {
                entryOfNames.put(name, 1);
            }
            System.out.println(entryOfNames);
        }
        int maxEntry = 0;
        String result = null;

        for (Map.Entry<String, Integer> value : entryOfNames.entrySet()) {
            if (maxEntry < value.getValue()) {
                result = value.getKey();
                maxEntry = value.getValue();

            }
            if (value.getValue().equals(maxEntry)) {
                System.out.println(value.getKey());
            }

        }


    }

}










