import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        List<passenger> passengers = new ArrayList<>();

        // Read CSV file
        try (BufferedReader br = new BufferedReader(new FileReader("train.csv"))) {
            br.readLine(); // skip header row

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                // Handle quoted fields and commas inside quotes
                List<String> fields = new ArrayList<>();
                StringBuilder sb = new StringBuilder();
                boolean inQuotes = false;
                for (char c : line.toCharArray()) {
                    if (c == '"') {
                        inQuotes = !inQuotes;
                    } else if (c == ',' && !inQuotes) {
                        fields.add(sb.toString());
                        sb.setLength(0);
                    } else {
                        sb.append(c);
                    }
                }
                fields.add(sb.toString());
                data = fields.toArray(new String[0]);
                boolean survived = data[1].equals("1"); // survived?
                String sex = data[4];                   // male/female

                double age = 0;
                if (!data[5].trim().isEmpty()) {
                    age = Double.parseDouble(data[5].trim());
                }

                int pclass = Integer.parseInt(data[2].trim());

                // Create Passenger object
                passenger p = new passenger(survived, sex, age, pclass);
                passengers.add(p);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        
        int totalPassengers = passengers.size();
        int totalSurvivors = 0;
        int maleSurvivors = 0;
        int femaleSurvivors = 0;

        for (passenger p : passengers) {
            if (p.getSurvived()) {
                totalSurvivors++;
                if (p.getSex().equalsIgnoreCase("male")) maleSurvivors++;
                else femaleSurvivors++;
            }
        }

        //  Print results
        System.out.println("------ Titanic Data Analysis ------");
        System.out.println("Total passengers: " + totalPassengers);
        System.out.println("Total survivors: " + totalSurvivors);
        System.out.println("Male survivors: " + maleSurvivors);
        System.out.println("Female survivors: " + femaleSurvivors);
    }
}
