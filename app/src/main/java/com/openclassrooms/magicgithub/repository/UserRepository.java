package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser == > UTILISER

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier ==> MODIFIÉ
        //code AISSATA

        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // TODO: A modifier==> MODIFIÉ
        //code AISSATA

      apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A modifier==> MODIFIÉ
        //code AISSATA
        apiService.deleteUser(user);
    }
}
