/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filesandstrings.fileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MIDP9
 */
public class WriterManager {
    
    public static String directory = System.getProperty("user.home");
    
    public static void saveText(String fileName, String text) {
        String filePath = directory + File.separator + fileName;
        FileWriter w;
        try {
            w = new FileWriter(filePath);
            w.write(text);
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(WriterManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
