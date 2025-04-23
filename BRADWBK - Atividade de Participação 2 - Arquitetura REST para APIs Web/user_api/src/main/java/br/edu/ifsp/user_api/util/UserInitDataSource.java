package br.edu.ifsp.user_api.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInitDataSource implements CommandLineRunner {

    @Autowired
    UserDataSource uDataSource;

    @Override
    public void run(String... args) throws Exception {
        uDataSource.initializeTestData();
    }
}