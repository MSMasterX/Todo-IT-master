package org.example.DAO;

import org.example.Model.Person;

import java.util.Collection;

public class PersonDAOCollection implements PersonDAO{

    Collection<Person> people;


    public PersonDAOCollection(Collection<Person> People ) {
        this.people = people;
    }


    @Override
    public Person persist(Person person) {
        return null;
    }

    @Override
    public Person findbyId(int id) {
        return null;
    }

    @Override
    public Person findbyEmail(String email) {
        for(Person p: people){
            if(p.getEmail().equals(email)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return people;
    }

    @Override
    public void remove(int id) {
        people.remove(findbyId(id));
        System.out.println(people);

    }
}
