package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileService {

    public Set <String> readPokerHands(String filename) {
        // instatiate new hashset
        Set<String> pokerHands = new HashSet<>();
        String csvFile = "PokerHands.csv";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                pokerHands.add(parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pokerHands;
    }
}
