package com.Aperion.ShareGram.Model;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class CurrentUser {

    public static String getCurrentUsername(){
        Authentication authentication=
                SecurityContextHolder.getContext().getAuthentication();
        if(authentication==null || !authentication.isAuthenticated()){
            throw new RuntimeException("User Not Authneticated");
        }
        return authentication.getName();
    }
}
