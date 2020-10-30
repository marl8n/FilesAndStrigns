/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filesandstrings.fileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MIDP9
 */
public class DirectoryManager {
    
    public static String filesPath = System.getProperty("user.home");
    
    public static String[] getDirectoriesAsArrayString() {
        File f = new File(filesPath);
        String[] a = f.list();
        return a;
    }
}
