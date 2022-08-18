package org.example.DAO;

import org.example.Model.Todoltem;

import java.util.Collection;
import java.util.Locale;

public interface TodoItemDAO {


    Todoltem persist(Todoltem todoltem);
    Todoltem findById (int id);

    Todoltem findbyId(int id);

    Collection<Todoltem> findAll();
    Collection<Todoltem> findallByDoneStatus(Boolean done);
    Collection<Todoltem> findbyTitleContains(String Title);
    Collection<Todoltem> findByPersonId( int personId);
    Collection<Todoltem> findByDeadlineBefor(Locale Date);
    Collection<Todoltem> FindByDeadlineAfter(Locale Date);
    void remove(int id);
}
