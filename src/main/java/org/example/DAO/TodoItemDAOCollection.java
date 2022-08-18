package org.example.DAO;

import org.example.Model.Todoltem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;

public class TodoItemDAOCollection implements TodoItemDAO {

    HashMap<Integer, Todoltem> state = new HashMap<>();


    @Override
    public Todoltem persist(Todoltem todoltem) {
        return todoltem;
    }

    @Override
    public Todoltem findById(int id) {
        return state.get(id);
    }

    @Override
    public Todoltem findbyId(int id) {
        return state.get(id);
    }

    @Override
    public Collection<Todoltem> findAll() {
        return state.values();
    }

    @Override
    public Collection<Todoltem> findallByDoneStatus(Boolean done) {
        ArrayList<Todoltem> findAllDone = new ArrayList<>();
        return findAllDone;
    }

    @Override
    public Collection<Todoltem> findbyTitleContains(String Title) {
        ArrayList<Todoltem> findTitle = new ArrayList<>();
        return findTitle;
    }

    @Override
    public Collection<Todoltem> findByPersonId(int personId) {
        ArrayList<Todoltem> findPerson = new ArrayList<>();
        return findPerson;
    }

    @Override
    public Collection<Todoltem> findByDeadlineBefor(Locale Date) {
        ArrayList<Todoltem> findBefor = new ArrayList<>();
        return findBefor;
    }

    @Override
    public Collection<Todoltem> FindByDeadlineAfter(Locale Date) {
        ArrayList<Todoltem> findAfter = new ArrayList<>();
        return findAfter;
    }

    @Override
    public void remove(int id) {
        state.remove(id);

    }
}
