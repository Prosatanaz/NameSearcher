import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class readfile {
    public static ArrayList<String> read() throws IOException {

        String fileName = "F:\\Projects\\Students\\leha\\test.txt";
        Path paths = Paths.get(fileName);

        Scanner scanner = new Scanner(paths);
        ArrayList<String> namesAndSurnames = new ArrayList<>();
        while (scanner.hasNext()) {
            String nameAndSurname = scanner.nextLine();
          namesAndSurnames.add(nameAndSurname);
        }
        return namesAndSurnames;


    }


}

