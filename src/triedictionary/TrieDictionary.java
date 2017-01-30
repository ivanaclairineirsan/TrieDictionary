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
import java.util.Scanner;

/**
 *
 * @author ivana
 */
public class TrieDictionary {
    
    Dictionary dictionary = new Dictionary();

    /**
     * @param args the command line arguments
     */
     public void readAndProcessFile(String filePath) throws FileNotFoundException, IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                dictionary.insert(line.toLowerCase());
                System.out.println(line);
            }
        }
    }

     
    
    public static void main(String[] args) throws IOException {
        TrieDictionary treeDictionary = new TrieDictionary();
        treeDictionary.readAndProcessFile("dictionary.txt");
       
        Scanner in = new Scanner(System.in);
        System.out.print("Cari kata? (Y/N): ");
        String option = in.nextLine();
        
        if(option.equals("Y"))
        {
            System.out.print("Masukkan kata: ");
            String keyword = in.nextLine();
            System.out.println("Kata kunci: " + keyword + ", isFound?: "+ treeDictionary.dictionary.search(keyword.toLowerCase()));
        }
        
    }
    
}
