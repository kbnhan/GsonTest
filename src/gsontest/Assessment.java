/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsontest;

import java.util.ArrayList;

/**
 *
 * @author kevinnhan
 */
public class Assessment {
    
    public String title;
    public String id;
    public ArrayList<Question> questions;
    public ArrayList<Object> question_feedback;
    
    public Assessment(String title, String id) {
        this.title = title;
        this.id = id;
        this.questions = new ArrayList<Question>();
        this.question_feedback = new ArrayList<Object>();
    }
    
    public void addQuestion(Question question) {
        this.questions.add(question);
    }
    
    public void addFeedback(Object feedback) {
        this.question_feedback.add(feedback);
    }
    
}
