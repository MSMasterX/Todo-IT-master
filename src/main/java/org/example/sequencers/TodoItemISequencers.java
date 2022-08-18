package org.example.sequencers;

public class TodoItemISequencers {

    private static int currentId;

    public static int nextId() {
        return ++currentId;
    }
    public static int getCurrentId(){
        return currentId;
    }
    public static void setCurrentId(int currentId){
        TodoItemISequencers.currentId = currentId;
    }
}
