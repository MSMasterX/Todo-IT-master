package org.example.DAO;

import org.example.Model.TodoltemTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO {

    HashMap<Integer, TodoltemTask > state = new HashMap<>();

    @Override
    public TodoItemDAO persist(TodoltemTask todoltemTask) {
        return (TodoItemDAO) todoltemTask;
    }

    @Override
    public TodoltemTask findById(int id) {
        return state.get(id);
    }

    @Override
    public List<TodoltemTask> findAll() {
        return (List<TodoltemTask>) state.values();
    }

    @Override
    public List<TodoltemTask> findByAssignedStatus(Boolean status) {
        ArrayList<TodoltemTask> findAssigned = new ArrayList<>();
        return findAssigned;
    }

    @Override
    public List<TodoltemTask> findByPersonId(int PersonId) {
        ArrayList<TodoltemTask> findPerson = new ArrayList<>();
        return findPerson;
    }

    @Override
    public void remove(int id) {
        state.remove(id);

    }
}
