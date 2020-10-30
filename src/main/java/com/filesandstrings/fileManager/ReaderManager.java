/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filesandstrings.fileManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MIDP9
 */
public class ReaderManager {
    public static String directory = System.getProperty("user.home");
    public static String filePath = directory + File.separator + "default.txt";
        
    public static String readMyFile(String fileName) {
        String text = "";
        filePath = directory + File.separator + fileName;
        try {
            FileReader r = new FileReader(filePath);
            BufferedReader br = new BufferedReader(r);
            String line;
            while( (line = br.readLine()) != null ){
                text = text.concat(line);
            }
            br.close();
            r.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReaderManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReaderManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return text;
    }
    
    public static Integer wordCounter(String text){
        String [] separedWords = text.split("\\s");
        return separedWords.length;
    }
    
    public static Integer characterCount(String text){
        text = text.replace("\\s", "");
        return text.length();
    }
}
