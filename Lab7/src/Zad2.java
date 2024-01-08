import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

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

    // Method to read from a text file
    public List<String> readTxt(String fileName) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Error reading from text file: " + fileName, e);
        }
    }

    // Method to write to a text file
    public void writeTxt(String fileName, List<String> dataLines) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            for (String line : dataLines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing to text file: " + fileName, e);
        }
    }

    // only write comments in this file
    public static void main(String[] args) {
        final String CSV_FILE_NAME = "test.csv";
        final String TXT_FILE_NAME = "test.txt";
        Zad2 zad2 = new Zad2();

        // Writing to a CSV file
        List<String[]> dataLines = new ArrayList<>();
        dataLines.add(new String[]{"John", "Doe", "38", "Comment", "Another comment"});
        dataLines.add(new String[]{"Jane", "Doe, Jr.", "19", "She said 'Im being quoted'"});

        File csvOutputFile = new File(CSV_FILE_NAME);
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            // mapping data to CSV format using the method defined above
            dataLines.stream().map(zad2::convertToCSV).forEach(pw::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Reading from a CSV file
        List<String[]> dataLines2 = zad2.readCSV(CSV_FILE_NAME);
        dataLines2.forEach(x -> System.out.println(String.join(",", x)));

        // Writing to a text file
        List<String> txtDataLines = List.of("Line 1", "Line 2", "Line 3");
        zad2.writeTxt(TXT_FILE_NAME, txtDataLines);

        // Reading from a text file
        List<String> readTxtDataLines = zad2.readTxt(TXT_FILE_NAME);
        readTxtDataLines.forEach(System.out::println);
    }
}
