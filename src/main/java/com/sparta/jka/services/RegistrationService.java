package com.sparta.jka.services;

import com.sparta.jka.components.User;

import javax.ejb.Stateless;
import javax.inject.Named;

@Named
@Stateless
public class RegistrationService {
    public String registerUser(User user) {

        return "welcome";
    }
}
