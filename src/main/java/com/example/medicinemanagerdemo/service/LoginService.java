package com.example.medicinemanagerdemo.service;

import com.example.medicinemanagerdemo.model.Login;
import com.example.medicinemanagerdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private UserRepository repo;

//    public Login login(String username, String password) {
//        Login login = repo.findByUsernameAndPassword(username, password);
//        return login;
//    }
}
