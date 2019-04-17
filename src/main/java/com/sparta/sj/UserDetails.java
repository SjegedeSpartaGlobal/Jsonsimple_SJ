package com.sparta.sj;

import org.json.simple.JSONObject;

public class UserDetails {

    private JSONObject userDetails = new JSONObject();
    private String name;
    private int age;
    private String email;

    public UserDetails(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;

        userDetails.put("name", name);
        userDetails.put("age", age);
        userDetails.put("email", email);
    }

    public JSONObject getUserDetails() {
        return userDetails;
    }


}
