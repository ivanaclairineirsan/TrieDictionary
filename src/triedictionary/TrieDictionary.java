/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triedictionary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivana
 */
public class TrieDictionary {

    /**
     * @param args the command line arguments
     */
     public List<String> readFile(String filePath) throws FileNotFoundException, IOException{
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
            }
        }
         return null;

    }
    
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        List<String> words = readFile("dictionary.txt");
    }
    
}
