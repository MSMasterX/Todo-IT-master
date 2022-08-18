package org.example.DAO;

import org.example.Model.TodoltemTask;

import java.util.List;

public interface TodoItemTaskDAO {

    TodoItemDAO persist(TodoltemTask todoltemTask);
    TodoltemTask findById(int id);
    List<TodoltemTask> findAll();
    List<TodoltemTask> findByAssignedStatus(Boolean status);
    List<TodoltemTask> findByPersonId(int PersonId);
    void remove(int id);
}
