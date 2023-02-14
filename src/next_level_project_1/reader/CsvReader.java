package next_level_project_1.reader;
import next_level_project_1.csv.MockCsv;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<List<String>> readFile() {
        List<List<String>> files = new ArrayList<>();
        files.add(MockCsv.CSV_STR_1);
        files.add(MockCsv.CSV_STR_2);
        return files;

    }
}
