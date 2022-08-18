package org.example.Model;

import org.example.Model.Person;

import java.time.LocalDate;

public class Todoltem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public int getId(){
        return id;
    }
    public String getTitle(){
        return  title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTaskDescription(){
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine){
        this.deadLine = deadLine;
    }

    public void setDone(boolean done){
        this.done = done;

    }

    public boolean isDone(){
        return done;
    }

    public Person getCreator(){
        return  creator;
    }

    public void setCreator(Person creator){
        this.creator = creator;
    }

    public boolean isOverdue(){
        return true;
    }


    public String getSummary(){
        return " ID: " + id + " Title:" + title + " TaskDescription: " + taskDescription + " DeadLine: " + deadLine + " Done: " + done + " Creator: " + creator;
    }

}


