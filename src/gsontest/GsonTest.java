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

        String question_title = gson.fromJson(array.get(0), String.class);
        String question_id = gson.fromJson(array.get(1), String.class);
        Assessment assessment = new Assessment(question_title, question_id);
        

        for (int i = 2; i < array.size(); i += 2) {
            Question question = gson.fromJson(array.get(i), Question.class);
            assessment.addQuestion(question);
            String question_type = question.type;
            switch (question_type) {
                case "MultiChoice":
                    MultiChoiceFeedback feedback1 = gson.fromJson(array.get(i + 1), MultiChoiceFeedback.class); 
                    System.out.println(feedback1.correct_feedback);
                    break;
                case "Checkbox":
                    CheckboxFeedback feedback2 = gson.fromJson(array.get(i + 1), CheckboxFeedback.class);
                    System.out.println(feedback2.missing_feedback);
                    break;
            }
        }
//        
//        System.out.println(assessment.title);
//        System.out.println(assessment.id);
//        for (int i = 0; i < assessment.questions.size(); i++)
//            System.out.println(assessment.questions.get(i).text);
        
    }
    
}
