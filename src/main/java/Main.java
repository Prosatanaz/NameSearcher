import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> names = Names.GetNames(ReadFile.readFileByStrings());
        Searcher.findFriquentName(names);
    }
}
