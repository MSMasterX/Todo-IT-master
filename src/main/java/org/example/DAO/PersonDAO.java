package org.example.DAO;

import org.example.Model.Person;

import java.util.Collection;

public interface PersonDAO {

    Person persist(Person person);
    Person findbyId(int id);
    Person findbyEmail(String email);
    Collection<Person> findAll();
    void remove(int id);
}
