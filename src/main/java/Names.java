import org.jetbrains.annotations.NotNull;

import java.util.*;


public class Names {
    public static List<String> GetNames(@NotNull List<String> scannedString) {
        List<String> names = new ArrayList<>();

        for (String string : scannedString) {

            String delimiter = " ";
            String[]  subString;
            subString = string.split(delimiter);
            names.add( subString[1]);

        }
        return names;
    }
}
