package org.example.Model;

public class AppUser {

    private String username;

    private String password;

    AppRole role;

    public AppUser()(String username, String password, AppRole role) {
    this.username = username;
    this.password = password;
    this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }
    @Override
    public boolean equeals(Object o) {
        if(this == o) return true;
        if(!(o instanceof AppUser)) return false;
        AppUser appUser = (AppUser)o;
        return getUsername().equals(appUser.getUsername()) && getPassword().equals(appUser.getPassword());


    }
}
