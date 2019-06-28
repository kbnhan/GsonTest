/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsontest;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
        JsonParser parser = new JsonParser();
        JsonArray array = parser.parse(bufferedReader).getAsJsonArray();
        String question1_title = gson.fromJson(array.get(0), String.class);
        String question1_id = gson.fromJson(array.get(1), String.class);
        // Can use for loop for this part
        Question question1 = gson.fromJson(array.get(2), Question.class);
        Question question2 = gson.fromJson(array.get(3), Question.class);
        
        Assessment assessment = new Assessment(question1_title, question1_id);
        assessment.addQuestion(question1);
        assessment.addQuestion(question2);
        
        System.out.println(assessment.title);
        System.out.println(assessment.id);
        for (int i = 0; i < assessment.questions.size(); i++)
            System.out.println(assessment.questions.get(i).text);
        
    }
    
}
