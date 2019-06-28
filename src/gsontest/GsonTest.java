/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsontest;

import com.google.gson.Gson;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
/**
 *
 * @author kevinnhan
 */
public class GsonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String path = "/Users/kevinnhan/Desktop/GsonTest/src/gsontest/assessment1.json";
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        Gson gson = new Gson();
        Assessment json = gson.fromJson(bufferedReader, Assessment.class);

        System.out.println(json.getClass());
        System.out.println(json.toString());
        System.out.println(json.title);
        
        //String converted = String.valueOf(json.questions[0]);
        //System.out.println(converted);
        
        //MultiChoice question1 = gson.fromJson(converted, MultiChoice.class);
        //System.out.println(question1.text);

    }
    
}
