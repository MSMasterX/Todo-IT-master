package org.example.DAO;

import org.example.Model.AppUser;

import java.util.Collection;
import java.util.HashMap;

public class AppUserDAOCollection  implements AppUserDAO {

    HashMap<String, AppUser> state = new HashMap<>();

    @Override
    public AppUser persist(AppUser appUser) {
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        return (AppUser) state.values();
    }

    @Override
    public Collection<AppUser> findAll() {
        return state.values();
    }

    @Override
    public void remove(String username) {
        state.remove(username);
        System.out.println("removed");

    }
}
