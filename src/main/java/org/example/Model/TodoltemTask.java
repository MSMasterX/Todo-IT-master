package org.example.Model;

import org.example.Model.Person;
import org.example.Model.Todoltem;

public class TodoltemTask {

    private int id;
    private boolean assigned;
    private Todoltem todoltem;
    private Person assignee;


    public int getId(){
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }
    public void setAssigned(Person assignee) {
            if (assignee != null) {
                this.assigned = true;
        }
    }

    public Todoltem getTodoltem() {
        return todoltem;
    }

    public void SetTodoltem(Todoltem todoltem){
            if (todoltem == null){
        }
        this.todoltem = new Todoltem();
    }
    else{
        this.todoltem = todoltem;
    }

    private Person getAssignee(){
        return assignee;
    }

    public void setAssignee(Person assignee){
        this.assignee = assignee;
    }

    public String getSummary () {
        return (" ID: " + id + " assigned: " + assigned + " Todoltem: " + todoltem + " assignee: " + assignee);
    }
}
