
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static List<String> readFileByStrings() throws IOException {

        String pathName = "F:\\Projects\\Students\\leha\\test.txt";
        Path paths = Paths.get(pathName);

        Scanner scanner = new Scanner(paths);
        List<String> scannedStrings = new ArrayList<>();

        while (scanner.hasNext()) {
            String scannedString = scanner.nextLine();
          scannedStrings.add(scannedString);
        }
        return scannedStrings;
    }
}

