import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


public class Zad2 {
    public String convertToCSV(String[] data) {
        StringBuilder sb = new StringBuilder();
        for (String s : data) {
            sb.append(s);
            if (!Objects.equals(s, data[data.length - 1])) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public List<String[]> readCSV(String fileName) {
        List<String[]> dataLines = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                dataLines.add(line);
            }
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return dataLines;
    }

    public void main(String[] args) {
        final String CSV_FILE_NAME = "test.csv";

        List<String[]> dataLines = new ArrayList<>();
        dataLines.add(new String[]{"John", "Doe", "38", "Comment", "Another comment"});
        dataLines.add(new String[]{"Jane", "Doe, Jr.", "19", "She said \"I'm being quoted\""});

        File csvOutputFile = new File(CSV_FILE_NAME);
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            dataLines.stream().map(this::convertToCSV).forEach(pw::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<String[]> dataLines2 = readCSV(CSV_FILE_NAME);
        dataLines2.forEach(x -> System.out.println(STR."\{x[0]} \{x[1]} \{x[2]} \{x[3]} \{x[4]}"));
    }
}
