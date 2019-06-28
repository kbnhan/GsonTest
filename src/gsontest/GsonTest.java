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
<<<<<<< HEAD

=======
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
>>>>>>> 276186b9c314312f1f20425e031daecf916b9265
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
<<<<<<< HEAD
=======
        
>>>>>>> 276186b9c314312f1f20425e031daecf916b9265
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        
        Gson gson = new Gson();
<<<<<<< HEAD
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

=======
        Assessment json = gson.fromJson(bufferedReader, Assessment.class);

        System.out.println(json.getClass());
        System.out.println(json.toString());
        System.out.println(json.title);
        
        //String converted = String.valueOf(json.questions[0]);
        //System.out.println(converted);
        
        //MultiChoice question1 = gson.fromJson(converted, MultiChoice.class);
        //System.out.println(question1.text);

>>>>>>> 276186b9c314312f1f20425e031daecf916b9265
    }
    
}
