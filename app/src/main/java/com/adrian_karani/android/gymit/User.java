package com.adrian_karani.android.gymit;

public class User {

    private int id;
    private String firstname,lastname,username, email, gender;

    public User(int id,String firstname, String lastname, String username, String email, String gender) {
        this.id = id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.username = username;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
}


