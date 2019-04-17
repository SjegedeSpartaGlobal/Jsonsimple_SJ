package com.sparta.sj;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class UserDetailsTest {
    private UserDetails usr = new UserDetails("Bob", 21, "bob@thegreathonourablebob.com");

    @Test
    public void UserDetailsIsJSONObject (){
        Assert.assertTrue(usr.getUserDetails() instanceof JSONObject);

    }

    @Test
    public void validateUserDetails(){
        Assert.assertEquals(usr.getUserDetails().get("name"), "Bob");
    }

    @Test
    public void valiateEmail(){
//        Assert.assertTrue(usr.getUserDetails().get("email"));
    }
}
